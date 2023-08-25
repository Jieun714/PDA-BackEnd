package fibonacci;

import java.time.Duration;
import java.time.Instant;

public class Fibonacci {
	
	/**
	 * 효율성을 고려하지 않은 피보나치 수열 
	 * */
	public static long fibonacci(int num) {
		if(num <= 1) {
			return num;
		} else {
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}
	
	public static long [] arr;
	/**
	 * Memoization을 적용한 피보나치 수열 
	 * */
	public static long fibonacciM(int num) {
		if(num <= 1) return num;
		else if(arr[num] != 0) return arr[num];
		else return arr[num] = fibonacciM(num-1) + fibonacciM(num-2);
	}
	

	public static void main(String[] args) {
		int N = 50; //최대 수
		arr  = new long[N+1];
		/**
		 * Instant를 사용하여 경과시간을 나노초 단위로 표현 
		 * */
		Instant beforeTime = Instant.now();
		System.out.println(fibonacci(N)); //기본 피보나치 결과 출력 
		Instant afterTime = Instant.now();
		long diffTime = Duration.between(beforeTime, afterTime).toMillis();
		System.out.println("기본 피보나치 실행시간(ms) : " + diffTime);
		
		beforeTime = Instant.now();
		System.out.println(fibonacciM(N)); //메모이제이션을 적용한 결과 출력 
		afterTime = Instant.now();
		diffTime = Duration.between(beforeTime, afterTime).toMillis();
		System.out.println("메모이제이션 피보나치 실행시간(ms) : " + diffTime);
		
	}
}
