package baekjun.Step4.Problem4;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr_n = new int[9];
        int max = 0;
        int num = 0;
        for (int i = 0; i < arr_n.length; i++) {
            arr_n[i] = sc.nextInt();
            if (arr_n[i]>max){
                max = arr_n[i];
                num = (i+1);
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}
