package app;

public class Main2 {

    public static void main(String[] args) {

        int count = 0;

        String[] books = {

                "Great time",
                "Silver fog",
                "Super deal",
                "Great choice",
                "Bob and megan",
                "Mathematics"
        };

        for (int i = 0; i < books.length; i++) {

            String key = books[i];

            int j = i - 1;

            while (j >= 0 && (key.compareTo(books[j]) < 0)) {

                books[j + 1] = books[j];

                j--;
            }

            books[j + 1] = key;

        }

        System.out.println("Sorted books:");

        for (String book : books) {

            count++;

            System.out.println(count + ") " + book);
        }
    }
}

