/*
 * Some code hints to inspire your answer to
 * the fall break programming assignment...
 */
public class TicTacToeHints
{
	// outputs a 2D array of chars as a board/square
	public static void printBoard(char[][] a) // n*(n+n) = O(n^2)
	{
		int rowLength = a.length;	// number of rows
		for(int row = 0; row < rowLength; row++)
        {
			int columnLength = a[row].length;	// number of columns in a row
			for(int col = 0; col < columnLength; col++)
			{
				System.out.print( a[row][col] );
				if(col < columnLength-1)
				{	System.out.print("|");
				}
			}
			System.out.println();
			if(row < rowLength-1)
			{	for(int i = 0; i < columnLength*2-1; i++)
				{	System.out.print("-");
				}
			}
			System.out.println();
        }
	}

	// checks if a row exists and its index is valid before printing it
	public static boolean printRow(char[][] board, int row)
	{
		if( board == null || row < 0 || row >= board.length )
		{	System.out.println("Empty board/row out of bounds.");
			return false;
		}
		
		for(int col = 0; col < board[row].length; col++) // iterates over each column
		{
			System.out.print(board[row][col] + " ");
		}
		System.out.println();
		return true;
	}

	// validates a column index before printing it
	public static boolean printColumn(char[][] board, int col)
	{
		if( board == null || col > board[0].length)
		{	System.out.println("Empty board/column out of bounds.");
			return false;
		}
		if( col < 0 )			// these 3 lines could be replaced by
		{	col = col * -1;		// col = Math.abs(col);
		}						// 
		// iterate over each row
		for(int row = 0; row < board.length; row++)
		{	System.out.println(board[row][col] + " ");
		}
		System.out.println();
		return true;
	}

	public static void main(String[] args)
	{	/*	declare and instantiate an array:
			dataType[][] arrayName = new dataType[rowSize][columnSize];
		*/
		//char[][] board = new char[3][3];
		char[][] board= {	{ '1', '2', '3' },
							{ '4', '5', '6' },
							{ '7', '8', '9' }
						};
		
		printBoard(board);
		System.out.println();
		
		char[][] board2= {	{ '1', '2', '3', '4', '5' },
							{ '6', '7', '8', '9', 'A' },
							{ 'B', 'C', 'D', 'E', 'F' },
							{ 'G', 'H', 'I', 'J', 'K' },
							{ 'L', 'M', 'N', 'O', 'P' }
						};
		
		printBoard(board2);
		System.out.println();
		
		System.out.println("\nPrinting rows indices 3 & 9");
		System.out.println( printRow(board2, 3) );
		System.out.println( printRow(board2, 9) );
		
		System.out.println("\nPrinting columns indices 3 & 9");
		printColumn(board2, 3);
		printColumn(board2, 9);

	}
}
