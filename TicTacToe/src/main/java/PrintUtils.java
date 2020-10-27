public class PrintUtils {

    public static void printBoard(char[][] board) {
        System.out.println("");
        System.out.print("R\\C|");
        for (int i = 1; i < board.length; i++) {
            System.out.print(" " + (i) + " |");
        }
        System.out.print(" " + board.length);
        System.out.println();
        for (int j = 0; j < board.length; j++) {
            System.out.print("---+");
        }

        System.out.print("---");

        System.out.println();
        for (int i = 0; i < board.length - 1; i++) {
            System.out.print(" " + (i + 1) + " |");
            for (int j = 0; j < board.length - 1; j++) {
                System.out.print(" " + board[i][j] + " |");
            }
            System.out.print(" " + board[i][board.length - 1]);
            System.out.println();
            for (int j = 0; j < board.length; j++) {
                System.out.print("---+");
            }
            System.out.print("---");
            System.out.println();
        }
        System.out.print(" " + (board.length) + " |");
        for (int j = 0; j < board.length - 1; j++) {
            System.out.print(" " + board[board.length - 1][j] + " |");
        }
        System.out.print(" " + board[board.length - 1][board.length - 1]);


        System.out.println();
    }

}