// 2020110975 ??????

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BallPanel extends JPanel
{
   private Ball tp_ball; 
   private ArrayList<Ball> ball = new ArrayList<Ball>(); // bouncing ball
   private ExecutorService threadExecutor; // for running Ball runnable
   private JFrame parentWindow; // parent window of JPanel
   private final int MAX_X = 200; // horizontal edge of JPanel
   private final int MAX_Y = 200; // vertical edge of JPanel

   public BallPanel( JFrame window )
   {
      parentWindow = window; // set parent window of JPanel
      
      // create ExecutorService for running ball runnable
      threadExecutor = Executors.newCachedThreadPool();

   // anonymous inner class handles mouse events
      this.addMouseListener( 
         new MouseAdapter() 
         {
            public void mousePressed( MouseEvent event ) 
            {
            	if (event.getButton()==MouseEvent.BUTTON1)
            	{
            		createBall( event ); // delegate call to ball starter
                    ball.add(tp_ball);
                    RepaintTimer timer = new RepaintTimer( parentWindow );
                    threadExecutor.execute( timer );
            	}
            	
            	
            	if (event.getButton()==MouseEvent.BUTTON2)
            	{
            		SecureRandom input = new SecureRandom();
            		float R = input.nextFloat();
            		float G = input.nextFloat();
            		float B = input.nextFloat();
            		Color c = new Color(R, G, B);
            		setBackground(c);
            	}
            	
            	if (event.getButton()==MouseEvent.BUTTON3)
            	{
            		ball.clear();
            	}
               
            } // end method mousePressed
         } // end anonymous inner class
      ); // end call to addMouseListener
   } // end BallPanel constructor

   // create a ball if no ball exists and set it in motion
   private void createBall( MouseEvent event )
   {
         int x = event.getX(); // get x position of mouse press
         int y = event.getY(); // get y position of mouse press
         tp_ball = new Ball( x, y ); // create new ball
         threadExecutor.execute( tp_ball ); // set ball in motion

   } // end method createBall

   // return minimum size of animation
   public Dimension getMinimumSize()
   { 
      return getPreferredSize(); 
   } // end method getMinimumSize

   // return preferred size of animation
   public Dimension getPreferredSize()
   {
      return new Dimension( MAX_X, MAX_Y );
   } // end method getPreferredSize

   // draw ball at current position
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      for(int i=0; i<ball.size(); i++)
      {
         g.setColor(ball.get(i).getColor()); // set color to blue
         g.fillOval( ball.get(i).getX(),  ball.get(i).getY(), 10, 10 ); // draws
      }

   } // end method paintComponent
} // end class BallPanel