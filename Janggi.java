
/**
 * Write a description of class Janggi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;

public class Janggi
{
    private String [][] board;
    Janggi()
    {
        String [][] board = {{" ","1","2","3","4","5","6","7","8","9"},
                             {"1","r","h","b","q"," ","q","b","h","r"},
                             {"2"," "," "," "," ","k"," "," "," "," "},
                             {"3"," ","c"," "," "," "," "," ","c"," "},
                             {"4","s"," ","s"," ","s"," ","s"," ","s"},
                             {"5"," "," "," "," "," "," "," "," "," "},
                             {"6"," "," "," "," "," "," "," "," "," "},
                             {"7","s"," ","s"," ","s"," ","s"," ","s"},
                             {"8"," ","c"," "," "," "," "," ","c"," "},
                             {"9"," "," "," "," ","k"," "," "," "," "},
                             {"10","r","h","b","q"," ","q","b","h","r"}};
            
    }

    public void printBoard()
    {
        System.out.println("\f");
        System.out.println("1   2   3   4   5   6   7   8   9");
        for(int r = 1; r < board.length; r++)
        {
            for(int c = 1; c < board[r].length; c++)
            {
                if (board [r][c] == 0)
                    System.out.print(" ");
                if ( c < board[r].length)
                    System.out.print(" | ");
            }
            System.out.println(r);
            if (r < board.length-1)
                System.out.println("--+---+---+---+---+---+---+---+---+---");
        }

        System.out.println("\nWELCOME TO JANGGI");
    }

    public void playGame()
    {

    }

    public void directions()
    {
        System.out.println("Janggi, also known as Korean Chess,");
        System.out.println("is a strategy board game that");
        System.out.println("derived from xiangqi(Chinese chess).");
        System.out.println("To move the pieces, type the piece and type in the coordinate.");
    }

    public void printPieces()
    {
        for (int r = 3; r < board.length; r++)
        {
            for (int c = 1; c < board[r].length; c++)
            {
                
            }
        }
    }

    public boolean removePiece()
    {
        return false;
    }

}
