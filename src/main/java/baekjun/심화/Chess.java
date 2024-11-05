package baekjun.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        List<Integer> list = Collections.list(st).stream().map(token -> Integer.parseInt(token.toString())).collect(Collectors.toList());
        List<Integer> origin = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 2, 8));
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < origin.size(); i++) {
            res.add(origin.get(i)-list.get(i));
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
            if (i < res.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
