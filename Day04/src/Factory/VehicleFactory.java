package Factory;

/**
 * 구현 클래스 - 상위 클래스 
 * */
public class VehicleFactory {
	/**
	 * enum으로 선언된 VehicleType에서 입력받은 요소에 해당하는 메소드(getVehicle())를 리턴하는 메소드 
	 * */
	public Vehicle getVehicle(VehicleType vehicleType){
		return vehicleType.getVehicle();
	}
}
