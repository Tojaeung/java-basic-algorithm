package boj;

import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No2884 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    // 45분 이상일때
    if (b >= 45) {
      b -= 45;
      System.out.println(a + " " + b);
    } else {
      b -= 45;
      b += 60;
      a -= 1;

      // 0시에서 -1이 아닌 23시로 변경해준다.
      if (a == -1) {
        a = 23;
      }

      System.out.println(a + " " + b);

    }

  }
}
