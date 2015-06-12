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

   //JButton button;
   ArrayList<Integer> list;
   JFrame frame;
   String value;
   ArrayList<Integer> list2;
   
   public CustomButtonListener(ArrayList<Integer> list, JFrame frame) {
      this.list = list;
      this.frame = frame;
      list2 = new ArrayList<Integer>();
      for (int i = 0; i < list.size(); i++) {
         list2.add(0);
      }
   }
   
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