import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*<applet code="Banner.class" height="600" width="900"></applet>*/
public class Banner extends Applet implements Runnable
 {
  String msg = "  Special Offer 50% off on Oneplus 7 Pro  Special Offer 40% off on Oneplus 7  Special Offer 50% off on Oneplus 7 Pro";
   char ch;
   
   TextField email,contact,display;
   Button Submit;
   Label emaill,contactl;
   
   boolean stopFlag = true;
   Thread t = null;
   Image picture1,picture2;
   Font f1=new Font("Courier",Font.BOLD,12);  

    public void init() 
    {  
	
   	 picture1 = getImage(getDocumentBase(),"oneplus7pro.JPG");  
   	 picture2 = getImage(getDocumentBase(),"oneplus7.JPG");  
	emaill=new Label("email :",Label.CENTER);
    contactl=new Label("contact : ",Label.CENTER);
    display=new TextField(50);
    email=new TextField(20);
    contact=new TextField(20);
	Submit=new Button("Submit");
	display.setBackground(Color.WHITE);
    email.setBackground(Color.GRAY);	
	contact.setBackground(Color.GRAY);	
	Submit.setBackground(Color.WHITE);
   
    
    
    
    add(emaill);
    add(email);
    add(contactl);
    add(contact);
    add(Submit);
	add(display);
   
	
   	}

public void start() 
	{
      t = new Thread(this);
      stopFlag = false; 
      t.start();

   	} 

public void run() 
	{
      for(;;) 
      { 
         try 
         { 
            repaint();
            Thread.sleep(1000);
            ch = msg.charAt(0);
            msg = msg.substring(1,msg.length());
            msg = msg + ch;
            if(stopFlag) break;
         } 
         catch(InterruptedException e)
          {

          }
      } 
   } 

 public void stop()
 {
      stopFlag = true; 
      t = null;
  } 

  public void paint(Graphics g) {
  	g.setFont(f1);

	 Submit.setLocation(600,500);
            display.setLocation(500,550);
           emaill.setLocation(580,410);
           email.setLocation(650,410);
           contactl.setLocation(580,450);
           contact.setLocation(650,450);
      g.drawString(msg,30,30);
      g.drawImage(picture1,50,50,250,300,this);
      g.drawImage(picture2,400,50,400,300,this);
	  g.drawString("CONTACT ON : 022-27418771  /  022-27418772  /  022-27418773",50,400);
	  g.drawString("ADDRESS :  Trimurti Centre, Near Parvati Theatre,",50,450);
	  g.drawString("Opposite Panchal Nagar, Vasai Station Road, Dindayal Nagar,",50,470);
	  g.drawString("Vasai West, Vasai-Virar, Maharashtra 401202",50,490);
	  g.drawString("REGISTER ONLINE",600,400);
	  
	 
		   Submit.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                   
				display.setText("YOU HAVE SUCCESSFULLY REGISTERED.THANK YOU!");
                    
                }
        
            });
           
          
   
   }
}