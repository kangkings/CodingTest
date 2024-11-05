package baekjun.Step4.Problem1;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr_n = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr_n[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr_n[i]==v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
