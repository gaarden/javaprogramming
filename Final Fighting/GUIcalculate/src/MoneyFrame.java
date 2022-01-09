import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoneyFrame extends JFrame 
{
    int[] money = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    String[] str = {"금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
    JLabel lb = new JLabel();
    JTextField[] tf = new JTextField[str.length];
    JButton btn = new JButton("계산");
    JCheckBox[] check = new JCheckBox[7];
    JLabel name = new JLabel("2020110975 문정원");
    int[] click = {0, 0, 0, 0, 0, 0, 0, 1};
    
    MoneyFrame() 
    {
        setTitle("Money Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        
        
        // 본인 이름 학번
        name.setSize(150, 20);
        name.setLocation(125, 300);
        add(name);
        
        
        // 금액
        lb = new JLabel(str[0]);
        lb.setSize(50, 25);
        lb.setLocation(70, 30);
        add(lb);
        
        // 금액 적는 곳
        tf[0] = new JTextField();
        tf[0].setSize(120, 20);
        tf[0].setLocation(150, 30);
        add(tf[0]);
        
        // 계산 버튼
        btn.setSize(70, 20);
        btn.setLocation(280, 30);
        
        // 밑에 부분 추가
        for(int i = 1; i < str.length; i++)
        {
            lb = new JLabel(str[i]);
            lb.setHorizontalAlignment(JLabel.RIGHT);
            lb.setSize(50, 20);
            lb.setLocation(100, 50+(i*25));
            
            tf[i] = new JTextField(30);
            tf[i].setHorizontalAlignment(JTextField.CENTER);
            tf[i].setSize(70, 20);
            tf[i].setLocation(180, 50+(i*25));
            
            if (i <= str.length-2)
            {
            	check[i-1] = new JCheckBox();
            	check[i-1].setSize(20, 20);
            	check[i-1].setLocation(275, 50+(i*25));
            	check[i-1].setBackground(Color.PINK);

                add(check[i-1]);
            }
            
            add(lb);
            add(tf[i]);
        }
        
        
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String mon = tf[0].getText();
                
                for (int i = 0; i < 7; i++)
                {
                	if (check[i].isSelected()) {
                		click[i] = 1;
                	}
                }
                
            if(mon.length() == 0) 
                return;
            
            int x = Integer.parseInt(mon); // 입력한 금액
            int m = 0;
            
            for (int i = 0; i<click.length; i++)
            {
            	if (click[i] == 1) {
            		m = x/money[i];
            		tf[i + 1].setText(Integer.toString(m));
            		
            		if (m>0) {
                		x = x%money[i];
                	}
            	}
            	
            	else
            	{
            		tf[i+1].setText(Integer.toString(0));
            	}
            	
            	
            }
            }
        });
        
        add(btn);
        
        setSize(400, 400);
        setVisible(true);
    }
}
