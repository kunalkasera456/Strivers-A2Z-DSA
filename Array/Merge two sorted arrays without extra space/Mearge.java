/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1. */

public class Mearge {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        int i = m-1, j = n-1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while (i>=0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while (j>=0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        for (int k2 = 0; k2 < nums1.length; k2++) {
            System.out.print(nums1[k2]+",");
        }
    }
}
