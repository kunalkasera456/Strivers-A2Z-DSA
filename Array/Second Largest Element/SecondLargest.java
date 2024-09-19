

public class SecondLargest {

    public static void main(String[] args) {
        int [] arr = {12, 35, 1, 10, 34, 1};

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        int minDistance = Integer.MAX_VALUE;
        int store = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currentDistance = maxValue - arr[i];
            if(minDistance > currentDistance && arr[i] != maxValue) {
                minDistance = currentDistance;
                store = arr[i];
            }
        }
        System.out.println(store);
    }
}
