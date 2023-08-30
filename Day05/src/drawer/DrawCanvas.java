package drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import command.MacroCommand;

/**
 * Drawable 인터페이스를 구현한 클래스 - java.awt.Canvas 클래스의 하위 클래스 
 * */
public class DrawCanvas extends Canvas implements Drawable {
	/**
	 * 그리는 색 
	 * */
	private Color color = Color.red;
	
	/**
	 * 그리는 점의 반지름 
	 * */
	private int radius = 6;
	
	/**
	 * 점의 이동을 담는 로그 
	 * */
	private MacroCommand history;
	
	/**
	 * 높이 너비 로그를 인자로 가지는 생성자 
	 * 캔버스를 초기화하기 위해 사용 
	 * */
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height); //캔버스 사이즈 지정 
		setBackground(Color.WHITE); //배경색 지정
		this.history = history;
	}
	
	/**
	 * 이력 전체 다시 그리는 메소드  
	 * */
	@Override
	public void paint(Graphics g) {
		history.execute();
	}
	
	/**
	 * 행동에 따라 그림을 그리는 메소드 
	 * */
	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}

}