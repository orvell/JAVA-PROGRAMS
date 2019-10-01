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