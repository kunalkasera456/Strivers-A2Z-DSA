/*
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

*/

public class MoveZeros {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                //swap
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]);
        }
    }
}
