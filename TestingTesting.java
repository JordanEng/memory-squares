/**
 * TestingTesting.java
 * Assignment: Final Project - Memory Squares
 * Purpose: The final project is an opportunity to 
 * pull together all the things we've learned this year
 * and to learn new skills to create our own project.
 *
 * @version 11/9/15
 * @author Jordan Eng
 */

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.Console;

// This class is the client class that runs the program
// as it creates the boards and the play again option.
public class TestingTesting{
   public static void main(String[] args) throws InterruptedException {
       Scanner console = new Scanner(System.in);
       int size = 0;

       JOptionPane.showMessageDialog(null, "Welcome to Memory Squares!");
       JOptionPane.showMessageDialog(null, "In this game, you need to remember the placement of the red squares and replicate the pattern");
       JOptionPane.showMessageDialog(null, "Good Luck!");

       while (true) {
           String sizeString = JOptionPane.showInputDialog("Input the size of your board (2-10): ");
           size = Integer.parseInt(sizeString);
           JOptionPane.showMessageDialog(null, "You have " + size + " seconds. Get ready...");

           BoardFilled board1 = new BoardFilled(size);
           board1.createBoard();
           ArrayList<Integer> lengthGrid = board1.returnBoxes();

           ClickBoard board2 = new ClickBoard(size, lengthGrid);
           board2.createFrame();

       }
   }

   // Asks the user if they want to play again
   public static boolean playAgain() throws InterruptedException{
       Scanner console = new Scanner(System.in);

       String choice = JOptionPane.showInputDialog("Do you want to play again? \"yes\" or \"no\"?: ");
       if(choice.equalsIgnoreCase("no")){
           return false;
       }
       return true;
    }
}
