package state;

public class LunchState implements State {
	private static LunchState singleton = new LunchState();
	private LunchState() {}
	
	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doUse(Context context) {
		context.recordLog("비상: 점심 금고 사용!");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("비상벨(점심)");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("일반 통화(점심)");
	}

	@Override
	public String toString() {
		return "[점심]";
	}
}
