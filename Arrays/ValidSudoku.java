/*Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
*/

/*
 * Logic:
 * Read the node above. It may not be solvabel. We need to validate only filled cells
 * 
 * Maintain 3 hashsets for row, column and cube validation
 * if a digit at a aprticular cell cannot be addded into a cooresponding set then return false
 * 
 * Traversal logic:
 * Horizontal traversal: mod operator -- %3 (i.e. column keeps getting increasing)
 * Vertical traversal: divide operator -- /3 (i.e. row keeps getting increasing)
 * 
 * Imagine ti given matrix in following 2 ways:
 * 1. 9*9 matrix (81 individual cells)
 * 2. 3*3 matrxi (9 individual cubes, where each cube is 3*3 matrix hence total 81 cells ultimately)
 * 
 */

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            HashSet<Character> rowSet = new HashSet<Character>();
            HashSet<Character> colSet = new HashSet<Character>();
            HashSet<Character> cubeSet = new HashSet<Character>();
            for(int j=0; j<9; j++){
                if(board[i][j]!='.' && !rowSet.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !colSet.add(board[j][i]))
                    return false;
                int cubeRowIndex = 3*(i/3);
                int cubeColIndex = 3*(i%3);
                if(board[cubeRowIndex + j/3][cubeColIndex + j%3]!='.' && !cubeSet.add(board[cubeRowIndex + j/3][cubeColIndex + j%3]))
                    return false;
            }
        }
        return true;
    }
}