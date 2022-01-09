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
import javax.swing.SwingConstants;

public class GameRule extends JPanel
{
   
   public GameRule(MainFrame frame)
   {
      System.out.println("GameRule");
      setLayout(null);
       setBackground(new Color(242,141,168));
       
       JLabel rule = new JLabel("<Game Rule>");
       rule.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 50));
       rule.setHorizontalAlignment(SwingConstants.CENTER);
       rule.setBounds(0, 0, 1000, 170);
       add(rule);
       
       JLabel rule1 = new JLabel("1. ������ ������ �뷡�� �������� 5���� ����");
       rule1.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 30));
       rule1.setBounds(100, 0, 1000, 350);
       add(rule1);
       
       JLabel rule2 = new JLabel("2. ������ ������ +100��");
       rule2.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 30));
       rule2.setBounds(100, 0, 1000, 500);
       add(rule2);
       
       JLabel rule3 = new JLabel("3. ù ��° ��Ʈ�� -10��, �� ��° ��Ʈ�� -20��, �� ��° ��Ʈ�� -30��");
       rule3.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 30));
       rule3.setBounds(100, 0, 1000, 650);
       add(rule3);
       
       JLabel rule4 = new JLabel("4. �� ������ 3�� Ʋ���� ���� ������ PASS");
       rule4.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 30));
       rule4.setBounds(100, 0, 1000, 800);
       add(rule4);
       
       JLabel rule5 = new JLabel("5. ���俩�δ� �뷡�� ���� ���� ������ �������� �Ǵ�");
       rule5.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 30));
       rule5.setBounds(100, 0, 1000, 950);
       add(rule5);
       
      //next��ư ����
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