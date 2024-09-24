/* 
Input: nums = [1,2,3], k = 3
Output: 2 
*/

import java.util.HashMap;

public class SubarraySum {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        int k = 3;
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }

        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < prefixSum.length; i++) {
            if (hashMap.containsKey(prefixSum[i] - k)) {
                count += hashMap.get(prefixSum[i] - k);
            }

            if (prefixSum[i] == k) {
                count++;
            }

            hashMap.put(prefixSum[i], hashMap.getOrDefault(prefixSum[i], 0) +1);
        }
        System.out.println(count);
    }
    
}
