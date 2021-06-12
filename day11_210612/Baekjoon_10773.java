package day11_210612;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스
        int k = Integer.parseInt(br.readLine());
        int i, num;

        Stack<Integer> stack = new Stack<Integer>();
        for(i = 0; i < k; i++) {
            num = Integer.parseInt(br.readLine());
            if(num == 0) {
                // num이 0이라면 꺼내기
                stack.pop();
            } else {
                // 0이 아니면 집어넣기
                stack.push(num);
            }
        }
        // 적어낸 수의 합
        int sum = 0;

        for(int o : stack) {
            sum += o;
        }
        System.out.println(sum);
    }
}
