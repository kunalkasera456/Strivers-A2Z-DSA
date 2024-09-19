/*
 *  Input: nums = [3,4,5,1,2]
 *  Output: true
 *  Explanation: [1,2,3,4,5] is the original sorted array.
 *   You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
 */

public class Check {

    public static void main(String[] args) {
        // int[] nums = {3,4,5,1,2};
        int[] nums = {2,1,3,4};

        int n = nums.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
                if(nums[i] > nums[(i+1)%n]) {
                    count++;
                }
            }

        if(count == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
