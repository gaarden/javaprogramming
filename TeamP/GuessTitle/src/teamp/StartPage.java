package teamp;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.*;

public class StartPage extends JPanel
{
   public StartPage(MainFrame frame)
   {
      System.out.println("StrartPage");
      setLayout(null);
      setBackground(new Color(242, 177, 56)); // 배경색
      frame.setVisible(true);
      
      /* 제목 label */
      JLabel titleLabel = new JLabel("제목을 맞혀봐!");
      titleLabel.setForeground(Color.WHITE);
      titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
      titleLabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 80));
      titleLabel.setBounds(200, 50, 600, 296);
      add(titleLabel);
      
      /* 시작 버튼 생성 */
      ImageIcon startBeforeIcon = new ImageIcon("src/img/003.png");
      ImageIcon startBeforeEntIcon = new ImageIcon("src/img/004.png");
      
      // 크기 변경
      Image startBefore = startBeforeIcon.getImage();
      Image startButton1 = startBefore.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
      ImageIcon startButtonIcon = new ImageIcon(startButton1);
      
      Image startBeforeEnt = startBeforeEntIcon.getImage();
      Image startButton2 = startBeforeEnt.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
      ImageIcon startButtonEntIcon = new ImageIcon(startButton2);
      //
      
      JButton startButton = new JButton(startButtonIcon);
      startButton.setRolloverIcon(startButtonEntIcon); // 마우스 올렸을때 바뀜
      
      startButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            frame.gameRule();
            }});
      
      startButton.setBounds(350, 250, 300, 300);
      startButton.setBorderPainted(false);
      startButton.setFocusPainted(false);
      startButton.setContentAreaFilled(false);
      add(startButton);
   }
}