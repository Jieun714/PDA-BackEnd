package state;

public enum StateType {
	DAY {
		public State getInstance() {
//			return new DayState(); //싱글톤 객체 생성이라 생각해서 작성했지만, 싱글톤이 아님  
			return DayState.getInstance();
		}
	}, 
	LUNCH {
		public State getInstance() {
			return LunchState.getInstance();
		}
	},
	NIGHT {
		public State getInstance() {
			return NightState.getInstance();
		}
	};

	abstract State getInstance();
}