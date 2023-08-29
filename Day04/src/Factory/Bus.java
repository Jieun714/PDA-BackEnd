package Factory;

/**
 * Vehicle 인터페이스를 상속받는 클래스 
 * */
public class Bus implements Vehicle {

	/**
	 * 인터페이스의 메소드를 Override한 메소드 
	 * Bus 클래스의 메소드임을 확인하기 위해 시스템 출력  
	 * */
	@Override
	public void startEngine() {
		System.out.println("started simple engine of Bus...");
	}
}
