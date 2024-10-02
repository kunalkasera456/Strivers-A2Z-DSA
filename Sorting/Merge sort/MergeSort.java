
public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        int[] mergeArray = new int [end-start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (idx1 <= idx2) {
                mergeArray[x++] = arr[idx1++];
            } else {
                mergeArray[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            mergeArray[x++] = arr[idx1++];
        }
        while (idx2 <= end) {
            mergeArray[x++] = arr[idx2++];
        }

        for (int i = 0, j = start; i < mergeArray.length; i++, j++) {
            arr[j] = mergeArray[i];
        }
    }
    public static void divide(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        divide(arr, 0, n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
