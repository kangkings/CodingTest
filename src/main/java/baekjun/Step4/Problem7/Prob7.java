package baekjun.Step4.Problem7;

import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] student = new int[30];
        int submit;
        int temp = 0;
        int lower = 0;
        int bigger = 0;
        //입력 받기(제출하면 1로 처리, 미제출은 0으로 남음)
        for (int i = 0; i < student.length-2; i++) {
            submit = sc.nextInt() - 1;
            student[submit] = 1;
        }
        //검사
        for (int i = 0; i < student.length; i++) {
            if (student[i] == 0){
                if(temp == 0){
                    temp = i+1;
                }else{
                    if((i+1) > temp){
                        bigger = i+1;
                        lower = temp;
                    }else if((i+1) < temp){
                        bigger = temp;
                        lower = i+1;
                    }
                }
            }
        }
        System.out.println(lower);
        System.out.println(bigger);
    }
}
