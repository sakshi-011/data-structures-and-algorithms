package Leetcode.OneToThousand.OneToHundred;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] grid = new int[9][9];
        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.')
                    continue;
                int val = board[i][j]-'1';
                row[i][val]++;
                col[j][val]++;
                if(i<3){
                    grid[j/3][val]++;
                }else if(i<6){
                    grid[3+j/3][val]++;
                }else{
                    grid[6+j/3][val]++;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(grid[i][j] > 1 || row[i][j] > 1 || col[i][j] > 1)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }

}
