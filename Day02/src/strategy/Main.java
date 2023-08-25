package strategy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해주세요 >> ");
		int n = sc.nextInt();
		System.out.println("========================================");
		
		Director director1 = new Director(new BasicFibonacci(n));
		director1.checkDiffTime(n);
		System.out.println("========================================");
		
		Director director2 = new Director(new MemoizationArrayFibonacci(n));
		director2.checkDiffTime(n);
		System.out.println("========================================");
		
		Director director3 = new Director(new MemoizationMapFibonacci(n));
		director3.checkDiffTime(n);
	}
}
