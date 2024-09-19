/*
        n = 5, arr1[] = {1, 2, 3, 4, 5}  
        m = 5, arr2 [] = {1, 2, 3, 6, 7}
        Output: 
        1 2 3 4 5 6 7             */


import java.util.TreeMap;

public class Union {

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5};
        int arr2 [] = {1, 2, 3, 6, 7};
        int n = arr1.length;
        int m = arr2.length;
       
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], null);
        }
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], null);
        }

        for (Integer integer : map.keySet()) {
            System.out.print(integer);
        }


    }
}
