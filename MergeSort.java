 class MergeSort {
    public void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(array, left, mid);
            sort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays back into array[left..right]
        int i = 0, j = 0; // Initial indexes of first and second subarrays
        int k = left;    // Initial index of merged subarray

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Driver method to test the algorithm
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        MergeSort sorter = new MergeSort();
        sorter.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}