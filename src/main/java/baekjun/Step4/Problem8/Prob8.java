package baekjun.Step4.Problem8;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        ArrayList<Integer> arr_type = new ArrayList<Integer>();
        int user_num;
        //입력한 값을 42로 나눈 나머지를 배열의 각 방에 넣어줌
        for (int i = 0; i < arr.length; i++) {
            user_num = sc.nextInt();
            arr[i] = user_num%42;
        }
        //10번 반복, 중복되지 않은 값이면 arraylist에 삽입, 이후 arraylist와 비교하며 반복
        for (int i = 0; i < arr.length; i++) {
            if (arr_type.isEmpty()){
                arr_type.add(arr[i]);
            }else {
                for (int j = 0; j < arr_type.size(); j++) {
                    if (!arr_type.contains(arr[i])){
                        arr_type.add(arr[i]);
                    }
                }
            }
        }
        //출력
        System.out.println(arr_type.size());
    }
}
