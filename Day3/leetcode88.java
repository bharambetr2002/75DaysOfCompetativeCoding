package Day3;

import java.util.Arrays;

public class leetcode88 {
    public static void main(String args[]) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        int c = m + n;
        int[] array = new int[c];

        for (int i = 0; i < m; i++) {
            array[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            array[m + i] = nums2[i];
        }

        Arrays.sort(array);

        for (int i = 0; i < c; i++) {
            nums1[i] = array[i];
        }

        for (int i = 0; i < c; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
