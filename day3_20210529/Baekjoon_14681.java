package day3_20210529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14681 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		if ( a > 0 && b > 0) 
			System.out.println( "1" );
		else if ( a < 0 && b > 0) 
			System.out.println( "2" );
		else if ( a < 0 && b < 0 )
			System.out.println( "3" );
		else
			System.out.println( "4" );
		br.close();
		
	}
}
