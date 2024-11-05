package baekjun.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (65 <= s.charAt(i) && s.charAt(i) <= 67) t += 3;
            else if (s.charAt(i)<=70) t+= 4;
            else if (s.charAt(i)<=73) t+= 5;
            else if (s.charAt(i)<=76) t+= 6;
            else if (s.charAt(i)<=79) t+= 7;
            else if (s.charAt(i)<=83) t+= 8;
            else if (s.charAt(i)<=86) t+= 9;
            else if (s.charAt(i)<=90) t+= 10;
        }
        System.out.println(t);
    }
}