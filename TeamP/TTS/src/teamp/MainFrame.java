package teamp;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	CardLayout cardLayout;
	JPanel panel;
	private StartPage StartPage;
	private SelectTheme SelectTheme;
	private String nickname = "입력x";
	private GameRule GameRule;
	private Game1990 Game1990;
	private Game2000 Game2000;
	private Game2010 Game2010;
	private ResultPanel ResultPanel;
	private ScoreBoard ScoreBoard;
	private int score = 100;// 초기값0
	public int totalNum = 1;
	public int falsecheck = 0;
	public int[] a = { -1, -1, -1, -1, -1, -1 };

	public MainFrame() {
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		setBounds(100, 100, 1000, 650);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		contentPane.add(panel);
		cardLayout = new CardLayout();
		panel.setLayout(cardLayout);
		StartPage = new StartPage(this);
		panel.add("p1", StartPage);
	}

	public int sameCheck(int key, int num) {
		int i;
		for (i = 0; i < num; i++) {
			if (key == a[i]) {
				return 1;
			}
		}
		a[num - 1] = key;
		return 0;
	}

	public String getName() {
		return nickname;
	}

	public void set(String string) {
		this.nickname = string;
	}

	public void minusScore(int value) {
		this.score -= value;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int value) {
		this.score += value;
	}

	public void initalSetScore() {
		this.score = 100;
	}

	void selectTheme() {
		SelectTheme = new SelectTheme(this);
		panel.add("p2", SelectTheme);
		cardLayout.show(panel, "p2");
	}

	void gameRule() {
		GameRule = new GameRule(this);
		panel.add("p3", GameRule);
		cardLayout.show(panel, "p3");
	}

	public void game1990(String string) throws IOException {
		set(string);
		Game1990 = new Game1990(this);
		panel.add("p4", Game1990);
		cardLayout.show(panel, "p4");
	}

	public void game2000(String string) throws IOException {
		set(string);
		Game2000 = new Game2000(this);
		panel.add("p5", Game2000);
		cardLayout.show(panel, "p5");
	}

	public void game2010(String string) throws IOException {
		set(string);
		Game2010 = new Game2010(this);
		panel.add("p6", Game2010);
		cardLayout.show(panel, "p6");
	}

	public void resultpanel(String string) {
		set(string);
		ResultPanel = new ResultPanel(this);
		panel.add("p7", ResultPanel);
		cardLayout.show(panel, "p7");
	}

	public void scoreboard() {
		ScoreBoard = new ScoreBoard(this);
		panel.add("p8", ScoreBoard);
		cardLayout.show(panel, "p8");
	}
}
