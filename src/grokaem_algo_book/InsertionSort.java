package grokaem_algo_book;

import java.util.Arrays;

public class InsertionSort {

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[i]) {

                    swap(arr, i, j);

                }

            }

            //45 < 12, 78 < 12, 96 < 12, 69 < 12, 12 < 12, 3 < 12 -> swap, 55 < 3, 73 < 3    { 3, 45, 78, 96, 69, 12, 12, 55, 73 }
            //78 < 45, 96 < 45, 69 < 45, 12 < 45 -> swap, 12 < 12, 55 < 12, 73 < 12          { 3, 12, 78, 96, 69, 45, 12, 55, 73 }
            //96 < 78, 69 < 78 -> swap, 45 < 69 -> swap, 12 < 45 -> swap, 55 < 12, 73 < 12   { 3, 12, 12, 96, 78, 69, 45, 55, 73 }
            //78 < 96 -> swap, 69 < 78 -> swap, 45 < 69 -> swap, 55 < 45, 73 < 45            { 3, 12, 12, 45, 96, 78, 69, 55, 73 }
            //78 < 96 -> swap, 69 < 78 -> swap, 55 < 69 -> swap, 73 < 55                     { 3, 12, 12, 45, 55, 96, 78, 69, 73 }
            //78 < 96 -> swap, 69 < 78 -> swap, 73 < 69                                      { 3, 12, 12, 45, 55, 69, 96, 78, 73 }
            //78 < 96 -> swap, 73 < 78 -> swap                                               { 3, 12, 12, 45, 55, 69, 73, 96, 78 }
            //78 < 96 -> swap                                                                { 3, 12, 12, 45, 55, 69, 73, 78, 96 }

        }

    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 78, 96, 69, 12, 3, 55, 73};

        System.out.println("KQC7agOx :: array before sort = " + Arrays.toString(arr));

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);

        System.out.println("K5Yi6Btn :: array after sort = " + Arrays.toString(arr));

    }

}
