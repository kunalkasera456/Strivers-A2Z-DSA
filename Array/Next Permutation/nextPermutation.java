/*
 *  1 2 3 2 3 => 1 2 3 3 2
 *  4 3 2 1   => 1 2 3 4
 *  1 2 3 4   => 1 2 4 3  (swap last element to get NGE)
 *  1 2 3 4 3 2 3 4 2 => 1 2 3 4 3 2 4 2 3 (swap only the using last acending subarray beacuse any element before it will have the higher weigtage)
 *  2 3 4 2   => 2 4 2 3    
 *  1 2 3 5 4 2 => (swap 3 4 not 3 5)
 *  
 */

import java.util.Arrays;

public class nextPermutation {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,3,4,2};

        // 1 step -> sbase pehle last wala peek index find kare
        int lastPeekIndex = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                lastPeekIndex = i;
            }
        }

        // 2 step -> chech karo kahi array decreasing order me to nahi hai
        if(lastPeekIndex == -1) {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+",");
            }
            return;
        }

        // 3 step -> Ab lastPeekIndex or lastPeekIndex-1 ke beech ka agar koi element right side me hai to usko swip karna hai lastPeekIndex-1 or jo right side me mila ex -> {1 2 3 5 4 2} => (swap 3 4 not 3 5) 
        // agar nahi mila to lastPeekIndex or lastPeekIndex-1 ko swip karna hai.  {1 2 3 4 3 2 3 4 2} => {1 2 3 4 3 2 4 2 3}
        int afterPeekElementIndexRightSide = lastPeekIndex; 
        for (int i = lastPeekIndex; i < arr.length; i++) {
            if(arr[i] > arr[lastPeekIndex-1] && arr[i] < arr[lastPeekIndex]) {
                afterPeekElementIndexRightSide = 1;
            }
        }

        // 4 step -> swap afterPeekElementIndexRightSide and lastPeekIndex-1
        int temp = arr[lastPeekIndex-1];
        arr[lastPeekIndex-1] = arr[afterPeekElementIndexRightSide];
        arr[afterPeekElementIndexRightSide] = temp;

        // 5 step -> lastPeekIndex se right side sort kar do
        Arrays.sort(arr, lastPeekIndex, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}
