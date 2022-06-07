package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10809 {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[26];
    String str = br.readLine();

    // 빈 알파벳 배열 -1로 초기화
    for (int i = 0; i < arr.length; i++) {
      arr[i] = -1;
    }

    for (int i = 0; i < str.length(); i++) {

      // 이미 할당된 str의 인덱스를 변경하지 않기위해 -1일때만 변경되도록 한다.
      if (arr[str.charAt(i) - 'a'] == -1) {
        arr[str.charAt(i) - 'a'] = i;
      }
    }

    // 자바 forEach는 배열을 출력하는 메서드이다.
    for (int val : arr) {
      System.out.print(val + " ");
    }
  }
}