package baekjun.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GroupWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int res = 0;

        for (int i = 0; i < cnt; i++) {
            String word = br.readLine();
            List<Character> usedWord = new ArrayList<>();
            boolean isGroup = true;
            for (int j = 0; j < word.length(); j++) {
                if (j == 0){
                    usedWord.add(word.charAt(j));
                } else if (j < word.length()) {
                    if (word.charAt(j) != word.charAt(j-1) && !usedWord.contains(word.charAt(j))){
                        usedWord.add(word.charAt(j));
                    }else if (word.charAt(j) != word.charAt(j-1) && usedWord.contains(word.charAt(j))) {
                        isGroup = false;
                        break;
                    }
                }
            }
            if (isGroup){
                res++;
            }
        }
        System.out.println(res);
    }
}
