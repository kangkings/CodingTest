package baekjun.Step3.Problem10;

import java.util.Scanner;

public class Prob10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<(n-i)){
                    System.out.printf(" ");
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
