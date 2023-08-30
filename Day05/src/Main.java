
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import command.*;
import drawer.*;

public class Main extends JFrame implements MouseMotionListener, WindowListener {
	private MacroCommand history = new MacroCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearBtn = new JButton("clear");

	public Main(String title) {
		super(title);

		/**
		 * this에서 윈도우와 관련된 명령을 다 받아서 addWindowListener로 전달
		 */
		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearBtn.addActionListener(e -> {
			history.clear();
			canvas.repaint();
		});

		Box btnBox = new Box(BoxLayout.X_AXIS);
		btnBox.add(clearBtn); // 박스에 버튼 추가
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(btnBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		pack();
		setVisible(true); //보이도록 
	}
	
	/**
	 * MouseMotionListener용이지만 예제에서는 사용하지 않음 
	 * */
	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		Command cmd = new DrawCommand(canvas, e.getPoint());
		history.append(cmd);
		cmd.execute();
	}
	
	/**
	 * WindowListener용 
	 * */
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override public void windowOpened(WindowEvent e) {}
	@Override public void windowClosed(WindowEvent e) {}
	@Override public void windowIconified(WindowEvent e) {}
	@Override public void windowDeiconified(WindowEvent e) {}
	@Override public void windowActivated(WindowEvent e) {}
	@Override public void windowDeactivated(WindowEvent e) {}

	public static void main(String[] args) {
		/**
		 * 생성자 호출 
		 * */
		new Main("Command Pattern Sample");
	}

}
