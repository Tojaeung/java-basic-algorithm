package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No1157 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[26];
    String str = br.readLine();

    for (int i = 0; i < str.length(); i++) {
      if (65 <= str.charAt(i) && str.charAt(i) <= 90) {
        arr[str.charAt(i) - 65]++;
      } else {
        arr[str.charAt(i) - 97]++;
      }
    }
    int max = -1;
    char result = '?';
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] > max) {
        max = arr[i];
        result = (char) (i + 65);
      } else if (arr[i] == max) {
        result = '?';
      }
    }
    System.out.print(result);
  }

}