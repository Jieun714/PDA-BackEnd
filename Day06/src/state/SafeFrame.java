package state;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

/**
 * GUI를 사용하여 금고 경비 시스템을 실현하는 클래스  
 * */
public class SafeFrame extends Frame implements ActionListener, Context {
	private TextField textClock = new TextField(60); // 현재 시간 표시
	private TextArea textScreen = new TextArea(10, 60); // 경비 센터 출력
	private Button btnUse = new Button("금고 사용");
	private Button btnAlarm = new Button("비상벨");
	private Button btnPhone = new Button("일반 통화");
	private Button btnExit = new Button("금고 사용 종료");

	/**
	 * 처음 state는 DAY로 설정
	 */
//	private State state = getInstance(StateType.DAY);
	private State state = DayState.getInstance();

	/**
	 * StateType 설정 
	 * */
	private StateType stateType = StateType.DAY;
	
	/**
	 * 시간과 상태를 담을 hashMap 선언
	 */
	private HashMap<Integer, StateType> stateMap = new HashMap<>();
	
	/**
	 * 상태를 추가하는 메소드
	 * */
	private void addState() {
		for (int hour = 0; hour < 24; hour++) {
			if(12 <= hour && hour <= 13) {
				stateMap.put(hour, StateType.LUNCH);
			} else if(9 <= hour && hour < 17) {
				stateMap.put(hour, StateType.DAY);
			} else if(hour < 9 || 17 <= hour) {
				stateMap.put(hour, StateType.NIGHT);
			}
		}
	}

	public SafeFrame(String title) {
		super(title);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());

		// textClock 배치
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);

		// textScreen 배치
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);

		// 패널에 버튼 저장
		Panel panel = new Panel();
		panel.add(btnUse);
		panel.add(btnAlarm);
		panel.add(btnPhone);
		panel.add(btnExit);

		// 그 패널을 배치
		add(panel, BorderLayout.SOUTH);

		// 표시
		pack();
		setVisible(true);

		// 리스너 설정
		btnUse.addActionListener(this);
		btnAlarm.addActionListener(this);
		btnPhone.addActionListener(this);
		btnExit.addActionListener(this);
		
		// 최소의 1회만 hashMap을 업데이트하도록 
		addState();
	}

	/**
	 * 버튼이 눌리면 해당 메소드 호출
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		if (e.getSource() == btnUse) {
			state.doUse(this);
		} else if (e.getSource() == btnAlarm) {
			state.doAlarm(this);
		} else if (e.getSource() == btnPhone) {
			state.doPhone(this);
		} else if (e.getSource() == btnExit) {
			System.exit(0);
		} else {
			System.out.println("?");
		}
	}

	/**
	 * 시간 설정
	 */
	@Override
	public void setClock(int hour) {
		String clockstring = String.format("현재 시간은 %02d:00", hour);
		System.out.println(clockstring);
		textClock.setText(clockstring);
		
		StateType currentState = stateMap.get(hour); //현재 상태 
		
		if(currentState != null && !this.stateType.equals(currentState)) { //현재의 상태와 다르다면 
			State current = currentState.getInstance(); //현재 상태의 싱글톤 객체를 알아오기 
			changeState(current); //상태 전환 메소드 호출 
			this.stateType = currentState; //상태 업데이트 
		} //if end
	}

	/**
	 * 상태 전환
	 */
	@Override
	public void changeState(State state) {
		System.out.println(this.state + " 에서 " + state + "으로 상태가 변화했습니다.");
		this.state = state; // 상태 값 변경
	}

	/**
	 * 경비 센터 경비원 호출
	 */
	@Override
	public void callSecurityCenter(String msg) {
		textScreen.append("call!" + msg + "\n");
	}

	/**
	 * 경비 센터 기록
	 */
	@Override
	public void recordLog(String msg) {
		textScreen.append("record ..." + msg + "\n");
	}

}
