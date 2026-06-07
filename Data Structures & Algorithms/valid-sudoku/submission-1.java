class Solution {
    public boolean isValidSudoku(char[][] board) {






// row and column check
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if (Character.isDigit(board[i][j])) {
                    if (rowSet.contains(board[i][j])) return false;
                    rowSet.add(board[i][j]);
                }

                if (Character.isDigit(board[j][i])) {
                    if (colSet.contains(board[j][i])) return false;
                    colSet.add(board[j][i]);
                }
            }
        }


         HashSet<Character> charactersRow = new HashSet<>();

        int row = 0, col = 0;


        for (int boxRow = 0; boxRow < 9; boxRow = boxRow + 3) {
            for (int boxCol = 0; boxCol < 9; boxCol = boxCol + 3) {


                for (row = boxRow; row < boxRow+3; row++) {
                    for (col = boxCol; col < boxCol+3; col++) {
                        if (Character.isDigit(board[row][col])) {
                            if (!charactersRow.contains(board[row][col])) {
                                charactersRow.add(board[row][col]);
                            } else {
                                return false;
                            }
                        }

                    }

                }
                charactersRow = new HashSet<>();
            }


        }
        return true;
    }
}
