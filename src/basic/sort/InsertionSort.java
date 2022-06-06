package basic.sort;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    // 다음의 무작위로 배열된 숫자들을 선택정렬한다.
    int[] nums = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

    System.out.println("<정렬 전>");
    System.out.println(Arrays.toString(nums));

    for (int i = 0; i < nums.length - 1; i++) {
      int j = i;

      while (nums[j] > nums[j + 1]) {
        int temp = nums[j];
        nums[j] = nums[j + 1];
        nums[j + 1] = temp;

        // while 괄호안 조건 성립안될때까지 계속 마이너스 한다.
        j--;
      }
    }
    System.out.println("<정렬 후>");
    System.out.println(Arrays.toString(nums));
  }
}
