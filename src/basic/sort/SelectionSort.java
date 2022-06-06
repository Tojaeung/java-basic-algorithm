package basic.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) throws Exception {
        // 다음의 무작위로 배열된 숫자들을 선택정렬한다.
        int[] nums = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            // 루프를 돌떄 최솟값이 있는 index
            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    // 최솟값이 있는 index를 찾았다.
                    minIndex = j;
                }
            }

            // 최소값이 있는 index와 i(시작 index )의 값을 바꿔준다.
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }
        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(nums));
    }

}
