package app;

import java.util.Scanner;

public class Main3 {

    private final static int WINNER = 2907;

    public static void main(String[] args) {

        int[] codes = new int[]{2568, 1825, 1401, 2907, 8812, 9009};

        Scanner sc = new Scanner(System.in);

        System.out.println("Input ticket code: ");

        int search = sc.nextInt();

        int idx = -1;

        for (int i = 0; i < codes.length; i++) {

            if (codes[i] == search)

                idx = i;
        }

        if (idx > -1 & search == WINNER)

            System.out.println("Ticket " + search + " is Winner :)");

        else

            System.out.println("Ticket " + search + " is not Winner :(");
    }
}



