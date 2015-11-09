/**
 * BoardFilled.java
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

// This class is everything pertaining to the starting patterned board
public class BoardFilled{
   private int size;
   private int dimension;
   private ArrayList<Integer> redSquares;
   
   // Constructor for the filled board
   public BoardFilled(int size){
      this.size = size;
      dimension = size * 100;
      redSquares = new ArrayList<Integer>();
   }
   
   // Generates the board with randomly colored squares by
   // by taking the number the user submitted before.
   public void createBoard() throws InterruptedException{
   
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(dimension, dimension));
      frame.setTitle("Watch the Squares");
      
      frame.setLayout(new GridLayout(size, size));
      for(int i = 0; i < size * size; i++){
         Random rand = new Random();
         int random = rand.nextInt(2);
         
         JButton current = new JButton();
         frame.add(current);
         
         if(random == 0) {
            current.setBackground(Color.RED);
            redSquares.add(1);
         }
         else{
            redSquares.add(0);
         }
      }
      
      frame.setVisible(true);
      Thread.sleep(size * 1000);
      frame.setVisible(false);
   }
   
   
   // Returns an ArrayList of the squares in the grid,
   // the colored ones as 1, and the uncolored ones as 0.
   public ArrayList returnBoxes(){
      return redSquares;
   }
}