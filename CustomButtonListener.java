/**
 * CustomButtonListener.java
 * Assignment: Final Project - Memory Squares
 * Purpose: The final project is an opportunity to 
 * pull together all the things we�ve learned this year 
 * and to learn new skills to create our own project.
 *
 * @version 06/12/15
 * @author Jordan Eng, Kim Rupp
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// This class implements ActionListener to allow for 
// different acitons when our buttons are clicked
public class CustomButtonListener implements ActionListener{

   ArrayList<Integer> list;
   JFrame frame;
   String value;
   ArrayList<Integer> list2;
   
   // Constructor that takes in the correct ArrayList, the button frame
   // and creates an ArrayList to store the users clicks
   public CustomButtonListener(ArrayList<Integer> list, JFrame frame) {
      this.list = list;
      this.frame = frame;
      list2 = new ArrayList<Integer>();
      for (int i = 0; i < list.size(); i++) {
         list2.add(0);
      }
   }
   
   // Changes the colors of the buttons depending on which one is clicked by using
   // the ArrayList to determine. If an incorrect button is clicked, the game ends.
   // Also, it compares the ArrayLists of the user and the randomly generated one
   // to determine when the user has won the game.
   public void actionPerformed(ActionEvent event){
      value = event.getActionCommand();
      JButton button = (JButton)event.getSource();
      String[] s = value.split(" ");
      if(s[0].equals("1")){
         button.setBackground(Color.RED);
      } else {
         button.setBackground(Color.BLACK);
         System.out.println("You Lost");
         frame.dispose();
      }
      int i = Integer.parseInt(s[1]);
      int j = Integer.parseInt(s[0]);
      list2.set(i, j);
      if (list.equals(list2)) {
         System.out.println("You Won");
         frame.dispose();
      }
   }
}