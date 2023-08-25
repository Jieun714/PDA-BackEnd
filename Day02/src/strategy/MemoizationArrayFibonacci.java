package strategy;

import java.time.Duration;
import java.time.Instant;

/**
 * Memoization 배열을 적용한 피보나치 수열 
 * */
public class MemoizationArrayFibonacci implements Fibonacci{
	private long result;
	private static long [] array;
	
	/**
	 * 인자 n을 받는 생성자에서 result와 array 초기화
	 * */
	public MemoizationArrayFibonacci(int n) {
		result = 0;
		array = new long[n+1];
	}
	
	@Override
	public long fibonacci(int n) {
		if(n <= 1) return n;
		else if(array[n] != 0) return array[n];
		else return array[n] = fibonacci(n-1) + fibonacci(n-2);
	}

	@Override
	public void checkDiffTime(int n) {
		Instant beforeTime = Instant.now();
		result = fibonacci(n);
		Instant afterTime = Instant.now();
		long diffTime = Duration.between(beforeTime, afterTime).toMillis();
		System.out.println("메모이제이션 배열 피보나치 실행 결과 : " + result);
		System.out.println("메모이제이션 배열 피보나치 실행시간(ms) : " + diffTime);
	}
}
