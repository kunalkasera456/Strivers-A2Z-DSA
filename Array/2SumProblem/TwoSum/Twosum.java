import java.util.HashMap;

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

public class Twosum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = hm.get(target-nums[i]);
            }
            hm.put(nums[i], i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        // System.out.println(twoSum(nums, target));
        int ans[] = twoSum(nums, target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

}
