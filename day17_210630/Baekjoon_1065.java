package day17_210630;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(arithmeticSequence((Integer.parseInt(br.readLine()))));

    }

    public static int arithmeticSequence(int num) {
        int count = 0;

        if(num < 100) {
            return num;
        } else {
            count = 99;
            if(num == 1000) {
                num = 999;
            }

            for(int i = 100; i <= num; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if((hundred - ten) == (ten - one)) {
                    count++;
                }
            }

        }

        return count;
    }
}
