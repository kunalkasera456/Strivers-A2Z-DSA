/*
 *  Input: nums = [3,1,-2,-5,2,-4]
    Output: [3,-2,1,-5,2,-4]
    Explanation:
    The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
    The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
    Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions. 
 */

public class RearrangeArray {
    public static void main(String[] args) {
        int []nums = {3,1,-2,-5,2,-4};
        int n = nums.length;
        int [] negativeArray = new int[n/2];
        int [] positiveArray = new int[n/2];
        int positiveIndex = 0;
        int negativeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveArray[positiveIndex++] = nums[i];
            } else {
                negativeArray[negativeIndex++] = nums[i];
            }
        }
        int result [] = new int[n];
        int posIndex = 0;
        int negIndex = 0;
        // int j =0;
        // while (j<n) {
        //     result[j++] = positiveArray[posIndex++];
        //     result[j++] = negativeArray[negIndex++];
        // }
        for (int i = 0; i < n; i++) {
            result[i++] = positiveArray[posIndex++];
            result[i] = negativeArray[negIndex++];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }
    }
}
