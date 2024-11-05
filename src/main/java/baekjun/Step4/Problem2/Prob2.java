package baekjun.Step4.Problem2;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        /*
        배열의 크기를 10000으로 해놓은게 걸림 -> 메모리 측면에서 효율이 안좋을 거라는 생각이 듦
        더 효율적인 해결방법 나중에 고민해보기
         */
        Scanner sc = new Scanner(System.in);
        int [] arr_n = new int[10000];
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            arr_n[i] = sc.nextInt();
            if (arr_n[i] < x){
                str = str+arr_n[i]+" ";
            }
        }
        System.out.println(str);
    }
}
