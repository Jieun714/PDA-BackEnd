package command;

/**
 * 명령을 나타내는 인터페이스 
 * */
public interface Command {
	/**
	 * 명령을 실행하는 메소드  
	 * */
	public abstract void execute();
}
