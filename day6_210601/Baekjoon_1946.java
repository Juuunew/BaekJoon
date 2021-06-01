package day6_210601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1946 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int a = 1;
			int[] rank = new int[N+1];
			
			for(int j=0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int D = Integer.parseInt(st.nextToken());
				int I = Integer.parseInt(st.nextToken());
				rank[D] = I;
			}
			int min = rank[1];
			int count = 1;
			for(int j=2; j<N+1; j++) {
				if(rank[j] < min) {
					count++;
					min = rank[j];
				}
			}
			System.out.println(count);
		}
	}

}
