package day4_20210530;

import java.util.Scanner;

public class Baekjoon_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
