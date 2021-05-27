package day2_20210527;

import java.util.Scanner;

public class Baekjoon_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		System.out.println( a * (b%100%10) );
		System.out.println( a * (b%100/10) );
		System.out.println( a * (b/100) );
		System.out.println( a * b );
	}

}
