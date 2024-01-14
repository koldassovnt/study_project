package grokaem_algo_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("DuplicatedCode")
public class BinarySearch {

    public int search(List<String> stringList, String target) {

        int low = 0;
        int high = stringList.size() - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int comparison = target.compareTo(stringList.get(mid));

            if (comparison == 0) {
                return mid; // Target found
            } else if (comparison < 0) {
                high = mid - 1; // Target lies in the first half
            } else {
                low = mid + 1; // Target lies in the second half
            }

        }

        throw new RuntimeException("etF8swSo :: guessed string does not exists in the list ");

    }

    public int search(List<Integer> list, Integer guessedNum) {

        int low = 0;
        int high = list.size(); // 1000

        if (guessedNum > high) {
            throw new RuntimeException("0VbxAxh4 :: guessed number does not exists in the list ");
        }

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

        throw new RuntimeException("35cL61kD :: Wrong algorithm work");

    }

    public int search(List<Integer> list, Integer guessedNum, int low, int high) {

        if (guessedNum > list.size()) {
            throw new RuntimeException("vD8DwWe0 :: guessed number does not exists in the list ");
        }

        int mid = (low + high) / 2;

        Integer guess = list.get(mid);

        if (Objects.equals(guess, guessedNum)) {
            return mid;
        }

        if (guess > guessedNum) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }

        return search(list, guessedNum, low, high);

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }

        Integer guessedNum = 967;

        BinarySearch binarySearch = new BinarySearch();

        int index = binarySearch.search(list, guessedNum);

        System.out.println("2Cl9KU29 :: index = " + index);

        int index2 = binarySearch.search(list, guessedNum, 0, list.size());

        System.out.println("C9QTElNi :: index 2 = " + index2);

    }

}
