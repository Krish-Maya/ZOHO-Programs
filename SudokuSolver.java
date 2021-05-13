class SudokuSolver{
	
    public void solveSudoku(char[][] board) {
	    if(solveSudokuGrid(board,0,0))
		{
		print(board);
		}
		else
		{
		System.out.println("Doesn't solve");
		}
        
    }
	public static boolean solveSudokuGrid(char board[][],int row,int col)
	{
		if(row==8&&col==9)
		{
			return true;
		}
		if(col==9)
		{
			row++;
			col=0;
		}
		if(board[row][col]!='.')
		{
			return solveSudokuGrid(board,row,col+1);
		}
		for(int i=1;i<=9;i++)
		{
			if(isSafe(board,row,col,i))
			{
				board[row][col]=(char)(i+48);
			
			 if(solveSudokuGrid(board,row,col+1))
			 return true;
			}
			board[row][col]='.';
			
		}
		return false;
	}
	static void print(char[][] matrix)
	{
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	public static boolean isSafe(char board[][],int row,int col,int num)
	{
		
		for (int x = 0; x <= 8; x++)
			if (board[row][x] ==(char)(num+48))
				return false;
		for (int x = 0; x <= 8; x++)
			if (board[x][col] == (char)(num+48))
				return false;

		int startRow = row - row % 3, startCol
									= col - col % 3;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (board[i + startRow][j + startCol] == (char)(num+48))
					return false;

		return true;
	}
    
    public static void main(String[] args)
    {
        SudokuSolver s= new SudokuSolver();
       char grid[][]={{'5','3','.','.','7','.','.','.','.'},
                     {'6','.','.','1','9','5','.','.','.'},   
					 {'.','9','8','.','.','.','.','6','.'}, 
					 {'8','.','.','.','6','.','.','.','3'}, 
					 {'4','.','.','8','.','3','.','.','1'},  
					 {'7','.','.','.','2','.','.','.','6'}, 
					 {'.','6','.','.','.','.','2','8','.'},  
					 {'.','.','.','4','1','9','.','.','5'},  
					 {'.','.','.','.','8','.','.','7','9'} };
        s.solveSudoku(grid);
        
}
}