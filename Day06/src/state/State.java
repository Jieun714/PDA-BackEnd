package state;

public interface State {
	public abstract void doUse(Context context); //금고 설정
	public abstract void doAlarm(Context context); //비상벨
	public abstract void doPhone(Context context); //일반통화 
}	