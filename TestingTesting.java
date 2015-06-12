/**
 * TestingTesting.java
 * Assignment: Final Project - Memory Squares
 * Purpose: The final project is an opportunity to 
 * pull together all the things we’ve learned this year 
 * and to learn new skills to create our own project.
 *
 * @version 06/12/15
 * @author Jordan Eng, Kim Rupp
 */

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.Console;


// This class is the client class that runs the program
// as it creates the boards and the 
public class TestingTesting{
   public static void main(String[] args)
   throws InterruptedException{
      Scanner console = new Scanner(System.in);

      int size = 0;
      
      System.out.println("Welcome to Memory Squares!");
      Thread.sleep(2000);
      System.out.println("In this game, you need to remember the plaement");
      System.out.println("of the red squares and try to get rid of them.");
      Thread.sleep(2000);
      System.out.println("");
      System.out.println("Good Luck!");
      System.out.println("");
      Thread.sleep(2000);
      System.out.print("Input the size of your board (2-10): ");
      size = console.nextInt();
      System.out.println("You have " + size + " seconds. Get ready...");
      Thread.sleep(2000);
      
      BoardFilled board1 = new BoardFilled(size);
      board1.createBoard();
      ArrayList<Integer> lengthGrid = board1.returnBoxes();

      ClickBoard board2 = new ClickBoard(size, lengthGrid);
      board2.createFrame();
   }
}
