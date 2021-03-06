package teamp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SelectTheme extends JPanel {
	public JTextField setName;

	public SelectTheme(MainFrame frame) {
		setLayout(null);
		setBackground(new Color(200, 163, 217));

		/* 이름 입력 안내 */
		JLabel askName = new JLabel("이름을 입력하세요.");
		askName.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		askName.setBounds(150, 400, 400, 59);
		add(askName);

		/* 이름 입력창 */
		setName = new JTextField();
		setName.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 35));
		setName.setBackground(new Color(255, 235, 135));
		setName.setBorder(null);
		setName.setBounds(400, 410, 450, 40);
		add(setName);

		/* 시대 선택 버튼 생성 */
		// 1990버튼생성
		ImageIcon theme1990ButtonIcon = new ImageIcon("src/img/1990.png");
		ImageIcon theme1990PressedIcon = new ImageIcon("src/img/c1990.png");
		JButton theme1990Button = new JButton("src/img/1990.png", theme1990ButtonIcon);
		theme1990Button.setPressedIcon(theme1990PressedIcon);
		// 크기변경,기능추가
		Image theme1990Before = theme1990ButtonIcon.getImage();
		Image themeButton1 = theme1990Before.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		ImageIcon t1990ButtonIcon = new ImageIcon(themeButton1);
		Image theme1990BeforePressed = theme1990PressedIcon.getImage();
		Image themeButton11 = theme1990BeforePressed.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		ImageIcon theme1990ButtonEntIcon = new ImageIcon(themeButton11);
		JButton t1990Button = new JButton(t1990ButtonIcon);
		t1990Button.setRolloverIcon(theme1990ButtonEntIcon);
		t1990Button.setBounds(50, 80, 250, 250);
		t1990Button.setBorderPainted(false);
		t1990Button.setFocusPainted(false);
		t1990Button.setContentAreaFilled(false);

		// 2000버튼생성
		ImageIcon theme2000ButtonIcon = new ImageIcon("src/img/2000.png");
		ImageIcon theme2000PressedIcon = new ImageIcon("src/img/c2000.png");
		JButton theme2000Button = new JButton("src/img/2000.png", theme2000ButtonIcon);
		theme2000Button.setPressedIcon(theme2000PressedIcon);
		// 크기변경, 기능추가
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

		// 2010버튼 생성
		ImageIcon theme2010ButtonIcon = new ImageIcon("src/img/2010.png");
		ImageIcon theme2010PressedIcon = new ImageIcon("src/img/c2010.png");
		JButton theme2010Button = new JButton("src/img/2010.png", theme2010ButtonIcon);
		theme2010Button.setPressedIcon(theme2010PressedIcon);
		// 크기변경, 기능추가
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

		// next버튼 생성
		ImageIcon nextButtonIcon = new ImageIcon("src/img/n1.png");
		ImageIcon nextPressedIcon = new ImageIcon("src/img/n2.png");
		JButton nextButton = new JButton("src/img/n1.png", nextButtonIcon);
		nextButton.setPressedIcon(nextPressedIcon);
		// 크기변경,기능추가
		Image nextButtonImageBefore = nextButtonIcon.getImage();
		Image nextButtonImage1 = nextButtonImageBefore.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon nextButtonFinalIcon = new ImageIcon(nextButtonImage1);
		Image nextButtonImageBeforePreesed = nextPressedIcon.getImage();
		Image nextButtonImage2 = nextButtonImageBeforePreesed.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon nextButtonFinalEntIcon = new ImageIcon(nextButtonImage2);
		JButton nextButtonFinal = new JButton(nextButtonFinalIcon);
		nextButtonFinal.setRolloverIcon(nextButtonFinalEntIcon);
		nextButtonFinal.setBounds(750, 450, 200, 200);
		nextButtonFinal.setBorderPainted(false);
		nextButtonFinal.setFocusPainted(false);
		nextButtonFinal.setContentAreaFilled(false);

		/* 버튼 pause설정 */
		// 1990
		JButton press90 = new JButton(theme1990ButtonEntIcon);
		press90.setBounds(50, 80, 250, 250);
		press90.setBorderPainted(false);
		press90.setFocusPainted(false);
		press90.setContentAreaFilled(false);

		// 2000
		JButton press00 = new JButton(theme2000ButtonEntIcon);
		press00.setBounds(375, 80, 250, 250);
		press00.setBorderPainted(false);
		press00.setFocusPainted(false);
		press00.setContentAreaFilled(false);

		// 2010
		JButton press10 = new JButton(theme2010ButtonEntIcon);
		press10.setBounds(700, 80, 250, 250);
		press10.setBorderPainted(false);
		press10.setFocusPainted(false);
		press10.setContentAreaFilled(false);

		// 버튼 붙히기
		// 클릭 전 이미지
		add(t1990Button);
		add(t2000Button);
		add(t2010Button);
		add(nextButtonFinal);
		// 마우스 대거나 클릭 후 이미지
		add(press90);
		add(press00);
		add(press10);

		/* action들 */
		t1990Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1990Button.setVisible(false);
				t2000Button.setVisible(true);
				t2010Button.setVisible(true);

				t1990Button.setSelected(true);
				t2000Button.setSelected(false);
				t2010Button.setSelected(false);
			}
		});

		t2000Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2000Button.setVisible(false);
				t1990Button.setVisible(true);
				t2010Button.setVisible(true);

				t1990Button.setSelected(false);
				t2000Button.setSelected(true);
				t2010Button.setSelected(false);
			}
		});

		t2010Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2010Button.setVisible(false);
				t1990Button.setVisible(true);
				t2000Button.setVisible(true);

				t1990Button.setSelected(false);
				t2000Button.setSelected(false);
				t2010Button.setSelected(true);
			}
		});
		nextButtonFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t1990Button.isSelected()) {
					try {
						frame.game1990(setName.getText());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				if (t2000Button.isSelected()) {
					try {
						frame.game2000(setName.getText());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				if (t2010Button.isSelected()) {
					try {
						frame.game2010(setName.getText());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}
}