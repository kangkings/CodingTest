package baekjun.Step4.Problem6;

import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] basket = new int[n];
        int temp;
        int a,b;
        //각 방마다 인덱스+1의 값으로 변경
        for (int i = 0; i < n; i++) {
            basket[i] = i+1;
        }
        //a번째 방(a-1)과 b번째 방(b-1)의 값을 temp라는 임시값 저장변수를 활용해 교체)
        for (int i = 0; i < m; i++) {
            a = sc.nextInt()-1;
            b = sc.nextInt()-1;
            temp = basket[a];
            basket[a] = basket[b];
            basket[b] = temp;
        }
        //출력
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",basket[i]);
        }
    }
}
