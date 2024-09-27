

public class FindTheRepeatingAndMissingNumber {
    public static void main(String[] args) {
        // int [] nums = {1,5,3,6,6,4};
        int [] nums = {2,2};
        int n = nums.length;

         // Expected sum and sum of squares
         long S = n * (n + 1) / 2;
         long P = n * (n + 1) * (2 * n + 1) / 6;
         
         // Actual sum and sum of squares from the array
         long sumArr = 0, sumSqArr = 0;
         
         for (int i = 0; i < n; i++) {
             sumArr += nums[i];
             sumSqArr += (long) nums[i] * nums[i];
         }
         
         // B - A
         long diff = sumArr - S;  // This is B - A
         // (B - A)(B + A) -> sumSqArr - P
         long sumDiff = sumSqArr - P;  // This is (B - A)(B + A)
         
         // B + A
         long sum = sumDiff / diff;
         
         // Solve for A and B
         int repeatingNumber = (int) ((sum + diff) / 2);
         int missingNumber = (int) (sum - repeatingNumber);
         
         System.out.println(repeatingNumber);
         System.out.println(missingNumber);

    }
}
