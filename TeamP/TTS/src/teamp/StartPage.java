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

public class StartPage extends JPanel {
	public StartPage(MainFrame frame) {
		System.out.println("StrartPage");
		setLayout(null);
		setBackground(new Color(242, 177, 56)); // ����
		frame.setVisible(true);
		/* ���� label */
		JLabel titleLabel = new JLabel("������ ������!");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("����ǹ��� �ѳ�ü Pro", Font.PLAIN, 80)); // Font.BOLD -> ������
		titleLabel.setBounds(200, 50, 600, 296);
		add(titleLabel);
		/* ���� ��ư ���� */
		ImageIcon startBeforeIcon = new ImageIcon("src/img/003.png");
		ImageIcon startBeforeEntIcon = new ImageIcon("src/img/004.png");
		/* ũ�� ���� */
		Image startBefore = startBeforeIcon.getImage();
		Image startButton1 = startBefore.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon startButtonIcon = new ImageIcon(startButton1);
		Image startBeforeEnt = startBeforeEntIcon.getImage();
		Image startButton2 = startBeforeEnt.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon startButtonEntIcon = new ImageIcon(startButton2);
		JButton startButton = new JButton(startButtonIcon);
		startButton.setRolloverIcon(startButtonEntIcon);
		startButton.setBounds(350, 250, 300, 300);
		startButton.setBorderPainted(false);
		startButton.setFocusPainted(false);
		startButton.setContentAreaFilled(false);

		/* action */
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.gameRule();
			}
		});
		add(startButton);
	}
}