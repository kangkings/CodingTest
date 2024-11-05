package baekjun.Step3.Problem12;

import java.util.Scanner;

public class Prob12_scanner {
    public static void main(String[] args){
        
        /*
        특별한 조건없이 입력이 끝나서 더 읽어올게 없을 때 까지 출력하기 위해 End Of File의 개념 알아야함
        Scanner는 hasNext()메서드를 통해 다음 토큰이 있는지 없는지 검사할 수 있음.
        이를 조건문에 넣어서 해결
        ****백준의 경우 데이터를 넘겨주지 않는 방식으로 예외를 발생시켜 이대로 제출해도 무방함
        하지만 IDE에선 엔터값도 데이터를 받았다고 인식하기 때문에 예외가 던져지지 않아 입력이 계속 진행된다
        이를위해 타입 미스매치 예외나 각종 예외를 입력을 통해 의도적으로 주어야 종료된다.
         */
        Scanner sc = new Scanner(System.in);
        int a,b;
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}
