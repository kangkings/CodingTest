package baekjun.Step4.Problem9;

import java.util.Scanner;

public class Prob9 {

    //자바에서 배열 = 배열로 대입해버리면 주소값을 공유해서 값이 같이 변함에 주의*
    //C언어에서 포인터를 넘겨준거라 생각하면 된다.
    static int[] reverse_sort(int[] sorted, int i, int j){
        int temp;
        for (int k = 0; k < (j-i+1)/2; k++) {
            temp = sorted[j-k];
            sorted[j-k] = sorted[i+k];
            sorted[i+k] = temp;
        }
        return sorted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int init, end;
        int [] basket = new int[n];
        //바구니 번호에 맞게 값 초기화
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i+1;
        }
        //m번 init ~ end를 역순정렬
        for (int i = 0; i < m; i++) {
            basket = reverse_sort(basket,sc.nextInt()-1,sc.nextInt()-1);
        }
        //출력
        for (int i = 0; i < basket.length; i++) {
            System.out.printf("%d ", basket[i]);
        }
    }
}
