package baekjun.Step3.Problem5;

import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n/4;
        for (int i = 0; i < cnt; i++) {
            System.out.printf("long ");
        }
        System.out.println("int");
    }
}
