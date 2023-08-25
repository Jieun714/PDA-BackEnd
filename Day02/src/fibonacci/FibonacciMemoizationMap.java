package fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap을 이용한 메모이제이션 피보나치 수열
 * */
public class FibonacciMemoizationMap { 
	private Map<Integer, Long> map = new HashMap<>();
	
	public long fibonacciM(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		if(this.map.containsKey(n)) {
			return this.map.get(n);
		}
		long result = fibonacciM(n-1) + fibonacciM(n-2);
		this.map.put(n, result);
		return result;
	} 
	
	public static void main(String[] args) {
		int N = 50;
		FibonacciMemoizationMap fibo = new FibonacciMemoizationMap();
		System.out.println(fibo.fibonacciM(N));
	}
}
