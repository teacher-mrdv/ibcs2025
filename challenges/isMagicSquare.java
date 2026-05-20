public class isMagicSquare {

	public static boolean isMagic(int[][] m) {
		// your code here
		// check sums of diagonals
		// check sums of rows
		// check sums of columns
		// you may assume that the numbers do not repeat
		return true;
	}
	
	public static void print2Darray(int[][] a) {
		for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
	}
	
	public static void main(String[] args) {
        // Declare and initialize a 2D array with a 5x5 magic square
        int[][] magicSquare1 = {
            {17, 24, 1, 8, 15},
            {23, 5, 7, 14, 16},
            {4, 6, 13, 20, 22},
            {10, 12, 19, 21, 3},
            {11, 18, 25, 2, 9}
        };
        
        int[][] magicSquare2 = {
            {11, 17, 10, 24, 3},
            {25, 4, 14, 16, 6},
            {18, 23, 7, 5, 12},
            {2, 15, 19, 8, 21},
            {9, 13, 1, 22, 20}
        };
        
        int[][] invalidSquare = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

		int[][] magicSquare = {
            {30, 39, 48, 1, 10, 19, 28},
            {38, 47, 7, 9, 18, 27, 29},
            {46, 6, 8, 17, 26, 35, 37},
            {5, 14, 16, 25, 34, 36, 45},
            {13, 15, 24, 33, 42, 44, 4},
            {21, 23, 32, 41, 43, 3, 12},
            {22, 31, 40, 49, 2, 11, 20}
        };
        // Print the magic square
        System.out.println("Magic Squares\n");
        
        print2Darray(magicSquare1);
        System.out.println("isMagic? T " + isMagic(magicSquare1) + "\n");
        print2Darray(magicSquare2);
        System.out.println("isMagic? T " + isMagic(magicSquare2) + "\n");
        print2Darray(invalidSquare);
        System.out.println("isMagic? F " + isMagic(invalidSquare) + "\n");
        print2Darray(magicSquare);
        System.out.println("isMagic? T " + isMagic(magicSquare) + "\n");
    }
}
