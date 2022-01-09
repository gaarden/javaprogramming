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

class Ly2010 {

   String[] stringArr = { "이제 끝이라는 걸 알지만 미련이란 걸 알지만", "이제 아닐 걸 알지만", "어려도 아픈 건 똑같아", "세상을 잘 모른다고 아픈걸 모르진 않아",
         "늦게 다니지 좀 마 술은 멀리좀 해봐", "열살짜리 애처럼 말을 안듣니", "어쩜 이렇게 하늘은 더 파란건지", "오늘따라 왜 바람은 또 완벽한지", "지켜봐 왔잖아 니 사랑을 긴 이별을",
         "늘 상처받을 바엔 나인 게 나아", "오늘은 우리 같이 걸어요 이 거리를", "밤에 들려오는 자장노래 어떤가요 oh yeah", "우리의 믿음 우리의 사랑 그 영원한 약속들을",
         "나 추억한다면 힘차게 걸으리라", "힘껏 안아줄께 널 그리고 말할께", "나 이렇게 너를 외치면서", "낮에는 따사로운 인간적인 여자", "커피 한잔의 여유를 아는 품격 있는 여자",
         "숨이 자꾸 멎는다 네가 날 향해 걸어온다", "나를 보며 웃는다 너도 내게 끌리는지", "널 보낼 수 없는 나의 욕심이", "집착이 되어 널 가뒀고",
         "요즘 따라 내꺼인 듯 내꺼 아닌 내꺼 같은 너", "니꺼인 듯 니꺼 아닌 니꺼 같은 나", "우리 집에는 매일 나 홀로 있었지", "아버지는 택시드라이버", "커피를 너무 많이 마셨나 봐요",
         "심장이 막 두근대고 잠은 잘 수가 없어요", "비틀비틀 걸어가는 나의 다리", "오늘도 의미 없는 또 하루가 흘러가죠", "몹시도 좋았다 너를 지켜보고 설레고",
         "우습게 질투도 했던 평범한 모든 순간들이", "빛이 들어오면 자연스레 뜨던 눈", "그렇게 너의 눈빛을 보곤", "어디야 집이야 안 바쁨 나와봐",
         "너네 집 앞이야 너에게 하고픈 말이 있어", "인간의 욕심은 끝이 없고", "같은 실수를 반복하지", "근데 단 한 개도 없는 Star", "괜찮아 네가 내 우주고 밝게 빛나 줘" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint1_2010 {

   String[] stringArr = { "00 00 00", "000 0 00", "000", "00 0", "0000", "0000", "0000", "00 0000(영어)", "00000", "000",
         "0, 0, 0", "0", "0000", "000 00", "0000", "0000 000 000", "00", "000000 000000(영어)", "0000000(영어)",
         "0000" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint2_2010 {

   String[] stringArr = { "비스트", "2AM", "아이유&슬옹", "아이유", "인피니트", "버스커버스커", "나얼", "이승철", "싸이", "EXO", "태양",
         "소유(씨스타),정기고", "자이언티", "볼빨간 사춘기", "혁오", "에일리", "멜로망스", "위너", "블락비", "엔플라잉" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Hint3_2010 {

   String[] stringArr = { "ㅂㄱ ㅇㄴ ㄴㅇ", "ㅈㅇㄷ ㅁ ㅂㄴ", "ㅈㅅㄹ", "ㅈㅇ ㄴ", "ㄴㄲㅎㅈ", "ㅂㄲㅇㄷ", "ㅂㄹㄱㅇ", "ㅁㅇ ㄹㅂ(영어)", "ㄱㄴㅅㅌㅇ", "ㅇㄹㄹ",
         "ㄴ, ㅋ, ㅇ", "ㅆ", "ㅇㅎㄷㄱ", "ㅇㅈㄹ ㅈㄱ", "ㅇㅇㅇㅇ", "ㅊㄴㅊㄹ ㄴㅇㄱ ㄱㄱㄷ", "ㅅㅁ", "ㄹㅇㄹ ㄹㅇㄹ", "ㅈㅍ(영어)", "ㅇㅌㅂ" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

class Ans_2010 {

   String[] stringArr = { "비가 오는 날엔", "죽어도 못 보내", "잔소리", "좋은 날", "내꺼하자", "벚꽃엔딩", "바람기억", "My Love", "강남스타일", "으르렁",
         "눈, 코, 입", "썸", "양화대교", "우주를 줄게", "위잉위잉", "첫눈처럼 너에게 가겠다", "선물", "REALLY REALLY", "JACKPOT", "옥탑방" };

   public String randomPrint(int randomNum) {
      String str = stringArr[randomNum];
      return str;
   }
}

public class Game2010 extends JPanel {

   int num, randomNumber;
   String answerString;
   String inputString;
   int strsize = 50, strlength = 0;

   // OO점
   int thisScore = 100;

   public Game2010(MainFrame frame) throws IOException {
      System.out.println("Game2010");
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
      int randomNum = 2 * randomNumbers.nextInt(20);
      // 중복되면 다시 random생성
      while (frame.sameCheck(randomNum, frame.totalNum) == 1) {
         randomNum = 2 * randomNumbers.nextInt(20);
      }

      Ans_2010 ans = new Ans_2010();
      answerString = ans.randomPrint(randomNum / 2);
      Ly2010 ly = new Ly2010();

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
      Hint1_2010 hint1 = new Hint1_2010();
      Hint2_2010 hint2 = new Hint2_2010();
      Hint3_2010 hint3 = new Hint3_2010();

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
                        frame.game2010(frame.getName());
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
                           frame.game2010(frame.getName());
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
                  frame.game2010(frame.getName());
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

      // 붙히기
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