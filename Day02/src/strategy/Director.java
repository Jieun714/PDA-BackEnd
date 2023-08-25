package strategy;

public class Director {
	private Fibonacci fibonacci;
	
	public Director(Fibonacci fibonacci) {
		this.fibonacci = fibonacci;
	}
	
	// 피보나치 계산 
	public long fibonacci(int n) {
		return fibonacci.fibonacci(n);
	}
	
	// 시간 계산
	public void checkDiffTime(int n) {
		fibonacci.checkDiffTime(n);
	}
}