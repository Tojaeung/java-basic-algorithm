package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class No10871 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    // 또 한번 입력을 받는다.
    st = new StringTokenizer(br.readLine(), " ");

    for (int i = 0; i < a; i++) {
      // 두번째 입력받은 st가 for loop를 돈다.
      int d = Integer.parseInt(st.nextToken());
      if (d < b) {
        bw.write(d + " ");
      }
    }

    bw.flush();
    bw.close();
  }

}