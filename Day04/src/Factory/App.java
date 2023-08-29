package Factory;

/**
 * 동작을 실행하는 메인 클래스 
 * */
public class App {
	public static void main(String[] args) {
		/**
		 * VehicleFactory의 인스턴스 생성 
		 * */
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		/**
		 * Vehicle의 인스턴스 생성 - 상위 클래스(VehicleFactory)에서 받아 하위클래스에서 구체화
		 * enum으로 선언된 VehicleType에서 입력받은 요소에 해당하는 메소드를 호출
		 * 해당 예시에서는 
		 * */
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAMPING);
		
		System.out.println("\n============== Camping Car ================");
		/**
		 * 결과 출력 
		 * */
		vehicle.startEngine();
	}
}
