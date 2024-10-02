

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        // 7 8 3 1 2
        // j i

        int n = arr.length;
        // Traverse through 1 to n (starting from the second element)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to be placed
            int j = i - 1;

            // Move elements that are greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift the larger element to the right
                j = j - 1;
            }
            // Place the key in its correct position
            arr[j + 1] = key;
        }
             
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

}
