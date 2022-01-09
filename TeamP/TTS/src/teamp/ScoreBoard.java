package teamp;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

class ScoreBoard extends JPanel {

   public ScoreBoard(MainFrame frame) {
      System.out.println("ScoreBoard");
      setLayout(null);
      setBackground(new Color(254, 160, 120));
      frame.setVisible(true);
      
      //Scoreboard구현
      

      //다시하기 버튼
      //생성
      ImageIcon replayfirstimage = new ImageIcon("src/img/r001.png");
      Image replayImage = replayfirstimage.getImage();
      Image replayimage = replayImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
      ImageIcon replayIcon = new ImageIcon(replayimage);
      //붙히기
      JButton replayButton = new JButton(replayIcon);
      replayButton.setBounds(770, 400, 200, 200);
      replayButton.setBorderPainted(false);
      replayButton.setFocusPainted(false);
      replayButton.setContentAreaFilled(false);
      add(replayButton);
      
      replayButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
           frame.selectTheme();
           frame.falsecheck=0;
           frame.totalNum=1;
           frame.initalSetScore();
             }}); 
  
   }
}