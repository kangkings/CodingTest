package baekjun.Step3.Problem1;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", n,i,n*i);
        }
    }
}
