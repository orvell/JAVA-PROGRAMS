/*Name:Orvell Ferreira  Roll No: 8671 Date: 18/09/2019 */
import java.util.*;

class sync
{
synchronized void print(int n)
{
   for(int i=1;i<=3;i++)
   {  
     System.out.println("value = "+i);  
     
	 try
		{  
      Thread.sleep(400);  
		}
	 catch(Exception e)
		{
        System.out.println(e);
		}  
	}
}  
}	
	
class ChildThread1 extends Thread
{	
	sync s;
	ChildThread1(sync s)
	{  
		this.s=s;  
	}  
	public void run()
	{
	try
     {  
        for(int i=0;i<=5;i++)
			{	
				System.out.println(Thread.currentThread().getName() + " in control"); 
				System.out.println("Hello! "+ (i+1));
				s.print(5);
				 
				 Thread.sleep(1000); 
			}
	}
	catch (Exception e) 
         { 
            System.out.println(e); 
          } 
	}
}

class ChildThread2 extends Thread
{
	sync s;
	ChildThread2(sync s)
	{  
		this.s=s;  
	}  
	public void run()
	{
	try
     { 
        for(int i=0;i<=5;i++)
			{
				 System.out.println(Thread.currentThread().getName() + " in control");  
				System.out.println("Hi! "+ (i+1));
				s.print(5);
				 Thread.sleep(1000); 
			}
	}
	catch (Exception e) 
         { 
            System.out.println(e); 
          } 
	}
}



	
	
class mythread
{
	public static void main(String args[]) throws Exception
	{
		sync obj = new sync();
	ChildThread1 T1=new ChildThread1(obj);
	ChildThread2 T2=new ChildThread2(obj);
	
	
	T1.setPriority(2); 
    T2.setPriority(3); 
	System.out.println("T1 thread priority : " + T1.getPriority()); 
    System.out.println("T2 thread priority : " + T2.getPriority()); 
	
	T1.setName("ORVELL FERREIRA");    
    T2.setName("LANCE MAIN");  
	System.out.println("Name of T1: "+ T1.getName());    
    System.out.println("Name of T2: "+ T2.getName());   
	
	T1.start();
	T2.start();
	
	
	
	T1.join(5000);
	T2.suspend();
	for(int i=0;i<=5;i++)
		{	 
			T1.yield();
			 System.out.println(Thread.currentThread().getName() + " in control");  
			System.out.println("Bye! "+(i+1));
		}
		T2.resume();
	}
	
}

/* OUTPUT
T1 thread priority : 2
T2 thread priority : 3
Name of T1: ORVELL FERREIRA
Name of T2: LANCE MAIN
LANCE MAIN in control
ORVELL FERREIRA in control
Hi! 1
Hello! 1
value = 1
value = 2
value = 3
value = 1
value = 2
value = 3
LANCE MAIN in control
Hi! 2
value = 1
value = 2
value = 3
ORVELL FERREIRA in control
Hello! 2
value = 1
value = 2
value = 3
LANCE MAIN in control
Hi! 3
value = 1
main in control
Bye! 1
main in control
Bye! 2
main in control
Bye! 3
main in control
Bye! 4
main in control
Bye! 5
main in control
Bye! 6
value = 2
value = 3
ORVELL FERREIRA in control
Hello! 3
value = 1
value = 2
value = 3
LANCE MAIN in control
Hi! 4
value = 1
value = 2
value = 3
ORVELL FERREIRA in control
Hello! 4
value = 1
value = 2
value = 3
LANCE MAIN in control
Hi! 5
value = 1
value = 2
value = 3
ORVELL FERREIRA in control
Hello! 5
value = 1
value = 2
value = 3
LANCE MAIN in control
Hi! 6
value = 1
value = 2
value = 3
ORVELL FERREIRA in control
Hello! 6
value = 1
value = 2
value = 3
*/