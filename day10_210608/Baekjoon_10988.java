package day10_210608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class Baekjoon_10988 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder(br.readLine());
//		
//		if(sb.toString().equals(sb.reverse().toString())) {
//			System.out.println("1");
//		} else {
//			System.out.println("0");
//		}
//	}
//
//}

public class Baekjoon_10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		StringBuffer sb = new StringBuffer(s);
		String reverse = sb.reverse().toString();
		
		if(s.equals(reverse)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
