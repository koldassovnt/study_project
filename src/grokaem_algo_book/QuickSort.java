package grokaem_algo_book;

import java.util.Arrays;

public class QuickSort {

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        System.out.printf("s41IluBS :: pivot = %s, low = %s, high = %s \n", pivot, low, high);

        int smallElementIdx = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            System.out.println("ZmcTqMra :: arr in partition = " + Arrays.toString(arr));

            if (arr[j] < pivot) {
                System.out.println("54vcGX7u :: arr[j] < pivot = " + arr[j] + "<" + pivot);
                smallElementIdx++;
                swap(arr, smallElementIdx, j);
            }
        }

        System.out.println("HSI1zDd8 :: after for loop in partition = " + Arrays.toString(arr));

        System.out.println("p61mnFEb :: last smallElementIdx in partition = " + smallElementIdx);

        swap(arr, smallElementIdx + 1, high);

        System.out.println("k6N4H19p :: arr after last swap in partition " + Arrays.toString(arr));

        return (smallElementIdx + 1);
    }

    public void sort(int[] arr, int low, int high) {

        System.out.printf("p2uuQ36M :: low = %s and high = %s \n", low, high);

        if (low < high) {
            int pi = partition(arr, low, high);

            System.out.printf("bXXTtr2S :: pi = %s \n\n", pi);

            sort(arr, low, pi - 1);//left side from pi

            sort(arr, pi + 1, high);//right side from pi
        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };

        QuickSort quickSort = new QuickSort();

        System.out.println("fQv63SFT :: Array before sort = " + Arrays.toString(arr) + "\n");

        quickSort.sort(arr, 0, arr.length - 1);

        System.out.println("1n91V8pW :: Array after sort = " + Arrays.toString(arr));

    }

}
