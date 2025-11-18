import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number");
        int size = keyboard.nextInt();

        boolean even = (size % 2 == 0);
        int middle = size / 2;

        // odd: print exactly size rows
        if (!even) {

            for (int row = 0; row < size; row++) {

                int gap = row - middle;
                if (gap < 0) gap = -gap;

                int spaces = gap;
                int stars = size - (2 * gap);

                for (int col = 0; col < spaces; col++) System.out.print(" ");
                for (int col = 0; col < stars; col++) System.out.print("*");

                System.out.println();
            }
        }

        // even: print size + 1 rows
        else {

            // top part
            for (int row = 0; row <= middle; row++) {

                int spaces;
                int stars;

                if (row == 0) {
                    spaces = size;
                    stars = 1;
                } else {
                    stars = row * 2;
                    spaces = size - (stars - 1);
                }

                for (int col = 0; col < spaces; col++) System.out.print(" ");
                for (int col = 0; col < stars; col++) {
                    System.out.print("*");
                    if (col < stars - 1) System.out.print(" ");
                }

                System.out.println();
            }

            // bottom part
            for (int row = middle - 1; row >= 0; row--) {

                int spaces;
                int stars;

                if (row == 0) {
                    spaces = size;
                    stars = 1;
                } else {
                    stars = row * 2;
                    spaces = size - (stars - 1);
                }

                for (int col = 0; col < spaces; col++) System.out.print(" ");
                for (int col = 0; col < stars; col++) {
                    System.out.print("*");
                    if (col < stars - 1) System.out.print(" ");
                }

                System.out.println();
            }
        }

        keyboard.close();
    }
}
