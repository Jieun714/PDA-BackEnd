package drawer;

import java.awt.Point;

import command.Command;

/**
 * Cammand 인터페이스를 구현한 클래스 
 * */
public class DrawCommand implements Command {
	/**
	 * 그리는 대상 
	 * */
	protected Drawable drawable;

	/**
	 * 그리는 위치
	 * */
	private Point position;
	
	/**
	 * 두 개의 인자를 받는 생성자 
	 * */
	public DrawCommand(Drawable drawable, Point position) {
		this.drawable = drawable;
		this.position = position;
	}
	
	/**
	 * 명령을 실행하는 메소드 
	 * */
	@Override
	public void execute() {
		drawable.draw(position.x, position.y);
	}
}
