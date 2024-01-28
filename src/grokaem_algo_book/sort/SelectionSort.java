package grokaem_algo_book.sort;

import java.util.Arrays;

@SuppressWarnings("DuplicatedCode")
public class SelectionSort {

    public void sortAsc(int[] arr) {

        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {

            int minIdx = i;

            for (int j = i + 1; j < size; j++) {

                int min = arr[minIdx];
                int next = arr[j];

                if (min > next) {
                    minIdx = j;
                }

            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }

    }

    public void sortDesc(int[] arr) {

        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {

            int maxIdx = i;

            for (int j = i + 1; j < size; j++) {

                int max = arr[maxIdx];
                int next = arr[j];

                if (next > max) {
                    maxIdx = j;
                }

            }

            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

        }

    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 78, 96, 69, 12, 3, 55, 73};

        System.out.println("array before sort asc" + Arrays.toString(arr));

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortAsc(arr);

        System.out.println("array after sort asc" + Arrays.toString(arr));

        System.out.println();

        int[] arr2 = {12, 45, 78, 96, 69, 12, 3, 55, 73};

        System.out.println("array before sort desc" + Arrays.toString(arr2));

        selectionSort.sortDesc(arr2);

        System.out.println("array after sort desc" + Arrays.toString(arr2));

    }

}
