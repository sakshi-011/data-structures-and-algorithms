package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class WordSearch {

    public static boolean exist(char[][] board, int i, int j, String word, boolean[][] visited, int index){
        if(index == word.length())
            return true;
        if(i<0 || i>=board.length || j<0 || j>=board[i].length || board[i][j] != word.charAt(index) || visited[i][j])
            return false;
        visited[i][j] = true;
        if(exist(board,i-1,j,word,visited,index+1)
            || exist(board,i+1,j,word,visited,index+1)
            || exist(board,i,j-1,word,visited,index+1)
            || exist(board,i,j+1,word,visited,index+1))
            return true;
        visited[i][j] = false;
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(word.charAt(0) == board[i][j] && exist(board,i,j,word,visited,0))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        String s = in.next();
        String[] str = s.replaceAll("\"","").replaceAll("\\[", "").split("],");
        char[][] board = new char[row][col];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            for (int j = 0; j < st.length; j++) {
                board[i][j] = st[j].charAt(0);
            }
        }
        String word = in.next();
        System.out.println(exist(board,word));
    }

}
