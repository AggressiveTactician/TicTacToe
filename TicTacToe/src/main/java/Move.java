public class Move {


    public static boolean moveLogic(char[][] board, char player) {
        int row = getRow(board, player);
        int column = getColumn(board, player);

        if (board[row - 1][column - 1] == ' ') {
            board[row - 1][column - 1] = player;
            return true;
        } else {
            return false;
        }


    }


    private static int getRow(char[][] board, char player) {
        int row = 0;
        while (true) {
            row = ScannerUtils.getFromScanner(player + " - select row: ");
            if (row > 0 && row <= board.length) {
                return row;
            } else {

                System.out.println("Wrong row number");
            }
        }
    }


    private static int getColumn(char[][] board, char player) {
        int column = 0;
        while (true) {
            column = ScannerUtils.getFromScanner(player + " - select column: ");
            if (column > 0 && column <= board.length) {
                return column;
            } else {
                System.out.println("Wrong column number");
            }
        }
    }


}