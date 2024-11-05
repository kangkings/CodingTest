package baekjun.Step3.Problem2;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a,b;
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.printf("%d\n", a+b);
        }
    }
}
