package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10818 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    // 최소값을 초기화하기 위해서 가장 큰수를 할당하였다.
    int min = 1000001;
    // 최대값을 초기화하기 위해서 가장 작은수를 할당하였다.
    int max = -1000001;
    for (int i = 0; i < a; i++) {

      int b = Integer.parseInt(st.nextToken());

      // 최소값인가?
      if (b < min) {
        min = b;
      }
      // 최대값인가?
      if (b > max) {
        max = b;
      }
    }

    System.out.println(min + " " + max);

    // Arrays.sort는 시간복잡도가 최악의 경우 N * N 일수도 있기때문에 배열을 사용하지 않고 풀이하였다.
  }
}
