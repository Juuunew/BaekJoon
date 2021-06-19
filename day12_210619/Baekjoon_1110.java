package day12_210619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int num = N;

        do {
            N = ((N % 10) * 10 + (((N / 10) + (N % 10)) % 10));
            sum++;
        } while(num != N);
        System.out.println(num);
    }
}
