/*Name:Orvell Ferreira  Roll No: 8671 Date: 11/09/2019 */
package frcrce.it.SEB.ITL304.RN8671.Orvell;
public class Greeter
{
	String name= new String();
	public Greeter(String aName)
	{
		name=aName;
	}
	public String sayHello()
	{
		return name;
	}
	public void sayGoodbye()
	{
		System.out.println("Goodbye,"+name+"!");
	}
}

/*----------------x----------------------------------x---------------------------------------x------------------*/


/*Name:Orvell Ferreira  Roll No: 8671 Date: 11/09/2019 */
package frcrce.it.SEB.ITL304.RN8671.Orvell;
import java.util.Random;
public class Advisor
{
	public String[] message=new String[5];
	public Advisor()
	{
		message[0]=new String("NEVER SAY NO");
		message[1]=new String("JUST DO IT");
		message[2]=new String("DO NOT WHINE… DO NOT COMPLAIN. WORK HARDER. SPEND MORE TIME ALONE");
		message[3]=new String("STOP CARING ABOUT THE THINGS THAT DONT MATTER");
		message[4]=new String("DONOT COPY IN EXAMS");
	}
	public String getAdvice()
	{
		Random r=new Random();
        int randomString=r. nextInt(message.length);
            return message[randomString];
	}
}



/*-------------------------------x-------------------------------------x--------------------------------x-------*/




/*Name:Orvell Ferreira  Roll No: 8671 Date: 11/09/2019 */
import frcrce.it.SEB.ITL304.RN8671.Orvell.Greeter;
import frcrce.it.SEB.ITL304.RN8671.Orvell.Advisor;
class GreeterTest
{
	public static void main(String[] args)
	{
		Greeter a[]=new Greeter[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i]= new Greeter(args[i]);
			System.out.println("Hello,"+a[i].sayHello()+"!");
		}
		
		Advisor ad=new Advisor();
		System.out.println("Advice:"+ad.getAdvice());
		
		for(int j=args.length-1;j>=0;j--)
		{
			a[j].sayGoodbye();
		}
	}
}

/*Output:
Hello,Orvell!
Hello,Lance!
Hello,Clint!
Advice:DONOT COPY IN EXAMS
Goodbye,Clint!
Goodbye,Lance!
Goodbye,Orvell!
*/