package day15_210628;

public class Baekjoon_4673 {

    public static void main(String[] args) {
        int[] selarr = new int[10001];

        for(int i = 1; i < 10001; i++) {
            int n = self(i);

            if(n < 10001) {
                selarr[n] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < selarr.length; i++) {
            if(selarr[i] != 1) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int self(int number) {
        int selfNumber = number;

        while(number !=0) {
            selfNumber += number % 10;
            number /= 10;
        }
        return selfNumber;
    }

}
