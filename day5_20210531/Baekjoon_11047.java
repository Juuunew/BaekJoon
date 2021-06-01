package day5_20210531;

import java.util.Scanner;

public class Baekjoon_11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] coin = new int[n];
		
		for(int i=0; i<coin.length; i++) {
			coin[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=coin.length-1; i>=0; i--) {
			if( k >= coin[i] ) {
				count += k/coin[i];
				k %= coin[i];
			}
		}
		sc.close();
		System.out.println(count);
		 
	}

}
