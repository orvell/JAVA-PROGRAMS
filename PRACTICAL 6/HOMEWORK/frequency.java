/*Name:Orvell Ferreira  Roll No: 8671 Date: 21/08/2019 */
import java.util.*; 
class frequency
 { 
    public static void main(String[] arg) 
    { 
	    int i,z=0;
        Scanner s= new Scanner(System.in);
        Vector<String> v = new Vector<String>(); 
		System.out.println("Enter the number of elements the vector must contain");	
		int n=s.nextInt();
		System.out.println("Enter the elements");	
		for(i=0;i<=n;i++)
		{
			String a=s.nextLine();
			  v.add(a);
		}
		System.out.println("Enter the element to find its frequency");	
		String x=s.nextLine();
		String[] array = v.toArray(new String[v.size()]); 

		for(i=0;i<array.length;i++)
		  {
			  if(array[i].equals(x))
			  {
				  z++;
			  }
		  }
		  System.out.println("The frequency is"+ z);	
	}
 }
 /* output:
Enter the number of elements the vector must contain
8
Enter the elements
1
2
2
2
3
4
5
6
Enter the element to find its frequency
2
The frequency is3

*/

 