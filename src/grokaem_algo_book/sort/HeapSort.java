package grokaem_algo_book.sort;

import java.util.Arrays;

public class HeapSort {

    public void sort(int[] arr) // arr = { 10, 7, 8, 9, 1, 5 }
    {
        int n = arr.length;

        System.out.println("X8e99aYI n = " + n);

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) { // (6 / 2 - 1) = 2

            heapify(arr, n, i);

            System.out.println("lP89VuFL :: after heapify = " + Arrays.toString(arr) + " for i = " + i);

        }

        System.out.println();

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {

            System.out.println("K0OT8DgR :: before moving max to end = " + Arrays.toString(arr));

            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            System.out.println("Y5ka9SJX :: before max heapify = " + Arrays.toString(arr));

            // call max heapify on the reduced heap
            heapify(arr, i, 0);

            System.out.println("3QkUE2EC :: after max heapify = " + Arrays.toString(arr));

        }

        System.out.println();

    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int[] arr, int n, int i) // arr = { 10, 7, 8, 9, 1, 5 }
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {

        HeapSort heapSort = new HeapSort();

        int[] arr = { 10, 7, 8, 9, 1, 5 };

        System.out.println("e4f0i0cI :: arr before sort = " + Arrays.toString(arr) + "\n");

        heapSort.sort(arr);

        System.out.println("9hX1qNV7 :: arr after sort = " + Arrays.toString(arr));

    }

}
