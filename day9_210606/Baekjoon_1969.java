package day9_210606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1969 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// dna 수
		int n = Integer.parseInt(st.nextToken());
		
		// 문자열의 길이
		int m = Integer.parseInt(st.nextToken());
		
		int i, j, max;
		int hammingDistance = 0;
		
		String[] dna = new String[n];
		
		// 알파벳 길이만큼의 배열
		int[][] alpha = new int[m][26];
		
		for( i=0; i<n; i++) {
			dna[i] = br.readLine();
			for( j=0; j<m; j++) {
				alpha[j][dna[i].charAt(j)-'A']++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(i=0; i<m; i++) {
			max = alpha[i][0];
			char target = 'A';
			for(j=0; j<26; j++) {
				if(alpha[i][j]>max) {
					max = alpha[i][j];
					target = (char)(j+'A');
				}
			}
			sb.append(target);
		}
		
		for(i=0; i<n; i++) {
			for(j=0; j<m; j++) {
				if(dna[i].charAt(j) != sb.charAt(j)) hammingDistance++;
			}
		}
		System.out.println(sb.toString());
		System.out.println(hammingDistance);
	}

}
