class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(!isSafe(board,i,j))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
        
        
    }
    public static boolean isSafe(char board[][],int row,int col)
	{
		int count=0;
		for (int x = 0; x <= 8; x++)
        {
			if (board[row][x] ==board[row][col])
            {
                count++;
            }
        }
        if(count==2)
        {
				return false;
        }
        count=0;
		for (int x = 0; x <= 8; x++)
        {
			if (board[x][col] ==board[row][col])
            {
                count++;
            }
        }
        if(count==2)
        {
				return false;
        }
        count=0;
		int startRow = row - row % 3, startCol
									= col - col % 3;
		for (int i = 0; i < 3; i++)
        {
			for (int j = 0; j < 3; j++)
            {
				if (board[i + startRow][j + startCol] == board[row][col])
                {
                    count++;
                }
                }
        }
        if(count==2)
        {
					return false;
        }

		return true;
	}
    
    public static void main(String[] args)
    {
        ValidSudoku s= new ValidSudoku();
       char grid[][]={{'8','3','.','.','7','.','.','.','.'},
                     {'6','.','.','1','9','5','.','.','.'},   
					 {'.','9','8','.','.','.','.','6','.'}, 
					 {'8','.','.','.','6','.','.','.','3'}, 
					 {'4','.','.','8','.','3','.','.','1'},  
					 {'7','.','.','.','2','.','.','.','6'}, 
					 {'.','6','.','.','.','.','2','8','.'},  
					 {'.','.','.','4','1','9','.','.','5'},  
					 {'.','.','.','.','8','.','.','7','9'} };
				
        if (s.isValidSudoku(grid))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        
}
}
