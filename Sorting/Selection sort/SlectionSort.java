// chota element khij kar pehle dalna hai

public class SlectionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        
        for (int i = 0; i < arr.length-1; i++) {     //-1  kyuki last wala element already sorted hoga
            for (int j = i; j < arr.length; j++) {
                int minIndex = i;
                if(arr[minIndex] > arr [j]) {
                    minIndex = j;
                }

                // swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
