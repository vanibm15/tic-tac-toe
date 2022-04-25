package com.bridgelabz;

public class TicTacToe {
    public static void main(String[] args) {
        char[] board = cboard();

    }

    private  static char[] cboard() {
           char[] cboard;
        {
            char[] board = new char[10];
            int i;
            for (i = 0; i <= board.length; i++)
            {
                board[i]='c';

            }
            return board;
        }
    }
}