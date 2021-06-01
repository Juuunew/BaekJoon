package day4_20210530;

import java.util.Scanner;

public class Baekjoon_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		for( int i=1; i<10; i++ ) {
			System.out.println( x+" * "+i+ " = " + (x*i) );
		}
	}

}
