package baekjun.Step4.Problem3;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr_n = new int[1000000];
        int n = sc.nextInt();
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            arr_n[i] = sc.nextInt();
            if(i == 0){
                min = arr_n[i];
                max = arr_n[i];
            }else {
                if (arr_n[i]<min) min = arr_n[i];
                else if (arr_n[i]>max)  max=arr_n[i];
            }
        }
        System.out.printf("%d %d",min,max);
    }
}
