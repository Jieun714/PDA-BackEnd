package command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 복수의 명령을 모으는 클래스 
 * */
public class MacroCommand implements Command{
	/**
	 * 명령을 담을 ArrayDeque 
	 */
	private Deque<Command> commands = new ArrayDeque<>();
	
	/**
	 * 복수명령을 실행하는 execute()를 호출하는 메소드 
	 * */
	@Override
	public void execute() {
		for(Command cmd: commands) {
			cmd.execute();
		}
	}

	/**
	 * 새로운 Command의 인스턴스를 추가하는 메소드 
	 * 적합하지 않거나(illegal) 적절하지 못한(inappropriate) 인자를 메소드에 넘겨주었을 경우 발생하는 exception
	 * @throws IllegalArgumentException 
	 * */
	public void append(Command cmd) {
		if(cmd == this) {
			throw new IllegalArgumentException("infinite loop caused by append");
		}
		commands.push(cmd);
	}
	
	/**
	 * 마지막 명령을 삭제하는 메소드   
	 * */
	public void undo() {
		if(!commands.isEmpty()) { //큐가 비어있지 않을 때 
			commands.pop(); //큐에서 제거
		}
	}
	
	/**
	 * 전부를 삭제하는 메소드 
	 * */
	public void clear() {
		commands.clear(); //큐에 담긴 내용을 모두 삭제 
	}
	
}
