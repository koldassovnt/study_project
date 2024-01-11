package grokaem_algo_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BinarySearch {

    private static int binarySearch(List<Integer> list, Integer guessedNum) {

        int low = 0;
        int high = list.size(); // 1000

        while (low <= high) {

            int mid = (low + high) / 2; // 500, 750, 875, 938, 969, 953, 961, 965, 967, 966

            Integer guess = list.get(mid); // 501, 751, 876, 939, 970, 954, 962, 966, 968, 967

            if (Objects.equals(guess, guessedNum)) {
                return mid;
            }

            if (guess > guessedNum) {
                high = mid - 1; //                    968,                966
            } else {
                low = mid + 1; // 501, 751, 876, 939,      954, 962, 966,
            }

        }

        throw new RuntimeException("0VbxAxh4 :: guessed number does not exists in the list ");

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }

        Integer guessedNum = 967;

        int index = binarySearch(list, guessedNum);

        System.out.println(index);

    }

}
