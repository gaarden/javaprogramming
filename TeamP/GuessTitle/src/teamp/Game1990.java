package teamp;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Game1990 extends JPanel{
   public Game1990(MainFrame frame) {
      System.out.println("Game1990");
         setLayout(null);
         setBackground(new Color(200,255,255));
         frame.setVisible(true);
         JLabel namelabel= new JLabel(frame.getName()+"�� ���� : ");
         namelabel.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 30));
         namelabel.setForeground(Color.WHITE);
         namelabel.setBounds(200, 50, 600, 296);
         add(namelabel);
        
         
      }
}

