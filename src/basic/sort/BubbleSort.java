package basic.sort;

import java.util.Arrays;

// 가장 비효율적인 정렬방식
public class BubbleSort {
  public static void main(String[] args) {
    // 다음의 무작위로 배열된 숫자들을 선택정렬한다.
    int[] nums = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

    System.out.println("<정렬 전>");
    System.out.println(Arrays.toString(nums));

    for (int i = 0; i < nums.length; i++) {
      // 바로 옆의 값과 비교하고 자리를 swap해주는 작업이 반복되기 때문에
      // 선택정렬과 시간복잡도는 같지만 비효율적이고 느리다.
      for (int j = 0; j < nums.length - (i + 1); j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
    System.out.println("<정렬 후>");
    System.out.println(Arrays.toString(nums));
  }
}
