package teamp;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame
{

   CardLayout titleLayout;
   JPanel panel;  
   private StartPage StartPage;
   private SelectTheme SelectTheme;
   private Game1990 Game1990;
   private String nickname="ÀÔ·Âx";
   private GameRule GameRule;
   
   public MainFrame()
   {
      System.out.println("MainFrame");

      Container contentPane = this.getContentPane();
      contentPane.setLayout(new BorderLayout());
      setBounds(100, 100, 1000, 650);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      panel = new JPanel();
      contentPane.add(panel);
      titleLayout = new CardLayout();
      panel.setLayout(titleLayout);
      

      StartPage = new StartPage(this);
      panel.add("p1", StartPage);  
   }
   
   public String getName()
   {
      return nickname;
   }
   
   public void set(String string)
   {
      this.nickname=string;
   }
   
   void selectTheme()
   {
      SelectTheme = new SelectTheme(this);
      panel.add("p2", SelectTheme);
      titleLayout.show(panel, "p2");
   }
   
   void gameRule()
   {
      GameRule = new GameRule(this);
      panel.add("p3", GameRule);
      titleLayout.show(panel, "p3");
      
   }
   
   public void game1990(String string)
   {
      set(string);
      Game1990 = new Game1990(this);
      panel.add("p4", Game1990);
      titleLayout.show(panel, "p4");
   }
}