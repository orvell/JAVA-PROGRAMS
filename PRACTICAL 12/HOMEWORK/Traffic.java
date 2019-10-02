import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 /*<applet code="Traffic.class" height=500 width=300></applet>*/
public class Traffic extends Applet implements Runnable
{
Font f1 = new Font("Arial",Font.BOLD,12);    

Thread t;
int i=0,a=0,j=0;
public void start()
{
t=new Thread(this);
t.start();
}
public void run()
{
for(i=30;i>=0;i--)			//countdown for red
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
if(i<=30 && i>3)			//red
{
a=1;
repaint();
}
else
if(i<=4 && i>0)				//yellow
{
a=2;
repaint();
}
else
if(i==0)					//green
{
for(j=0;j<30;j++)   //countdown for green
{
a=3;
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
repaint();
}
if(j==30)				//end of green(return to red)
{
run();
}
}
}
repaint();
}
public void paint(Graphics g)
{
	g.setFont(f1);
g.setColor(Color.black);				//pole top
g.fillRect(150,150,50,150);
g.drawRect(150,150,50,150);
g.setColor(Color.black);				//POLE UP
g.fillRect(150,150,50,150);
g.drawRect(150,150,50,150);
g.setColor(Color.black);				//POLE DOWN
g.fillRect(165,300,20,155);
g.drawRect(165,300,20,155);
g.drawOval(150,150,50,50);					//RED
g.drawOval(150,200,50,50);					//YELLOW
g.drawOval(150,250,50,50);					//GREEN
g.setColor(Color.black);
g.fillRect(150,99,50,50);
g.setColor(Color.cyan);
g.drawOval(153,105,40,40);
if(a==1)							//REDSIGNAL
{
	
	g.setColor(Color.red);			//COUNTDOWN for red  30 secs
g.drawString(""+i,169,130);
g.setColor(Color.red);
g.fillOval(150,150,50,50);
g.drawOval(150,150,50,50);
g.setColor(Color.gray);
g.fillRect(40,120,50,50);
g.setColor(Color.red);
g.drawString("STOP",50,150);
}
if(a==2)						//YELLOWSIGNAL
{
	
	g.setColor(Color.red);			//COUNTDOWN for yellow 4 secs
g.drawString(""+i,169,130);
g.setColor(Color.yellow);
g.fillOval(150,200,50,50);
g.drawOval(150,200,50,50);
g.setColor(Color.gray);
g.fillRect(40,170,50,50);
g.setColor(Color.yellow);
g.drawString("READY",46,200);
}
if(a==3)							//GREENSIGNAL
{	
g.setColor(Color.green);			//countdown for green  30 secs
g.drawString(""+j,169,130);
g.setColor(Color.green);
g.fillOval(150,250,50,50);
g.drawOval(150,250,50,50);
g.setColor(Color.gray);
g.fillRect(40,220,50,50);
g.setColor(Color.green);
g.drawString("GO",52,250);
}
}
}