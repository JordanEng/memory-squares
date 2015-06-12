/**
 * CustomButtonListener.java
 * Assignment: Final Project - Memory Squares
 * Purpose: The final project is an opportunity to 
 * pull together all the things we’ve learned this year 
 * and to learn new skills to create our own project.
 *
 * @version 06/12/15
 * @author Jordan Eng, Kim Rupp
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// This class assigns actions to the buttons, so they chagne when pressed 
public class CustomButtonListener implements ActionListener{

   JButton button;
   ArrayList<Integer> list;
   JFrame frame;
   String value;
   
   // Declares variables
   public CustomButtonListener(JButton button, ArrayList<Integer> list, JFrame frame) {
      this.button = button;
      this.list = list;
      this.frame = frame;
   }
   
   // The button turns red when the person gets it right.
   // It turns black and ends the program when the person gets it wrong
   public void actionPerformed(ActionEvent event){
      value = event.getActionCommand();
      if(value.equals("1")){
         button.setBackground(Color.RED);
      } else {
         button.setBackground(Color.BLACK);
         System.out.println("You Lost");
         frame.dispose();
      }
   }
}