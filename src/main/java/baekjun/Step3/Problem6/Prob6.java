package baekjun.Step3.Problem6;

import java.io.*;
import java.util.StringTokenizer;

public class Prob6 {
    public static void main(String[] args) throws IOException {
        
        /*print를 이용한 출력보다 buffer를 사용하는게 빠름
          bufferedwriter는 반드시 닫아줘야함 
          buffer는 빠르지만 기본적으로 String으로 받아오기 때문에 데이터의 후처리가 필요
          이경우에도 String으로 한줄씩 받아와서 StringTokenizer를 통해 공백 단위로 형변환 및 데이터 처리함
          ***buffer를 사용할 경우 IOException 예외처리 필수
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        bw.close();
    }
}
