package baekjun.Step3.Problem9;

import java.util.Scanner;

public class Prob9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s+"*";
            System.out.println(s);
        }
    }
}
