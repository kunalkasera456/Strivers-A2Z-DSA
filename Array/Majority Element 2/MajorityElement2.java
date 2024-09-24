import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {

    public static void main(String[] args) {
        int nums[] = {3,2,3};

        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) +1);
        }
        int n = nums.length/3;
        for(Integer i : hm.keySet()) {
            if(hm.get(i) > n){
                ans.add(i);
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
        }
    }
}
