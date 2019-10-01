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