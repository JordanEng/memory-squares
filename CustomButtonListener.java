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

public class CustomButtonListener implements ActionListener{

   JButton button;
   ArrayList<Integer> list;
   JFrame frame;
   String value;
   
   public CustomButtonListener(JButton button, ArrayList<Integer> list, JFrame frame) {
      this.button = button;
      this.list = list;
      this.frame = frame;
   }
   
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