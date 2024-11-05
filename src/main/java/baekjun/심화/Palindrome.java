package baekjun.심화;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Character> front = new ArrayList<>();
        List<Character> rear = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.length()%2 == 1){
                if (i < str.length()/2){
                    front.add(str.charAt(i));
                } else if (i > str.length()/2) {
                    rear.add(str.charAt(i));
                }
            }else {
                if (i < str.length()/2){
                    front.add(str.charAt(i));
                } else if (i >= str.length()/2) {
                    rear.add(str.charAt(i));
                }
            }
        }
        Collections.reverse(rear);
        if(front.equals(rear)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
