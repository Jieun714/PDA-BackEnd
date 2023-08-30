package drawer;

import java.awt.Point;

/**
 * '그리는 대상'을 나타내는 인터페이스 
 * */
public interface Drawable {
	/**
	 * canvas에 그림을 그리는 메소드 
	 * @param x x좌표
	 * @param y y좌표 
	 * */
	public abstract void draw(int x, int y);
}
