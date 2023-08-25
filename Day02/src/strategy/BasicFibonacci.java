package strategy;

import java.time.Duration;
import java.time.Instant;

/**
 * 효율성을 고려하지 않은 피보나치 수열 
 * */
public class BasicFibonacci implements Fibonacci {
	private long result;
	
	/**
	 * 인자 n을 받는 생성자에서 result 초기화
	 * */
	public BasicFibonacci(int n) {
		result = 0;
	}
	
	@Override
	public long fibonacci(int n) {
		if(n <= 1) {
			return n;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	@Override
	public void checkDiffTime(int n) {
		Instant beforeTime = Instant.now();
		result = fibonacci(n); 
		Instant afterTime = Instant.now();
		long diffTime = Duration.between(beforeTime, afterTime).toMillis();
		System.out.println("기본 피보나치 실행 결과 : " + result);
		System.out.println("기본 피보나치 실행시간(ms) : " + diffTime);
	}
}
