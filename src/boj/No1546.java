package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1546 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    // 입력값을 배열에 넣어준다.
    int[] arr = new int[st.countTokens()];
    for (int i = 0; i < a; i++) {
      arr[i] = (Integer.parseInt(st.nextToken()));
    }

    // 입력값 중에 최대값을 구한다.
    // int자료형 끼리 나누면 0이 되기떄문에, double로 바꿔준다.
    double max = (double) Arrays.stream(arr).max().getAsInt();

    // 자동형변환을(큰 자료형이 작은 자료형 먹어버림) 이용한다.
    double sum = 0.0;
    for (int j = 0; j < a; j++) {

      sum += (arr[j] / max) * 100;

    }

    System.out.println(sum / a);
  }
}
