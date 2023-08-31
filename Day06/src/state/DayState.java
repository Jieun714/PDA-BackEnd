package state;

/**
 * 주간 상태를 나타내는 클래스 
 * */
public class DayState implements State {
	private static DayState singleton = new DayState();
	private DayState() {}
	
	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doUse(Context context) {
		context.recordLog("금고 사용(주간)");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("비상벨(주간)");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("일반 통화(주간)");
	}

	@Override
	public String toString() {
		return "[주간]";
	}
}
