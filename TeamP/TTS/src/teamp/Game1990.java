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

   String[] stringArr = { "알잖아 너를 이토록 사랑하며 기다린 나를", "뭐가 그리 바쁜지 너무 보기 힘들어", "어젯밤에 난 네가 미워졌어", "어젯밤에 난 네가 싫어졌어",
         "하늘은 우릴 항해 열려 있어", "그리고 내곁에는 니가 있어", "너를 사랑해 나의 마음이 오", "너를 생각할수록 나는 행복해", "단지 널 사랑해 이렇게 말했지",
         "이제껏 준비했던 많은 말을 뒤로한 채", "나를 위해서 눈물도 참아야 했던", "그 동안의 넌 얼마나 힘이 들었니", "자유롭게 저 하늘을 날아가도 놀라지 말아요",
         "우리앞에 펼쳐진 세상이 너무나 소중해 함께라면", "너에게 모든 걸 뺏겨 버렸던 마음이", "다시 내게 돌아오는 걸 느꼈지", "난 차라리 웃고 있는 삐에로가 좋아",
         "난 차라리 슬픔 아는 삐에로가 좋아", "Oh LOVE 왜 이제서야", "많이 외롭던 나를 찾아온거야", "사나이가 가는 오 그 길에 길에", "눈물 따윈 없어 못써 폼생폼사야",
         "그대를 처음 본 그 순간 난 움직일 수가 없었지", "그대 그 아름다운 모습 난 넋을 잃고야 말았지", "어제는 하루 종일 비가 내렸어", "자욱하게 내려앉은 먼지 사이로",
         "이른 아침 작은 새들 노래소리 들려오면", "언제나 그렇듯 아쉽게 잠을 깬다", "새벽 비 내리는 거리도", "저녁놀 불타는 하늘도", "청바지가 잘어울리는 여자",
         "밥을 많이 먹어도 배 안나오는 여자" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint1_1990 {

   String[] stringArr = { "00", "000 000", "00000", "00 000", "00000(영어)", "000 00", "000 0", "000", "0000 00 00 00",
         "00", "0000", "00000(영어)", "00000", "0000", "00 000", "0000" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint2_1990 {

   String[] stringArr = { "쿨", "소방차", "듀스", "SES", "HOT", "박완규", "더 클래식", "서태지", "김완선", "젝스키스", "젝스키스", "박진영", "김광석",
         "양희은", "들국화", "변진섭" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint3_1990 {

   String[] stringArr = { "ㅇㅅ", "ㅇㅈㅂ ㅇㅇㄱ", "ㅇㄹㅇㅇㅅ", "ㄴㄹ ㅅㄹㅎ", "ㅋㄷ(영어)", "ㅊㄴㅇ ㅅㄹ", "ㅁㅂㅇ ㅅ", "ㅎㅇㄱ", "ㅃㅇㄹㄴ ㅇㄹ ㅂㄱ ㅇㅈ",
         "ㅋㅍ", "ㅍㅅㅍㅅ", "ㅎㄴ(영어)", "ㅅㄹㅎㅈㅁ", "ㄱㅇㅇㅊ", "ㅁㅇ ㄱㄷㅇ", "ㅎㅁㅅㅎ" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Ans_1990 {

   String[] stringArr = { "애상", "어젯밤 이야기", "여름안에서", "너를 사랑해", "CANDY", "천년의 사랑", "마법의 성", "하여가", "삐에로는 우릴 보고 웃지", "커플",
         "폼생폼사", "HONEY", "사랑했지만", "가을아침", "매일 그대와", "희망사항" };

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
   // OO점
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
      
      // OO님의 점수:
      JTextField scoreTextField = new JTextField(
            String.format("현재 %s님의 점수 : %d점", frame.getName(), frame.getScore()));
      scoreTextField.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, strsize));
      scoreTextField.setBackground(new Color(135, 129, 211));
      scoreTextField.setBorder(null);
      scoreTextField.setForeground(Color.WHITE);
      scoreTextField.setBounds(30, 30, 700, 60);

      // 하트 붙히기
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

      // 문제
      // 문제배경 생성
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

      // 문제 더미에서 문제 가져와서 붙히기
      SecureRandom randomNumbers = new SecureRandom();
      int randomNum = 2 * randomNumbers.nextInt(16);
      // 중복되면 다시 random생성
      while (frame.sameCheck(randomNum, frame.totalNum) == 1) {
         randomNum = 2 * randomNumbers.nextInt(16);
      }

      Ans_1990 ans = new Ans_1990();
      answerString = ans.randomPrint(randomNum / 2);
      
      Ly1990 ly = new Ly1990();

      JLabel quiznum;
      quiznum = new JLabel(String.format("문제 %d", frame.totalNum));
      quiznum.setForeground(Color.BLACK);
      quiznum.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 50));
      quiznum.setBounds(190, -100, 1000, 600);
      add(quiznum);

      // 가사 추출
      String lystring1 = ly.randomPrint(randomNum);
      String lystring2 = ly.randomPrint(randomNum + 1);
      
      // 가사 붙히기
      JLabel quizlabel1;
      quizlabel1 = new JLabel(lystring1);
      quizlabel1.setForeground(new Color(224, 224, 224));
      quizlabel1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 40));
      quizlabel1.setHorizontalAlignment(SwingConstants.CENTER);
      quizlabel1.setBounds(0, 0, 1000, 560);
      add(quizlabel1);
      JLabel quizlabel2;
      quizlabel2 = new JLabel(lystring2);
      quizlabel2.setForeground(new Color(224, 224, 224));
      quizlabel2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 40));
      quizlabel2.setHorizontalAlignment(SwingConstants.CENTER);
      quizlabel2.setBounds(0, 0, 1000, 660);
      add(quizlabel2);
      
      // 문제들려주는 버튼
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
      JLabel hintlabel = new JLabel("hint가 필요하시면 열쇠를 누르세요^!^  - - - - - - - - ->");

      hintlabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
      hintlabel.setForeground(new Color(255, 205, 74));
      hintlabel.setBounds(150, 560, 1200, 20);
      add(hintlabel);
      // 열쇠붙히기
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
      String hint1contents = "글자수 : " + hint1.randomPrint(randomNum / 2);

      JLabel keylabel1 = new JLabel("글자 수");
      keylabel1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
      keylabel1.setForeground(new Color(255, 205, 74));
      keylabel1.setBounds(590, 480, 100, 30);
      add(keylabel1);

      keyButtonFinal2.setBounds(630, 500, 100, 100);
      keyButtonFinal2.setBorderPainted(false);
      keyButtonFinal2.setFocusPainted(false);
      keyButtonFinal2.setContentAreaFilled(false);
      String hint2contents = "가수 : " + hint2.randomPrint(randomNum / 2);

      JLabel keylabel2 = new JLabel("가수");
      keylabel2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
      keylabel2.setForeground(new Color(255, 205, 74));
      keylabel2.setBounds(660, 480, 100, 30);
      add(keylabel2);

      keyButtonFinal3.setBounds(685, 500, 100, 100);
      keyButtonFinal3.setBorderPainted(false);
      keyButtonFinal3.setFocusPainted(false);
      keyButtonFinal3.setContentAreaFilled(false);
      String hint3contents = "초성 : " + hint3.randomPrint(randomNum / 2);

      JLabel keylabel3 = new JLabel("초성");
      keylabel3.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
      keylabel3.setForeground(new Color(255, 205, 74));
      keylabel3.setBounds(715, 480, 100, 30);
      add(keylabel3);

      // 힌트 썼을때 버튼 바꿔주기

      // pass버튼
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

      /* 정답: */
      JLabel answer = new JLabel("정답:");
      answer.setForeground(Color.WHITE);
      answer.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 50));
      answer.setBounds(40, 500, 100, 50);
      add(answer);

      /* 정답 입력창 */
      JTextField answervalue = new JTextField();
      answervalue.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 50));
      answervalue.setBackground(new Color(255, 235, 135));
      answervalue.setBorder(null);
      answervalue.setBounds(150, 500, 400, 50);
      add(answervalue);

      /* 정답입력받고 채점 */
      answervalue.addKeyListener(new KeyListener() {
         public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_ENTER) {
               inputString = answervalue.getText(); // 텍스트 필드의 입력값을 inputString에 저장한다.
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

      // action들
      keyButtonFinal1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new hint1(hint1contents);
            frame.minusScore(10);
            scoreTextField.setText(String.format("현재 %s님의 점수 : %d점", frame.getName(), frame.getScore()));
            keyButtonFinal1.setVisible(false);
            keylabel1.setVisible(false);
         }
      });
      keyButtonFinal2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new hint2(hint2contents);
            frame.minusScore(20);
            scoreTextField.setText(String.format("현재 %s님의 점수 : %d점", frame.getName(), frame.getScore()));
            keyButtonFinal2.setVisible(false);
            keylabel2.setVisible(false);
         }
      });
      keyButtonFinal3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new hint3(hint3contents);
            frame.minusScore(30);
            scoreTextField.setText(String.format("현재 %s님의 점수 : %d점", frame.getName(), frame.getScore()));
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
      
      // 버튼 붙히기
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

   // class hint 1,2,3: 버튼이 눌러지면 만들어지는 새 창을 정의한 클래스
   class hint1 extends JFrame {
      hint1(String string) {
         setTitle("첫번째 힌트!");
         System.out.println("firstHint");
         JPanel NewWindowContainer = new JPanel();
         setContentPane(NewWindowContainer);
         NewWindowContainer.setBackground(new Color(135, 129, 211));

         JLabel Hint = new JLabel(string);
         Hint.setForeground(Color.WHITE);
         Hint.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
         NewWindowContainer.add(Hint);

         setBounds(300, 300, 500, 200);
         setResizable(false);
         setVisible(true);
      }
   }

   class hint2 extends JFrame {
      hint2(String string) {
         setTitle("두번째 힌트!");
         System.out.println("secondHint");
         JPanel NewWindowContainer = new JPanel();
         setContentPane(NewWindowContainer);
         NewWindowContainer.setBackground(new Color(135, 129, 211));

         JLabel Hint = new JLabel(string);
         Hint.setForeground(Color.WHITE);
         Hint.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));

         NewWindowContainer.add(Hint);

         setBounds(300, 300, 500, 200);
         setResizable(false);
         setVisible(true);
      }
   }

   class hint3 extends JFrame {
      hint3(String string) {
         setTitle("세번째 힌트!");
         System.out.println("thirdHint");
         JPanel NewWindowContainer = new JPanel();
         setContentPane(NewWindowContainer);
         NewWindowContainer.setBackground(new Color(135, 129, 211));

         JLabel Hint = new JLabel(string);
         Hint.setForeground(Color.WHITE);
         Hint.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));

         NewWindowContainer.add(Hint);

         setBounds(300, 300, 500, 200);
         setResizable(false);
         setVisible(true);
      }

   }
}