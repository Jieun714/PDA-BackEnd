package zoo;

/**
 * 메인 클래스 
 * @author Jieun Lee
 * @version 1.0
 * */
public class main {

	public static void main(String[] args) {
		Bird bird = new Bird(2, "새야");
		bird.sing();
		bird.fly();
		System.out.println("=========================");		
		
		Sparrow spa = new Sparrow();
		spa.sing();
		spa.fly();
		System.out.println("=========================");
		
		Chicken chi = new Chicken(1, "삐약이");
		chi.sing();
		chi.fly();
	}
}
