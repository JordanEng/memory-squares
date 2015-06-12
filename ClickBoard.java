/**
 * ClickBoard.java
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

public class ClickBoard {
   
   private int size;
   private int dimension;
   ArrayList buttons = new ArrayList<JButton>();
   ArrayList correctButtons = new ArrayList<Integer>();
   
   public ClickBoard(int size, ArrayList<Integer> list){
      this.size=size;
      dimension=size*100;
      correctButtons = list;
   } 
   
   public void createFrame(){
      
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(dimension,dimension));
      frame.setLayout(new GridLayout(size,size));

      for (int i=1; i<=size*size; i++){
         JButton temp = new JButton();
         temp.setActionCommand(correctButtons.get(i - 1) + "");
         buttons.add(temp);
         frame.add(temp);
         CustomButtonListener b1 = new CustomButtonListener(temp, correctButtons, frame);
         temp.addActionListener(b1);
      }
      frame.setVisible(true); 
   }
}