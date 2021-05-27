package day2_20210527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9498 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		if( a >= 90 ) {
			System.out.println( "A" );
		} else if ( a >= 80 ) {
			System.out.println( "B" );
		} else if ( a >= 70 ) {
			System.out.println( "C" );
		} else if ( a >= 60 ) {
			System.out.println( "D" );
		} else {
			System.out.println( "F" );
		}

	}
	// System.out.println( (a>=90) ? "A" : (a>=80) ? "B" : (a>=70) ? "C" : (a>=60) ? "D" : "F" );	삼항연산자
}
