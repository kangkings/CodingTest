package baekjun.Step4.Problem10;

import java.util.Scanner;

public class Prob10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] score = new double[n];
        double max = 0;
        double sum = 0;
        double avg = 0;
        //입력받기
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextDouble();
        }
        //입력받은 값 중 최댓값 구하기
        for (int i = 0; i < n; i++) {
            if (i == 0) max = score[0];
            else {
                if (score[i] > max) max = score[i];
            }
        }
        //기존 배열에 조작된 점수 입력 점수/max*100
        for (int i = 0; i < n; i++) {
            score[i] = score[i]/max*100;
        }
        //총합 및 평균 계산
        for (int i = 0; i < n; i++) {
            sum += score[i];
        }
        avg = sum/n;
        System.out.printf("%f",avg);
    }
}
