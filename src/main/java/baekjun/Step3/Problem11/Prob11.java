package baekjun.Step3.Problem11;

import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b;
        do {
           a = sc.nextInt();
           b = sc.nextInt();
           if((a != 0)&&(b!=0)){
                System.out.println(a+b);
           }else {
               break;
           }
        }while((a != 0)&&(b!=0));

    }
}
