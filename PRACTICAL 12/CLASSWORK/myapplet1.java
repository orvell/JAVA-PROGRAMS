import java.applet.*; 
import java.awt.*; 
/*<applet code="myapplet1" height=500 width=500> </applet>*/
public class myapplet1 extends Applet  
{ 
    
    public void paint(Graphics g)  
    { 
         g.setColor(Color.yellow); 
	 g.fillOval(150, 150, 200, 200); 
	 g.setColor(Color.black); 
	 g.fillOval(180, 200, 40, 60); 	
	 g.setColor(Color.black); 
	 g.fillOval(280, 200, 40, 60); 
	 g.drawLine(250,250,250,290);
	 g.setColor(Color.red); 
	 g.fillRect(200, 300, 100, 20); 
    } 
      
} 
