import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoneyFrame extends JFrame 
{
    int[] money = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    String[] str = {"�ݾ�", "������", "����", "õ��", "500��", "100��", "50��", "10��", "1��"};
    JLabel lb = new JLabel();
    JTextField[] tf = new JTextField[str.length];
    JButton btn = new JButton("���");
    JCheckBox[] check = new JCheckBox[7];
    JLabel name = new JLabel("2020110975 ������");
    int[] click = {0, 0, 0, 0, 0, 0, 0, 1};
    
    MoneyFrame() 
    {
        setTitle("Money Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        
        
        // ���� �̸� �й�
        name.setSize(150, 20);
        name.setLocation(125, 300);
        add(name);
        
        
        // �ݾ�
        lb = new JLabel(str[0]);
        lb.setSize(50, 25);
        lb.setLocation(70, 30);
        add(lb);
        
        // �ݾ� ���� ��
        tf[0] = new JTextField();
        tf[0].setSize(120, 20);
        tf[0].setLocation(150, 30);
        add(tf[0]);
        
        // ��� ��ư
        btn.setSize(70, 20);
        btn.setLocation(280, 30);
        
        // �ؿ� �κ� �߰�
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
            
            int x = Integer.parseInt(mon); // �Է��� �ݾ�
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