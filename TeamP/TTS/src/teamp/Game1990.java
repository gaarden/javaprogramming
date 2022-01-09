package teamp;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.security.SecureRandom;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Ly1990 {

   String[] stringArr = { "���ݾ� �ʸ� ����� ����ϸ� ��ٸ� ����", "���� �׸� �ٻ��� �ʹ� ���� �����", "�����㿡 �� �װ� �̿�����", "�����㿡 �� �װ� �Ⱦ�����",
         "�ϴ��� �츱 ���� ���� �־�", "�׸��� ���翡�� �ϰ� �־�", "�ʸ� ����� ���� ������ ��", "�ʸ� �����Ҽ��� ���� �ູ��", "���� �� ����� �̷��� ������",
         "������ �غ��ߴ� ���� ���� �ڷ��� ä", "���� ���ؼ� ������ ���ƾ� �ߴ�", "�� ������ �� �󸶳� ���� �����", "�����Ӱ� �� �ϴ��� ���ư��� ����� ���ƿ�",
         "�츮�տ� ������ ������ �ʹ��� ������ �Բ����", "�ʿ��� ��� �� ���� ���ȴ� ������", "�ٽ� ���� ���ƿ��� �� ������", "�� ���� ���� �ִ� �߿��ΰ� ����",
         "�� ���� ���� �ƴ� �߿��ΰ� ����", "Oh LOVE �� ��������", "���� �ܷӴ� ���� ã�ƿ°ž�", "�糪�̰� ���� �� �� �濡 �濡", "���� ���� ���� ���� ���������",
         "�״븦 ó�� �� �� ���� �� ������ ���� ������", "�״� �� �Ƹ��ٿ� ��� �� ���� �Ұ�� ������", "������ �Ϸ� ���� �� ���Ⱦ�", "�ڿ��ϰ� �������� ���� ���̷�",
         "�̸� ��ħ ���� ���� �뷡�Ҹ� �������", "������ �׷��� �ƽ��� ���� ����", "���� �� ������ �Ÿ���", "����� ��Ÿ�� �ϴõ�", "û������ �߾�︮�� ����",
         "���� ���� �Ծ �� �ȳ����� ����" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint1_1990 {

   String[] stringArr = { "00", "000 000", "00000", "00 000", "00000(����)", "000 00", "000 0", "000", "0000 00 00 00",
         "00", "0000", "00000(����)", "00000", "0000", "00 000", "0000" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint2_1990 {

   String[] stringArr = { "��", "�ҹ���", "�ེ", "SES", "HOT", "�ڿϱ�", "�� Ŭ����", "������", "��ϼ�", "����Ű��", "����Ű��", "������", "�豤��",
         "������", "�鱹ȭ", "������" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint3_1990 {

   String[] stringArr = { "����", "������ ������", "����������", "���� ������", "����(����)", "������ ����", "������ ��", "������", "�������� ���� ���� ����",
         "����", "��������", "����(����)", "����������", "��������", "���� ������", "��������" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Ans_1990 {

   String[] stringArr = { "�ֻ�", "������ �̾߱�", "�����ȿ���", "�ʸ� �����", "CANDY", "õ���� ���", "������ ��", "�Ͽ���", "�߿��δ� �츱 ���� ����", "Ŀ��",
         "��������", "HONEY", "���������", "������ħ", "���� �״��", "�������" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

public class Game1990 extends JPanel {

   int num, randomNumber;
   String answerString;
   String inputString;
   int strsize = 50, strlength = 0;
   // OO��
   int thisScore = 100;

   public Game1990(MainFrame frame) throws IOException {
      System.out.println("Game1990");
      setLayout(null);
      setBackground(new Color(135, 129, 211));
      frame.setVisible(true);

      strlength = frame.getName().length();
      if (strlength < 5)
         strsize = 50;
      else if (strlength < 8)
         strsize = 45;
      else if (strlength < 10)
         strsize = 40;
      else if (strlength < 13)
         strsize = 35;
      else
         strsize = 30;
      
      // OO���� ����:
      JTextField scoreTextField = new JTextField(
            String.format("���� %s���� ���� : %d��", frame.getName(), frame.getScore()));
      scoreTextField.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, strsize));
      scoreTextField.setBackground(new Color(135, 129, 211));
      scoreTextField.setBorder(null);
      scoreTextField.setForeground(Color.WHITE);
      scoreTextField.setBounds(30, 30, 700, 60);

      // ��Ʈ ������
      ImageIcon heartButtonIcon = new ImageIcon("src/img/025.png");
      JButton heartButton = new JButton("src/img/025.png", heartButtonIcon);

      Image heartButtonImageBefore = heartButtonIcon.getImage();
      Image heartButtonImage1 = heartButtonImageBefore.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      ImageIcon heartButtonFinalIcon = new ImageIcon(heartButtonImage1);

      JButton heartButtonFinal1 = new JButton(heartButtonFinalIcon);
      JButton heartButtonFinal2 = new JButton(heartButtonFinalIcon);
      JButton heartButtonFinal3 = new JButton(heartButtonFinalIcon);

      heartButtonFinal1.setBounds(710, 15, 100, 100);
      heartButtonFinal1.setBorderPainted(false);
      heartButtonFinal1.setFocusPainted(false);
      heartButtonFinal1.setContentAreaFilled(false);

      heartButtonFinal2.setBounds(790, 15, 100, 100);
      heartButtonFinal2.setBorderPainted(false);
      heartButtonFinal2.setFocusPainted(false);
      heartButtonFinal2.setContentAreaFilled(false);

      heartButtonFinal3.setBounds(870, 15, 100, 100);
      heartButtonFinal3.setBorderPainted(false);
      heartButtonFinal3.setFocusPainted(false);
      heartButtonFinal3.setContentAreaFilled(false);

      ImageIcon brokneheartPressedIcon = new ImageIcon("src/img/026.png");

      // ����
      // ������� ����
      ImageIcon quizButtonIcon = new ImageIcon("src/img/q001.png");
      JButton quizButton = new JButton("src/img/q001.png", quizButtonIcon);
      
      Image quizButtonImageBefore = quizButtonIcon.getImage();
      Image quizButtonImage1 = quizButtonImageBefore.getScaledInstance(800, 350, Image.SCALE_SMOOTH);
      ImageIcon quizButtonFinalIcon = new ImageIcon(quizButtonImage1);

      JButton quizButtonFinal1 = new JButton(quizButtonFinalIcon);

      quizButtonFinal1.setBounds(100, 115, 800, 350);
      quizButtonFinal1.setBorderPainted(false);
      quizButtonFinal1.setFocusPainted(false);
      quizButtonFinal1.setContentAreaFilled(false);

      // ���� ���̿��� ���� �����ͼ� ������
      SecureRandom randomNumbers = new SecureRandom();
      int randomNum = 2 * randomNumbers.nextInt(16);
      // �ߺ��Ǹ� �ٽ� random����
      while (frame.sameCheck(randomNum, frame.totalNum) == 1) {
         randomNum = 2 * randomNumbers.nextInt(16);
      }

      Ans_1990 ans = new Ans_1990();
      answerString = ans.randomPrint(randomNum / 2);
      
      Ly1990 ly = new Ly1990();

      JLabel quiznum;
      quiznum = new JLabel(String.format("���� %d", frame.totalNum));
      quiznum.setForeground(Color.BLACK);
      quiznum.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 50));
      quiznum.setBounds(190, -100, 1000, 600);
      add(quiznum);

      // ���� ����
      String lystring1 = ly.randomPrint(randomNum);
      String lystring2 = ly.randomPrint(randomNum + 1);
      
      // ���� ������
      JLabel quizlabel1;
      quizlabel1 = new JLabel(lystring1);
      quizlabel1.setForeground(new Color(224, 224, 224));
      quizlabel1.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 40));
      quizlabel1.setHorizontalAlignment(SwingConstants.CENTER);
      quizlabel1.setBounds(0, 0, 1000, 560);
      add(quizlabel1);
      JLabel quizlabel2;
      quizlabel2 = new JLabel(lystring2);
      quizlabel2.setForeground(new Color(224, 224, 224));
      quizlabel2.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 40));
      quizlabel2.setHorizontalAlignment(SwingConstants.CENTER);
      quizlabel2.setBounds(0, 0, 1000, 660);
      add(quizlabel2);
      
      // ��������ִ� ��ư
      ImageIcon speakButtonIcon = new ImageIcon("src/img/s001.png");
      ImageIcon speakButtonIcon2 = new ImageIcon("src/img/s002.png");

      Image speakButtonImageBefore = speakButtonIcon.getImage();
      Image speakButtonImage1 = speakButtonImageBefore.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
      ImageIcon speakButtonFinalIcon = new ImageIcon(speakButtonImage1);

      Image speakButtonImageBefore2 = speakButtonIcon2.getImage();
      Image speakButtonImage2 = speakButtonImageBefore2.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
      ImageIcon speakButtonFinalIcon2 = new ImageIcon(speakButtonImage2);

      JButton speakButtonFinal = new JButton(speakButtonFinalIcon);
      speakButtonFinal.setRolloverIcon(speakButtonFinalIcon2);

      speakButtonFinal.setBounds(340, 160, 70, 70);
      speakButtonFinal.setBorderPainted(false);
      speakButtonFinal.setFocusPainted(false);
      speakButtonFinal.setContentAreaFilled(false);

      GoogleTTS speak = new GoogleTTS(); // TTS

      // hint
      JLabel hintlabel = new JLabel("hint�� �ʿ��Ͻø� ���踦 ��������^!^  - - - - - - - - ->");

      hintlabel.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 20));
      hintlabel.setForeground(new Color(255, 205, 74));
      hintlabel.setBounds(150, 560, 1200, 20);
      add(hintlabel);
      // ���������
      ImageIcon keyButtonIcon = new ImageIcon("src/img/027.png");
      JButton keyButton = new JButton("src/img/027.png", keyButtonIcon);

      Image keyButtonImageBefore = keyButtonIcon.getImage();
      Image keyButtonImage1 = keyButtonImageBefore.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      ImageIcon keyButtonFinalIcon = new ImageIcon(keyButtonImage1);

      JButton keyButtonFinal1 = new JButton(keyButtonFinalIcon);
      JButton keyButtonFinal2 = new JButton(keyButtonFinalIcon);
      JButton keyButtonFinal3 = new JButton(keyButtonFinalIcon);
      Hint1_1990 hint1 = new Hint1_1990();
      Hint2_1990 hint2 = new Hint2_1990();
      Hint3_1990 hint3 = new Hint3_1990();

      keyButtonFinal1.setBounds(575, 500, 100, 100);
      keyButtonFinal1.setBorderPainted(false);
      keyButtonFinal1.setFocusPainted(false);
      keyButtonFinal1.setContentAreaFilled(false);
      String hint1contents = "���ڼ� : " + hint1.randomPrint(randomNum / 2);

      JLabel keylabel1 = new JLabel("���� ��");
      keylabel1.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 20));
      keylabel1.setForeground(new Color(255, 205, 74));
      keylabel1.setBounds(590, 480, 100, 30);
      add(keylabel1);

      keyButtonFinal2.setBounds(630, 500, 100, 100);
      keyButtonFinal2.setBorderPainted(false);
      keyButtonFinal2.setFocusPainted(false);
      keyButtonFinal2.setContentAreaFilled(false);
      String hint2contents = "���� : " + hint2.randomPrint(randomNum / 2);

      JLabel keylabel2 = new JLabel("����");
      keylabel2.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 20));
      keylabel2.setForeground(new Color(255, 205, 74));
      keylabel2.setBounds(660, 480, 100, 30);
      add(keylabel2);

      keyButtonFinal3.setBounds(685, 500, 100, 100);
      keyButtonFinal3.setBorderPainted(false);
      keyButtonFinal3.setFocusPainted(false);
      keyButtonFinal3.setContentAreaFilled(false);
      String hint3contents = "�ʼ� : " + hint3.randomPrint(randomNum / 2);

      JLabel keylabel3 = new JLabel("�ʼ�");
      keylabel3.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 20));
      keylabel3.setForeground(new Color(255, 205, 74));
      keylabel3.setBounds(715, 480, 100, 30);
      add(keylabel3);

      // ��Ʈ ������ ��ư �ٲ��ֱ�

      // pass��ư
      ImageIcon passButtonIcon = new ImageIcon("src/img/p001.png");
      ImageIcon passPressedIcon = new ImageIcon("src/img/p002.png");
      JButton passButton = new JButton("src/img/p001.png", passButtonIcon);
      passButton.setPressedIcon(passPressedIcon);

      Image passButtonImageBefore = passButtonIcon.getImage();// 540 290
      Image passButtonImage1 = passButtonImageBefore.getScaledInstance(180, 98, Image.SCALE_SMOOTH);
      ImageIcon passButtonFinalIcon = new ImageIcon(passButtonImage1);

      Image passButtonImageBeforePreesed = passPressedIcon.getImage();
      Image passButtonImage2 = passButtonImageBeforePreesed.getScaledInstance(180, 98, Image.SCALE_SMOOTH);
      ImageIcon passButtonFinalEntIcon = new ImageIcon(passButtonImage2);

      JButton passButtonFinal = new JButton(passButtonFinalIcon);
      passButtonFinal.setRolloverIcon(passButtonFinalEntIcon);

      passButtonFinal.setBounds(780, 500, 180, 98);
      passButtonFinal.setBorderPainted(false);
      passButtonFinal.setFocusPainted(false);
      passButtonFinal.setContentAreaFilled(false);

      /* ����: */
      JLabel answer = new JLabel("����:");
      answer.setForeground(Color.WHITE);
      answer.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 50));
      answer.setBounds(40, 500, 100, 50);
      add(answer);

      /* ���� �Է�â */
      JTextField answervalue = new JTextField();
      answervalue.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 50));
      answervalue.setBackground(new Color(255, 235, 135));
      answervalue.setBorder(null);
      answervalue.setBounds(150, 500, 400, 50);
      add(answervalue);

      /* �����Է¹ް� ä�� */
      answervalue.addKeyListener(new KeyListener() {
         public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_ENTER) {
               inputString = answervalue.getText(); // �ؽ�Ʈ �ʵ��� �Է°��� inputString�� �����Ѵ�.
               answervalue.setText("");
               if (inputString.equals(answerString)) {
                  speak.PlayMP3(1);
                  if (frame.totalNum >= 5) {
                     frame.setScore(thisScore);
                     frame.resultpanel(frame.getName());
                  } else {
                     frame.totalNum++;
                     frame.falsecheck = 0;
                     frame.setScore(thisScore);

                     try {
                        frame.game1990(frame.getName());
                     } catch (IOException e1) {
                        e1.printStackTrace();
                     }

                  }
               } else {
                  speak.PlayMP3(2);
                  frame.falsecheck++;
                  if (frame.falsecheck == 1) {
                     heartButtonFinal1.setVisible(false);
                  } else if (frame.falsecheck == 2) {
                     heartButtonFinal2.setVisible(false);
                  } else if (frame.falsecheck == 3) {
                     if (frame.totalNum >= 5) {
                        frame.resultpanel(frame.getName());
                     } else {
                        frame.totalNum++;
                        frame.falsecheck = 0;
                        try {
                           frame.game1990(frame.getName());
                        } catch (IOException e1) {
                           e1.printStackTrace();
                        }
                     }
                  }
               }
            }
         }

         @Override
         public void keyTyped(KeyEvent e) {
         }

         @Override
         public void keyReleased(KeyEvent e) {
         }
      });

      // action��
      keyButtonFinal1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new hint1(hint1contents);
            frame.minusScore(10);
            scoreTextField.setText(String.format("���� %s���� ���� : %d��", frame.getName(), frame.getScore()));
            keyButtonFinal1.setVisible(false);
            keylabel1.setVisible(false);
         }
      });
      keyButtonFinal2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new hint2(hint2contents);
            frame.minusScore(20);
            scoreTextField.setText(String.format("���� %s���� ���� : %d��", frame.getName(), frame.getScore()));
            keyButtonFinal2.setVisible(false);
            keylabel2.setVisible(false);
         }
      });
      keyButtonFinal3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new hint3(hint3contents);
            frame.minusScore(30);
            scoreTextField.setText(String.format("���� %s���� ���� : %d��", frame.getName(), frame.getScore()));
            keyButtonFinal3.setVisible(false);
            keylabel3.setVisible(false);
         }
      });
      passButtonFinal.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            speak.PlayMP3(3);
            if (frame.totalNum >= 5) {
               frame.resultpanel(frame.getName());
            } else {
               try {
                  frame.totalNum++;
                  frame.falsecheck = 0;
                  frame.game1990(frame.getName());
               } catch (IOException e1) {
                  e1.printStackTrace();
               }
            }
         }
      });

      speakButtonFinal.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            speak.PlayMP3();
            quizlabel1.setForeground(Color.BLACK);
            quizlabel2.setForeground(Color.BLACK);
         }
      });
      
      // ��ư ������
      add(heartButtonFinal1);
      add(heartButtonFinal2);
      add(heartButtonFinal3);
      add(keyButtonFinal1);
      add(keyButtonFinal2);
      add(keyButtonFinal3);
      add(speakButtonFinal);
      add(quizButtonFinal1);
      add(passButtonFinal);
      add(scoreTextField);

      speak.CreateMP3(lystring1 + " , " + lystring2);
   }

   // class hint 1,2,3: ��ư�� �������� ��������� �� â�� ������ Ŭ����
   class hint1 extends JFrame {
      hint1(String string) {
         setTitle("ù��° ��Ʈ!");
         System.out.println("firstHint");
         JPanel NewWindowContainer = new JPanel();
         setContentPane(NewWindowContainer);
         NewWindowContainer.setBackground(new Color(135, 129, 211));

         JLabel Hint = new JLabel(string);
         Hint.setForeground(Color.WHITE);
         Hint.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 30));
         NewWindowContainer.add(Hint);

         setBounds(300, 300, 500, 200);
         setResizable(false);
         setVisible(true);
      }
   }

   class hint2 extends JFrame {
      hint2(String string) {
         setTitle("�ι�° ��Ʈ!");
         System.out.println("secondHint");
         JPanel NewWindowContainer = new JPanel();
         setContentPane(NewWindowContainer);
         NewWindowContainer.setBackground(new Color(135, 129, 211));

         JLabel Hint = new JLabel(string);
         Hint.setForeground(Color.WHITE);
         Hint.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 30));

         NewWindowContainer.add(Hint);

         setBounds(300, 300, 500, 200);
         setResizable(false);
         setVisible(true);
      }
   }

   class hint3 extends JFrame {
      hint3(String string) {
         setTitle("����° ��Ʈ!");
         System.out.println("thirdHint");
         JPanel NewWindowContainer = new JPanel();
         setContentPane(NewWindowContainer);
         NewWindowContainer.setBackground(new Color(135, 129, 211));

         JLabel Hint = new JLabel(string);
         Hint.setForeground(Color.WHITE);
         Hint.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 30));

         NewWindowContainer.add(Hint);

         setBounds(300, 300, 500, 200);
         setResizable(false);
         setVisible(true);
      }

   }
}