public class quick {

    public static void quicksort(int arr[], int left, int right) {
        if (left < right) {
            int pivIdx = partition(arr, left, right);

            quicksort(arr, left, pivIdx - 1);
            quicksort(arr, pivIdx + 1, right);
        }
    }

    public static int partition(int arr[], int left, int right) {

        int idx = left - 1;
        int pivot = arr[right];

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                idx++;
                swap(arr, j, idx);
            }
        }

        idx++;
        swap(arr, idx, right);

        return idx;
    }

    public static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {8, 2, 5, 4, 9, 7, 1, 3};
        quicksort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

