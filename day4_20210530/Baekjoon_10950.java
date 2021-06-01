package day4_20210530;

import java.util.Scanner;

public class Baekjoon_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b+c);
		}
		sc.close();
	}

}
