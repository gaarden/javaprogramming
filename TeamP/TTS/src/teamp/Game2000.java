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

class Ly2000 {

   String[] stringArr = { "이대로 가지마 남겨진 기억 어떡하라고", "흐르는 눈물도 버려진 슬픔도 왜 그냥 두고가", "잔인한 여자라 나를 욕하지는 마", "잠시 너를 위해 이별을 택한거야",
         "이별은 만남보다 참 쉬운건가봐", "차갑기만 한 사람", "너무 너무 예뻐 맘이 너무 예뻐", "첫 눈에 반했어 꼭 짚은 Girl",
         "I believe in you I believe in your mind", "벌써 일년이 지났지만", "I'm so sorry but I love you",
         "다 거짓말이야 몰랐어 이제야 알았어", "그리워하면 언젠간 만나게 되는", "어느 영화와 같은 일들이 이뤄져가기를", "왜 자꾸 쳐다보니 왜", "내가 그렇게 예쁘니",
         "너무나 많이 사랑한 죄", "널 너무나 많이 사랑한 죄", "난 미미미미미미미치고 싶어", "더 빨리 뛰뛰뛰뛰뛰뛰뛰뛰고 싶어", "사랑해요 고마운 내 사랑",
         "평생 그대만을 위해 부를 이 노래", "왜 이래 나 이제 커버린걸까", "뭔가 잃어버린 기억", "여보세요 나야 거기 잘 지내니", "여보세요 왜 말 안하니",
         "만나지 말잔 내 말 연락도 말란 내 말", "너 진짜 그대로 할거니 그게 아닌데", "미칠듯 사랑했던 기억이", "추억들이 너를 찾고 있지만", "나를 위해 노래를 불러줘 그녀에게 들리게",
         "사랑도 미련도 다 가져가라고", "그대 기억이 지난 사랑이", "내 안을 파고드는 가시가 되어", "어두운 불빛 아래 촛불 하나", "와인 잔에 담긴 약속 하나",
         "야릇야릇한 널 향한 나의 맘", "들리니 I need you I love you", "모두의 축제 서로 편가르지 않는 것이 숙제", "소리 못지르는 사람 오늘 술래",
         "너라고 부를게 뭐라고 하든지", "슬픔 잊혀지도록 꽉 안아줄게" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint1_2000 {

   String[] stringArr = { "00", "00000(영어)", "00000", "000(여어)", "00 00", "000", "00000 000000 00000(영어)",
         "00 000(영어)", "0000", "0000(영어)", "000", "00000 00", "00 0 0", "0000", "0000", "0000", "00", "000",
         "0000(영어)", "000", "0 00000" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint2_2000 {

   String[] stringArr = { "코요태", "소찬휘", "윤도현", "소녀시대", "브라운아이즈", "빅뱅", "부활", "원더걸스", "FT아일랜드", "2NE1", "SG워너비", "보아",
         "임창정", "다비치", "김범수", "리쌍", "버즈", "쿨", "브라운아이드걸스", "싸이", "이승기" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint3_2000 {

   String[] stringArr = { "ㅂㅁ", "ㅌㅇㅅ(영어)", "ㅅㄹㅎㄴㅂ", "ㅈ(영어)", "ㅂㅆ ㅇㄴ", "ㄱㅈㅁ", "ㄴㅂㅇㄷㅅㅌㄹ(영어)", "ㅆㅎ(영어)", "ㅅㄹㅇㅇ",
         "ㅍㅇㅇ(영어)", "ㄹㄹㄹ", "ㅇㅌㄹㅌㅅ ㅅㄴ", "ㅅㅈ ㅎ ㅈ", "ㅍㅇㅍㅇ(숫자)", "ㅂㄱㅅㄷ", "ㅂㄹㄹㄴ", "ㄱㅅ", "ㅇㄹㅎ", "ㄹㅂ(영어)", "ㅊㅍㅇ",
         "ㄴ ㅇㅈㄹㄴㄲ" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Ans_2000 {

   String[] stringArr = { "비몽", "Tears", "사랑했나봐", "Gee", "벌써 일년", "거짓말", "Never Ending Story", "So Hot", "사랑앓이",
         "Fire", "라라라", "아틀란티스 소녀", "소주 한 잔", "8282", "보고싶다", "발레리노", "가시", "아로하", "Love", "챔피언", "내 여자라니까" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

public class Game2000 extends JPanel {

   int num, randomNumber;
   String answerString;
   String inputString;
   int strsize = 50, strlength = 0;

   // OO점
   int thisScore = 100;

   public Game2000(MainFrame frame) throws IOException {
      System.out.println("Game2000");
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
      int randomNum = 2 * randomNumbers.nextInt(21);
      // 중복되면 다시 random생성
      while (frame.sameCheck(randomNum, frame.totalNum) == 1) {
         randomNum = 2 * randomNumbers.nextInt(21);
      }

      Ans_2000 ans = new Ans_2000();
      answerString = ans.randomPrint(randomNum / 2);
      Ly2000 ly = new Ly2000();

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

      Image speakButtonImageBefore = speakButtonIcon.getImage();// 540 290
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
      // JLabel hintlabel= new JLabel("님의 점수:"+setHint());
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
      Hint1_2000 hint1 = new Hint1_2000();
      Hint2_2000 hint2 = new Hint2_2000();
      Hint3_2000 hint3 = new Hint3_2000();

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

      // 정답
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
                        frame.game2000(frame.getName());
                     } catch (IOException e1) {
                        // TODO Auto-generated catch block
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
                           frame.game2000(frame.getName());
                        } catch (IOException e1) {
                           // TODO Auto-generated catch block
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
            // add(scoreTextField);
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
                  frame.game2000(frame.getName());
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