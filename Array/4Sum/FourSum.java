/*
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;

            for (int j = i+1; j < nums.length; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1, l = nums.length-1;
                while(k<l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum > 0) {
                        l--;
                    } else if (sum < 0) {
                        k++;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1])k++;
                        while(k<l && nums[l] == nums[l+1])l--;
                    }
                    
                }
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j< ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j)+",");
            }
            System.out.println();
        }
    }
}
