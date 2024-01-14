package grokaem_algo_book;

import java.util.*;
import java.util.stream.Collectors;

public class Part1Tasks {

    static class TelephoneBook {
        public String surname;
        public String phone;

        public static TelephoneBook of(String surname, String phone) {

            TelephoneBook telephoneBook = new TelephoneBook();
            telephoneBook.surname = surname;
            telephoneBook.phone = phone;

            return telephoneBook;

        }

        @Override
        public String toString() {
            return "TelephoneBook{" +
                    "surname='" + surname + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

    private static String rndStr() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

    }

    //1.3
    private static String findPhoneBySurname(List<TelephoneBook> phoneBook, String surname) {

        Comparator<TelephoneBook> comparator = Comparator.comparing(x -> x.surname);

        phoneBook.sort(comparator);

        List<String> surnameList = phoneBook.stream().map(x -> x.surname).collect(Collectors.toList());

        long time1 = System.currentTimeMillis();

        BinarySearch binarySearch = new BinarySearch();

        int index = binarySearch.search(surnameList, surname);

        TelephoneBook telephoneBook = phoneBook.get(index);

        long time2 = System.currentTimeMillis();

        System.out.println(
                "yD76UjRx :: method findPhoneBySurname binary search part worked in " + (time2 - time1) + "ms"
        );

        return telephoneBook.phone;

    }

    //1.4
    private static String findSurnameByPhoneLinearly(List<TelephoneBook> phoneBook, String phone) {

        long time1 = System.currentTimeMillis();

        TelephoneBook telephoneBook = null;

        for (TelephoneBook tb : phoneBook) {

            if (Objects.equals(tb.phone, phone)) {
                telephoneBook = tb;
                break;
            }

        }

        long time2 = System.currentTimeMillis();

        System.out.println("mluNCbe4 :: method findSurnameByPhoneLinearly worked in " + (time2 - time1) + "ms");

        return Objects.requireNonNull(telephoneBook).surname;

    }

    //1.5
    private static void readAll(List<TelephoneBook> telephoneBooks) {

        long time1 = System.currentTimeMillis();

        int count = 0;

        for (TelephoneBook ignored : telephoneBooks) {
            count++;
        }

        System.out.println("6MRc4boR :: readAll count = " + count);

        long time2 = System.currentTimeMillis();

        System.out.println("mluNCbe4 :: method readAll worked in " + (time2 - time1) + "ms");

    }

    //1.6
    private static void readAllSurnameStartWith(List<TelephoneBook> telephoneBooks, String startWord) {

        long time1 = System.currentTimeMillis();

        long count = telephoneBooks.stream()
                .filter(x -> x.surname != null && x.surname.startsWith(startWord))
                .count();

        System.out.println("7VkCDz1A :: surnames staring with word = " + startWord + " count = " + count);

        long time2 = System.currentTimeMillis();

        System.out.println("m8lrD7CX :: method readAllSurnameStartWith worked in " + (time2 - time1) + "ms");

    }

    public static void main(String[] args) {

        List<TelephoneBook> telephoneBooks = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {

            telephoneBooks.add(TelephoneBook.of(rndStr(), rndStr()));

        }

        TelephoneBook telephoneBookToSearch = telephoneBooks.get(99999);

        System.out.println("nK0d2Ve1 :: TelephoneBook to search = " + telephoneBookToSearch);


        String phoneBySurname = findPhoneBySurname(telephoneBooks, telephoneBookToSearch.surname);

        System.out.println(
                "9TN1U6Cm :: found phone " + phoneBySurname +
                        " by surname " + telephoneBookToSearch.surname);

        String surnameByPhoneLinearly = findSurnameByPhoneLinearly(telephoneBooks, telephoneBookToSearch.phone);

        System.out.println(
                "501RSUi1 :: found surname = " + surnameByPhoneLinearly +
                        " by phone = " + telephoneBookToSearch.phone
        );

        readAll(telephoneBooks);

        readAllSurnameStartWith(telephoneBooks, rndStr().substring(0, 1));

    }

}
