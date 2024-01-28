package grokaem_algo_book;

import java.util.Arrays;

public class CountingSort {

    public int[] sort(int[] arr) {

        int length = arr.length;

        if (length <= 1) {
            return arr;
        }

        int maxNum = arr[0];

        for (int i = 1; i < length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }

        int[] countArr = new int[maxNum + 1];

        for (int i : arr) {
            countArr[i]++;
        }

        for (int i = 1; i <= maxNum; i++) {
            countArr[i] += countArr[i - 1];
        }

        int[] outputArr = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            outputArr[countArr[arr[i]] - 1] = arr[i];
            countArr[arr[i]]--;
        }

        return outputArr;

    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        CountingSort countingSort = new CountingSort();

        int[] sorted = countingSort.sort(arr);

        System.out.println("nZMEzS74 :: before sort = " + Arrays.toString(arr));

        System.out.println("Wd83EuyA :: after sort = " + Arrays.toString(sorted));

    }

}
