package baekjun.문자열;

import java.util.Scanner;

public class CharLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            String p = "";
            for (int k = 0; k < s.length(); k++){
                for (int j = 0; j < r; j++){
                    p += s.charAt(k);
                }
            }
            System.out.println(p);
        }
    }
}
