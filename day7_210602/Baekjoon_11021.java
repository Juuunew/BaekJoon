package day7_210602;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		
		for(int i=0; i<A; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+(B+C)+"\n");
		}
		br.close();	// br.close 를 for문 위에서 해주면 IOException: Stream closed why?->for문 안에 br.readLine 존재하기 떄문
		bw.flush();
		bw.close();
	}

}
