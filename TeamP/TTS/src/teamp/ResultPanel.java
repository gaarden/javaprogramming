package teamp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ResultPanel extends JPanel {

   int strsize = 50, strlength = 0;

   public ResultPanel(MainFrame frame) {
      System.out.println("ResultPanel");
      setLayout(null);
      setBackground(new Color(235, 140, 140));
      frame.setVisible(true);

      strlength = frame.getName().length();
      if (strlength < 4)
         strsize = 85;
      else if (strlength < 6)
         strsize = 65;
      else if (strlength < 8)
         strsize = 45;
      else if (strlength < 10)
         strsize = 40;
      else if (strlength < 13)
         strsize = 35;
      else
         strsize = 30;

      JLabel namelabel = new JLabel(frame.getName());
      namelabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, strsize));
      namelabel.setForeground(Color.BLACK);
      namelabel.setBounds(240, 85, 350, 100);
      namelabel.setHorizontalAlignment(JLabel.CENTER);
      add(namelabel);

      // 점수 출력
      JLabel scorelabel = new JLabel(frame.getScore() + "점");
      scorelabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 95));
      scorelabel.setForeground(Color.BLACK);
      scorelabel.setBounds(360, 240, 350, 296);
      add(scorelabel);

      // 점수판
      ImageIcon result1 = new ImageIcon("src/img/result.png");

      Image result1Image = result1.getImage();
      Image resultBack = result1Image.getScaledInstance(1000, 650, Image.SCALE_SMOOTH);
      ImageIcon resultIcon = new ImageIcon(resultBack);
      JButton resultP = new JButton(resultIcon);
      resultP.setBounds(0, 0, 1000, 650);
      resultP.setBorderPainted(false);
      resultP.setFocusPainted(false);
      resultP.setContentAreaFilled(false);

      // 폭죽
      ImageIcon firework1 = new ImageIcon("src/img/046.png");
      Image firework1Image = firework1.getImage();
      Image fire1 = firework1Image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
      ImageIcon fireIcon1 = new ImageIcon(fire1);
      JButton fireButton1 = new JButton(fireIcon1);
      fireButton1.setBounds(80, 80, 200, 200);
      add(fireButton1);
      fireButton1.setBorderPainted(false);
      fireButton1.setFocusPainted(false);
      fireButton1.setContentAreaFilled(false);

      ImageIcon firework2 = new ImageIcon("src/img/047.png");
      Image firework2Image = firework2.getImage();
      Image fire2 = firework2Image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
      ImageIcon fireIcon2 = new ImageIcon(fire2);
      JButton fireButton2 = new JButton(fireIcon2);
      fireButton2.setBounds(750, 200, 200, 200);
      add(fireButton2);
      fireButton2.setBorderPainted(false);
      fireButton2.setFocusPainted(false);
      fireButton2.setContentAreaFilled(false);

      ImageIcon firework3 = new ImageIcon("src/img/048.png");
      Image firework3Image = firework3.getImage();
      Image fire3 = firework3Image.getScaledInstance(280, 280, Image.SCALE_SMOOTH);
      ImageIcon fireIcon3 = new ImageIcon(fire3);
      JButton fireButton3 = new JButton(fireIcon3);
      fireButton3.setBounds(75, 400, 150, 150);
      add(fireButton3);
      fireButton3.setBorderPainted(false);
      fireButton3.setFocusPainted(false);
      fireButton3.setContentAreaFilled(false);

      // 다시하기 버튼
      // 생성
      ImageIcon replayfirstimage = new ImageIcon("src/img/r001.png");
      Image replayImage = replayfirstimage.getImage();
      Image replayimage = replayImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
      ImageIcon replayIcon = new ImageIcon(replayimage);
      // 붙히기
      JButton replayButton = new JButton(replayIcon);
      replayButton.setBounds(770, 400, 200, 200);
      replayButton.setBorderPainted(false);
      replayButton.setFocusPainted(false);
      replayButton.setContentAreaFilled(false);

      replayButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            frame.selectTheme();
            frame.falsecheck = 0;
            frame.totalNum = 1;
            frame.initalSetScore();
         }
      });
      add(replayButton);
      add(resultP);
   }
}