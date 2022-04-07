package src;

// A simple program to demonstrate
// Tic-Tac-Toe Game.
import java.util.*;

public class TicTacToe {

    static String[] board;
    static String turn;

    // Finds if someone won (could rewrite in a better way)
    static String checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            // If any wincon is met, return winner
            if (line.equals("XXX")) {
                return "X";
            }else if (line.equals("OOO")) {
                return "O";
            }
        }

        // If no one has won and the board is full, it's a tie
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }

        // User move
        System.out.println(turn + "'s move! Enter a box number");
        return null;
    }

    // Board (board[x] will put in the player pieces for the square)
    static void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Tic Tac Toe Game!");
        printBoard();

        System.out.println("X's move! Enter a box number");

        while (winner == null) {
            int numInput;

            // Only valid responses allowed
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input, must be an open slot from 1-9");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, must be an open slot from 1-9");
                continue;
            }

            // Turn calculation
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }

                printBoard();
                winner = checkWinner();
            }
            else {
                System.out.println("Invalid input, must be an open slot from 1-9");
            }
        }

        // Draw message
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("Tie Game");
        }
        // Win message
        else {
            System.out.println(
                    "Congratulations " + winner + ", you won!");
        }
    }
}