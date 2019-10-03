import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*<applet code="login.class" height="500" width="700"></applet>*/
public class login extends Applet
{
    
    TextField Username,Password,DisplayUsername,DisplayPassword;
    Button Submit,Reset;
    Label user,pass;
    Font f1=new Font("Courier",Font.ITALIC,12);
    Font f2=new Font("Arial",Font.BOLD,15);
    
    
       public void init()
        {
         
    setForeground(Color.BLUE);
    setBackground(Color.GRAY);
           
    setLayout(new FlowLayout(FlowLayout.LEFT));
 
    user=new Label("Username :",Label.CENTER);
    pass=new Label("Password : ",Label.CENTER);
    
    Username=new TextField(10);
    Password=new TextField(10);
    DisplayUsername = new TextField(10);
    DisplayPassword = new TextField(10);
    
     Password.setEchoChar('*');

    Submit=new Button("Submit");
    Reset=new Button("Reset");
        
    Submit.setBackground(Color.WHITE);
    Reset.setBackground(Color.WHITE);   
    
    Submit.setFont(f1);
    Reset.setFont(f1);
    user.setFont(f2);
    pass.setFont(f2);
    
    add(user);
    add(Username);
    add(pass);
    add(Password);
    add(Submit);
    add(Reset);
    add(DisplayUsername);
    add(DisplayPassword);
    
    DisplayUsername.setVisible(true);
    DisplayPassword.setVisible(true);
    

    
  }
    

       
       public void paint(Graphics g) {
           Submit.setLocation(180,60);
           Reset.setLocation(250, 60);
           user.setLocation(150,5);
           Username.setLocation(250,5);
           pass.setLocation(150,30);
           Password.setLocation(250,30);
           DisplayUsername.setLocation(150,100);
           DisplayPassword.setLocation(250, 100);
           
           Submit.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                DisplayUsername.setVisible(true);
                DisplayPassword.setVisible(true);
                DisplayUsername.setText(Username.getText());
                DisplayPassword.setText(Password.getText());
                            
                    
                }
        
            });
           
           Reset.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                DisplayUsername.setText(null);
                DisplayPassword.setText(null);
                DisplayUsername.setVisible(true);
                DisplayPassword.setVisible(true);
        
                
                
            }
        });
       }
       

       
 }