package abhi.coding.solution.LeetCode.problem36.ValidSudoku;

/*problem statement
        Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

        Each row must contain the digits 1-9 without repetition.
        Each column must contain the digits 1-9 without repetition.
        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

        Note:

        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
        Only the filled cells need to be validated according to the mentioned rules.

        */

import java.util.HashSet;

public class SolutionValidSudoku {
    public static void main(String[] args) {
       // System.out.println("morning sunshine");
        char[][] table = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        //char[][] board = new char[9][9];+

        char[][] board = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        SolutionValidSudoku solutionValidSudoku = new SolutionValidSudoku();
        solutionValidSudoku.isValidSudoku(board);
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(i + "  row & column " + j + "  " + board[i][j]);
            }
            System.out.println();
        }
        return false;
    }
}
