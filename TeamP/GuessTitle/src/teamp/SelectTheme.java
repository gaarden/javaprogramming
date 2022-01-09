package teamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

enum Theme { EASY, NORMAL, HARD };

public class SelectTheme extends JPanel{
   
   //일단 지금은 한번도 안쓴것들
   private JLabel levelLabel;
   private Theme theme = Theme.EASY;
   public JTextField setName;
   //
   public SelectTheme(MainFrame frame) {
      System.out.println("selectTheme");
      setLayout(null);
         setBackground(new Color(200, 163, 217));
         
         /*이름 입력*/
         JLabel askName = new JLabel("이름을 입력하세요.");
         askName.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
         askName.setBounds(150, 400, 400, 59);
         add(askName);
         
         
         setName=new JTextField("입력안함");//초기값 입력안함으로 지정
         setName = new JTextField();
         setName.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
         setName.setBackground(new Color(255, 235, 135));
         setName.setBorder(null);
         setName.setBounds(400, 410, 450, 40);
         add(setName);
      
      //1990버튼생성
      ImageIcon theme1990ButtonIcon = new ImageIcon("src/img/1990.png");
      ImageIcon theme1990PressedIcon = new ImageIcon("src/img/c1990.png");
      ImageIcon theme1990SelectedIcon = new ImageIcon("src/img/c1990.png");
      JButton theme1990Button = new JButton("src/img/1990.png",theme1990ButtonIcon);
      theme1990Button.setPressedIcon(theme1990PressedIcon);
      theme1990Button.setSelectedIcon(theme1990SelectedIcon);
      
      // 크기 변경
      Image theme1990Before = theme1990ButtonIcon.getImage();
      Image themeButton1 = theme1990Before.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
      ImageIcon t1990ButtonIcon = new ImageIcon(themeButton1);
      
      Image theme1990BeforePressed = theme1990PressedIcon.getImage();
      Image themeButton11 = theme1990BeforePressed.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
      ImageIcon theme1990ButtonEntIcon = new ImageIcon(themeButton11);
      
      JButton t1990Button = new JButton(t1990ButtonIcon);
      t1990Button.setRolloverIcon(theme1990ButtonEntIcon); // 마우스 올렸을때 바뀜
      

      t1990Button.setBounds(50, 80, 250, 250);
       t1990Button.setBorderPainted(false);
      t1990Button.setFocusPainted(false);
      t1990Button.setContentAreaFilled(false);
      t1990Button.setSelected(false);
      
      
      //2000버튼생성
      ImageIcon theme2000ButtonIcon = new ImageIcon("src/img/2000.png");
      ImageIcon theme2000PressedIcon = new ImageIcon("src/img/c2000.png");   
      ImageIcon theme2000SelectedIcon = new ImageIcon("src/img/c2000.png");
      JButton theme2000Button = new JButton("src/img/2000.png",theme2000ButtonIcon);
      theme2000Button.setPressedIcon(theme2000PressedIcon);
      theme2000Button.setSelectedIcon(theme2000SelectedIcon);
      
      Image theme2000Before = theme2000ButtonIcon.getImage();
      Image themeButton2 = theme2000Before.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
      ImageIcon t2000ButtonIcon = new ImageIcon(themeButton2);
       
      Image theme2000BeforePressed = theme2000PressedIcon.getImage();
      Image themeButton21 = theme2000BeforePressed.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
      ImageIcon theme2000ButtonEntIcon = new ImageIcon(themeButton21);
      
      JButton t2000Button = new JButton(t2000ButtonIcon);
      t2000Button.setRolloverIcon(theme2000ButtonEntIcon);
       
        t2000Button.setBounds(375, 80, 250, 250);
      t2000Button.setBorderPainted(false);
      t2000Button.setFocusPainted(false);
      t2000Button.setContentAreaFilled(false);
      
      
      
      //2010버튼 생성
      ImageIcon theme2010ButtonIcon = new ImageIcon("src/img/2010.png");
      ImageIcon theme2010PressedIcon = new ImageIcon("src/img/c2010.png");   
      ImageIcon theme2010SelectedIcon = new ImageIcon("src/img/c2010.png");
      JButton theme2010Button = new JButton("src/img/2010.png",theme2010ButtonIcon);
      theme2010Button.setPressedIcon(theme2010PressedIcon);
      theme2010Button.setSelectedIcon(theme2010SelectedIcon);
      
      Image theme2010Before = theme2010ButtonIcon.getImage();
      Image themeButton3 = theme2010Before.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
      ImageIcon t2010ButtonIcon = new ImageIcon(themeButton3);
      
      Image theme2010BeforePressed = theme2010PressedIcon.getImage();
      Image themeButton31 = theme2010BeforePressed.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
      ImageIcon theme2010ButtonEntIcon = new ImageIcon(themeButton31);
      
      JButton t2010Button = new JButton(t2010ButtonIcon);
      t2010Button.setRolloverIcon(theme2010ButtonEntIcon);
         
      
        t2010Button.setBounds(700, 80, 250, 250);
      t2010Button.setBorderPainted(false);
      t2010Button.setFocusPainted(false);
      t2010Button.setContentAreaFilled(false);
      
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
     
      //버튼 눌렀을때 구현
         t1990Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               t1990Button.setSelected(true);
               t2000Button.setSelected(false);
               t2010Button.setSelected(false);
               theme = Theme.EASY;
            }
            });
      
         t2000Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               t1990Button.setSelected(false);
               t2000Button.setSelected(true);
               t2010Button.setSelected(false);
               theme = Theme.NORMAL;
            }
            });
      
         t2010Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               t1990Button.setSelected(false);
               t2000Button.setSelected(false);
               t2010Button.setSelected(true);
               theme = Theme.HARD;
            }});
         nextButtonFinal.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  frame.game1990(setName.getText());
                  theme = Theme.EASY;
               }

                 
               });
        
      //버튼 붙히기
      add(t1990Button);
      add(t2000Button);
      add(t2010Button);
      add(nextButtonFinal);
      
      
         

         
      }
   
}


   