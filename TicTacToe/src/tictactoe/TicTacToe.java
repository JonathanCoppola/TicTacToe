package tictactoe;

import java.util.*;
/**
 * Write a description of class TicTacToe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToe
{

    /**
     *
     */
    public static void main(String[ ]args){
       Scanner scan = new Scanner(System.in);
       boolean keepGoing = true;
       String[][] board = new String[3][3];
       for(int i = 0; i<board[0].length; i++){
               for(int j = 0; j<board[1].length; j++){
                  board[i][j] = "+";
                }
            }
       int col;
       int row;
       while(keepGoing = true){
           System.out.println("Player 1, where do you want to go? (Row, then Column, or 0 to quit)");
           row = scan.nextInt();
           col = scan.nextInt();
           
           if(row != 0 && col != 0){
               if((board[row-1][col-1]).equals("+")) {
                   board[row-1][col-1] = "X";
               } else {
               }
           }
           else{
               keepGoing = false;
           }
           for(int i = 0; i<board[0].length; i++){
               for(int j = 0; j<board[1].length; j++){
                   System.out.print(board[i][j]);
                }
               System.out.println();
            }
           System.out.println("Player 2, where do you want to go? (Row, then Column, or 0 to quit)");
           row = scan.nextInt();
           col = scan.nextInt();
           if(row != 0 && col != 0){
               if ((board[row-1][col-1]).equals("+")) {
                   board[row-1][col-1] = "O";
           }
           else{
               keepGoing = false;
           }
           for(int i = 0; i<board[0].length; i++){
               for(int j = 0; j<board[1].length; j++){
                   System.out.print(board[i][j]);
                }
               System.out.println();
            }
    }
}
    }

public static void playerMove(String player){
    int row = scan.nextInt();
    int col = scan.nextInt();
           
           if(row != 0 && col != 0){
               if((board[row-1][col-1]).equals("+")) {
                   board[row-1][col-1] = "X";
               } else {
               }
           }
           else{
               keepGoing = false;
           }
           for(int i = 0; i<board[0].length; i++){
               for(int j = 0; j<board[1].length; j++){
                   System.out.print(board[i][j]);
                }
               System.out.println();
            }
}
}
