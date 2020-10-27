public class CheckWinner {

    public static boolean checkWinner(char[][] board, char player) {
        if (checkDiagonal1(board, player) || checkDiagonal2(board, player) || checkRow(board, player) || checkColumn(board, player)) {
            System.out.println(player + "YOU WIN!");
            return true;
        }
        return false;
    }


    private static boolean checkDiagonal1(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != player) {
                return false;
            }
        }
        return true;
    }


    private static boolean checkDiagonal2(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][board.length - i - 1] != player) {
                return false;
            }
        }
        return true;
    }


    private static boolean checkRow(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            boolean win = true;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != player) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumn(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            boolean win = true;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != player) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

}