public class Matrix {

    private int[][] matrix; // holds the numbers
    private static final String Y = "\u001B[33m"; // yellow
    private static final String R = "\u001B[0m";  // reset

    public Matrix(int size) {
        matrix = new int[size][size];
        System.out.println("Matrix created: " + size + " x " + size);
    }

    // swaps two positions using x1,y1,x2,y2
    private void swap(int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    // fills with 1..n
    public void populateMatrix() {
        int value = 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = value;
                value++;
            }
        }
    }

    // prints matrix with diagonal highlighted
    public void printMatrix() {
        int size = matrix.length;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                boolean diagonal = (row + col == size - 1);

                if (diagonal) {
                    System.out.printf(Y + "%4d" + R, matrix[row][col]);
                } else {
                    System.out.printf("%4d", matrix[row][col]);
                }
            }
            System.out.println();
        }
    }

    // flips everything across the anti-diagonal
    public void flipMatrix() {
        int size = matrix.length;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                // skip the diagonal
                if (row + col == size - 1) continue;

                // only flip on one side (to avoid double swapping)
                if (row + col < size - 1) {

                    int x2 = size - 1 - col; // mirrored row
                    int y2 = size - 1 - row; // mirrored column

                    // swap using x1,y1,x2,y2
                    swap(row, col, x2, y2);
                }
            }
        }
    }
}
