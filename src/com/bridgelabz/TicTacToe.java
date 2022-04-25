package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    static  char[] board() {
        char[] arr = new char[11];
        for (int i = 1; i <= 9; i++) {
            arr[i] = ' ';
        }
        return arr;
    }
    static void input () {

        System.out.println("enter X and O as a input");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if (input == 'X') {
            System.out.println("the value is X");
        }
        else if(input=='O')
        {
            System.out.println("the value is O");
        }
        else
        {
            System.out.println("enter a valid input");
        }

    }
    static void createBoard(char[]  board)
    {
        System.out.println("\n"+ board[1]+"|"+board[2]+"|"+board[3]);
        System.out.println("---------");
        System.out.println(""+board[4]+"|"+board[5]+"|"+board[6]);
        System.out.println("---------");
        System.out.println(""+board[7]+"|"+board[8]+"|"+board[9]);
    }
    public static void main(String[] args) {
        board();
        input();
        char[] board=board();
        createBoard(board);

    }
}

