package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    static void input() {
        System.out.println("enter x &y as input");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if (input == 'x') {
            System.out.println("the value is x");
        } else if (input == '0') {
            System.out.println("the value is o");
        } else {
            System.out.println("enter a valid in");
        }


    }


    public static void main(String[] args) {
        input();
    }
}


