package day2_20210527;

import java.util.Scanner;

public class Baekjoon_1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		 a = sc.nextInt();
		 b = sc.nextInt();
		 
		 sc.close();
		 
//		 if( a > b ) {
//			 System.out.println( ">" );
//		 } else if( a < b ){
//			 System.out.println( "<" );
//		 } else {
//			 System.out.println( "==" );
//		 }
		 String str = (a>b) ? ">" : ((a<b) ? "<" : "==");
		 System.out.println( str );
	}
}
