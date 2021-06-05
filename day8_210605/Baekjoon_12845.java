package day8_210605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_12845 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		br.readLine();
		String str1[] = br.readLine().split(" ");
		
		int max = 0;
		int maxIndex = 0;
		int result = 0;
		
		for(int i=0; i<str1.length; i++) {
			int level = Integer.parseInt(str1[i]);
			if( max < level ) {
				max = level;
				maxIndex = i;
			}
			result += level;
		}
		result += max * (str1.length -2 );
		bw.write(String.valueOf(result));
		bw.flush();
	}

}
