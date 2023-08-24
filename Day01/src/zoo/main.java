package zoo;

public class main {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.sing();
		bird.fly();
		System.out.println("=========================");		
		
		Sparrow spa = new Sparrow();
		spa.sing();
		spa.fly();
		System.out.println("=========================");
		
		Chicken chi = new Chicken();
		chi.sing();
		chi.fly();
	}
}
