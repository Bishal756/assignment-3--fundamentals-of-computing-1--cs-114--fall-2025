import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int size = keyboard.nextInt();
        System.out.println();

        Matrix table = new Matrix(size);

        System.out.println("Initial matrix:");
        table.printMatrix();
        System.out.println();

        System.out.println("Populating matrix...");
        table.populateMatrix();
        System.out.println("Matrix with values:");
        table.printMatrix();
        System.out.println();

        System.out.println("Flipping matrix...");
        table.flipMatrix();
        System.out.println("Matrix after flip:");
        table.printMatrix();

        keyboard.close();
    }
}
