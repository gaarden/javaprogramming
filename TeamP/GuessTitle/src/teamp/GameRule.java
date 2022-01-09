package teamp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GameRule extends JPanel
{
   
   public GameRule(MainFrame frame)
   {
      System.out.println("GameRule");
      setLayout(null);
       setBackground(new Color(242,141,168));
       
       ImageIcon ruleBeforeIcon = new ImageIcon("src/img/054.png");
       
       Image ruleBefore = ruleBeforeIcon.getImage();
      Image ruleButton = ruleBefore.getScaledInstance(600, 600, Image.SCALE_SMOOTH);
      ImageIcon ruleIcon = new ImageIcon(ruleButton);
      
      JButton rule = new JButton(ruleIcon);
      
      rule.setBounds(250, -30, 600, 600);
      add(rule);
      rule.setBorderPainted(false);
      rule.setFocusPainted(false);
      rule.setContentAreaFilled(false);
      
      //next버튼 생성
      ImageIcon nextButtonIcon=new ImageIcon("src/img/n1.png");
      ImageIcon nextPressedIcon=new ImageIcon("src/img/n2.png");
      JButton nextButton=new JButton("src/img/n1.png",nextButtonIcon);
      nextButton.setPressedIcon(nextPressedIcon);
      
      Image nextButtonImageBefore=nextButtonIcon.getImage();
      Image nextButtonImage1=nextButtonImageBefore.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
      ImageIcon nextButtonFinalIcon=new ImageIcon(nextButtonImage1);
      
      Image nextButtonImageBeforePreesed=nextPressedIcon.getImage();
      Image nextButtonImage2=nextButtonImageBeforePreesed.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
      ImageIcon nextButtonFinalEntIcon=new ImageIcon(nextButtonImage2);
      
      JButton nextButtonFinal =new JButton(nextButtonFinalIcon);
      nextButtonFinal.setRolloverIcon(nextButtonFinalEntIcon);
      
      nextButtonFinal.setBounds(750, 450, 200, 200);
      nextButtonFinal.setBorderPainted(false);
      nextButtonFinal.setFocusPainted(false);
      nextButtonFinal.setContentAreaFilled(false);
      
      add(nextButtonFinal);
      
      nextButtonFinal.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             frame.selectTheme();
             }}); 
       
   }
}