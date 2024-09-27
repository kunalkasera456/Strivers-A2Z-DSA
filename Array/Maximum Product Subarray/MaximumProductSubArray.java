

public class MaximumProductSubArray {

    public static void main(String[] args) {
        int arr [] = {2,3,-4,3};
        int pref = 1;
        int suf = 1;
        int maximumProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(pref == 0 ) pref = 1;
            if (suf == 0) {
                suf = 1;
            }
            pref = pref * arr[i];
            suf = suf * arr[arr.length-1-i];
            maximumProduct = Math.max(maximumProduct, Math.max(pref, suf));
        }

        System.out.println(maximumProduct);
    }
}
