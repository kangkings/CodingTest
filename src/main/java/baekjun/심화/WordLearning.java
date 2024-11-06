package baekjun.심화;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordLearning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim().toUpperCase();
        Map<Character,Integer> wordMap = new HashMap<>();
        int max = 0;
        char maxKey = 0;
        int cnt = 0;
        

        for (int i = 0; i < word.length(); i++) {
            if (wordMap.get(word.charAt(i)) == null){
                wordMap.put(word.charAt(i), 1);
            }else {
                wordMap.put(word.charAt(i),wordMap.get(word.charAt(i))+1);
            }
        }

        for(char key : wordMap.keySet()){
            int value = wordMap.get(key);
            if (max < value){
                max = value;
                maxKey = key;
            }
        }

        for (char key : wordMap.keySet()){
            if (wordMap.get(key) == max){
                cnt++;
            }
        }
        if (cnt > 1){
            System.out.println("?");
        }else {
            System.out.println(maxKey);
        }
    }
}
