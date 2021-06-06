package day9_210606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int i, j, k, N;
		N = Integer.parseInt(br.readLine());
		for(i = 1; i <= N; i++) {
			for(j = 1; j <= N-i; j++) {
				sb.append(" ");
			}
			for(k = 1; k <= i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
