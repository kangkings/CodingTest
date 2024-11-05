package baekjun.Step3.Problem12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob12_buffer {
    public static void main(String[] args) throws IOException {
        
        /*
        버퍼는 스캐너와 달리 hasNext()메서드가 없이 때문에 수동으로 처리해줘야함
        readLine()으로 읽어온 값이 == null이면 반복 종료
        **평소 버퍼 사용하듯이 사용하면 입력만 받고 출력은 안해버림(IDE에선 엔터로EOF불가능해 보임)
        문자열을 담아뒀다가 처리해서 출력해야 함
        String Builder 사용
        
        while문 조건식에 있는 br.readLine()을 String에 할당하고 그 스트링을 토큰화 해야했지만
        전부 br.readLine()코드로만 작성해서 런타임 에러가 3번 발생함

        버퍼가 스캐너보다 빠르지만 버퍼 안에서도 성능을 높일 수 있을 것 같음
        객체 생성이 반복되면 속도가 느려지는데 이건 더 공부하고 나중에 개선해보기
        + String끼리 +연산은 메모리 할당 및 해제가 발생해서 성능적으로 안좋음
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String result;
        int a,b;
        while((result = br.readLine()) != null){
            st = new StringTokenizer(result, " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append((a+b)).append("\n");
        }
        System.out.println(sb);
    }
}
