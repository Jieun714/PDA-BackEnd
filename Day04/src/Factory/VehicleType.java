package Factory;

/**
 * enum: 서로 연관있는 상수를 편리하게 관리하기 위해 사용
 * */
public enum VehicleType   {
	
	BUS{
		public Vehicle getVehicle(){
			return new Bus();
		}
	},
	TRUCK{
		public Vehicle getVehicle(){
			return new Truck();
		}
	},
	ELECTRIC{
		public Vehicle getVehicle(){
			return new ElectricCar();
		}
	},
	CAMPING{
		public Vehicle getVehicle(){
			return new CampingCar();
		}
	};

	abstract Vehicle getVehicle();
}