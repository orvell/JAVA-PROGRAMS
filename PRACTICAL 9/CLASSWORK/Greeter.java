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