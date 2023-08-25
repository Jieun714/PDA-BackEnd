package strategy;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class MemoizationMapFibonacci implements Fibonacci{
	private long result;
	private Map<Integer, Long> map;
	
	/**
	 * 인자 n을 받는 생성자에서 result와 map 초기화
	 * */
	public MemoizationMapFibonacci(int n) {
		result = 0;
		map = new HashMap<>();
	}
	
	@Override
	public long fibonacci(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		if(this.map.containsKey(n)) {
			return this.map.get(n);
		}
		long result = fibonacci(n-1) + fibonacci(n-2);
		this.map.put(n, result);
		return result;
	}

	@Override
	public void checkDiffTime(int n) {
		Instant beforeTime = Instant.now();
		result = fibonacci(n);
		Instant afterTime = Instant.now();
		long diffTime = Duration.between(beforeTime, afterTime).toMillis();
		System.out.println("메모이제이션 Map 피보나치 실행 결과 : " + result);
		System.out.println("메모이제이션 Map 피보나치 실행시간(ms) : " + diffTime);
	}
}
