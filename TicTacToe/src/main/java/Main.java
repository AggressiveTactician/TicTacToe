public class Main {

    public static void main(String[] args) {


        //board definition
        Board board = new Board(ScannerUtils.getFromScanner("Choose field size:"));

        //character selection
        char player = Board.getPlayer();

        //game
        boolean win = false;
        int movesCounter = 0;
        while (movesCounter < board.getBoard().length * board.getBoard().length && !win) {
            PrintUtils.printBoard(board.getBoard());
            if (Move.moveLogic(board.getBoard(), player)) {
                movesCounter++;
                win = CheckWinner.checkWinner(board.getBoard(), player);
                player = player == 'O' ? 'X' : 'O';
            } else {
                System.out.println("Wrong move. Try again: ");
            }

        }
        PrintUtils.printBoard(board.getBoard());
        System.out.println("The end");

    }
}