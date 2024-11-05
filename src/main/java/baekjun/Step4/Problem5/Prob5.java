package baekjun.Step4.Problem5;

import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        //자바 배열은 new로 객체 생성시 int의 경우 0으로 초기화
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] basket = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = (a-1); j <= (b-1); j++) {
                basket[j] = c;
            }
        }
        //출력
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", basket[i]);
        }
    }
}
