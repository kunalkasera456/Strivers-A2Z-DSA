/*
 * Input: arr[] = {15,-2,2,-8,1,7,10,23}, n = 8
 Output: 5
Explanation: The largest subarray with sum 0 is -2 2 -8 1 7.
 */

import java.util.HashMap;

public class Largestsubarray {

    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23}, n = 8;
        int [] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxLength = 0;
        for (int i = 0; i < prefixSum.length; i++) {
            if(prefixSum[i] == 0) {
                maxLength = i+1;        // for  {-1,1,-1,1}
            }
            if (hashMap.containsKey(prefixSum[i])) {
                int length = i - hashMap.get(prefixSum[i]);
                maxLength = Math.max(maxLength, length);
            } else {
                hashMap.put(prefixSum[i], i);
            }
        }
        System.out.println(maxLength);
    }
}
