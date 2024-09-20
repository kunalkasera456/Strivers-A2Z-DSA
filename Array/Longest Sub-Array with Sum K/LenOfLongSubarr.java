/*
 * Input : n = 6, arr[] = {10, 5, 2, 7, 1, 9}, k = 15
 * Output : 4
 * Explanation: The sub-array is {5, 2, 7, 1}.
 */

import java.util.HashMap;

public class LenOfLongSubarr {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9}, k = 15;
        // int arr[] = {-1, 2, 3}, k = 6;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // Add current element to the sum
            sum += arr[i];

            // If the sum equals K, we found a subarray from the start
            if (sum == k) {
                maxLength = i + 1;
            }

            // If sum - K is found in the map, it means we have found a subarray with sum K
            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }

            // Store the current sum if it's not already in the map
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        
        System.out.println(maxLength);
    }

}
