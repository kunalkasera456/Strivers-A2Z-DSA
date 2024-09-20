/*
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
   Output: 9
 */

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int longestStreek = 0;

        for (Integer num : set) {
            //check it is starting number of sequence or not
            if(!set.contains(num - 1)) {
                int currentNumber = num;
                int streekCount = 1;

                // Expand the sequence
                while (set.contains(currentNumber+1)) {
                    currentNumber++;
                    streekCount++;
                }
                //update the longest streek
                longestStreek = Math.max(longestStreek, streekCount);
            }
        }
        System.out.println(longestStreek);
    }

}
