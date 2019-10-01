/*Name:Orvell Ferreira  Roll No: 8671 Date: 18/09/2019 */
import java.util.*;
class Prime extends Thread
{
	public void run()
	{
		long startTime1 = System.nanoTime();
		int n;
        int status = 1;
        int num = 3;
        
        System.out.println("First 20 prime numbers are:");
        System.out.print(2);
        for (int i = 2; i <= 20;) {
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    status = 0;
                    break;	
                }
            }
            if (status != 0) {
                System.out.print(" "+num + " ");
                i++;
            }
            status = 1;
            num++;
        }
		long endTime1 = System.nanoTime();
		long totaltime1 = endTime1-startTime1;
		System.out.println();
		System.out.println("Execution time in nanoseconds : " + totaltime1 + " nanoseconds");
	}
}
class Fibonnaci extends Thread
{
	public void run()
	{
	long startTime2 = System.nanoTime();
	int n = 15, t1 = 0, t2 = 1;
        System.out.println("First " + n + " Fibonnaci terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + "  ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
		long endTime2 = System.nanoTime();
		long totaltime2 = endTime2-startTime2;
		System.out.println();
		System.out.println("Execution time in nanoseconds : " + totaltime2+ " nanoseconds");
	}
	
}

class Mythread_homeassignment
{ 
public static void main(String args[])
	{
		Prime T1= new Prime();
		T1.run();
		
		Fibonnaci T2 = new Fibonnaci();
		T2.run();
		
	}
	
}
/* OUTPUT:
First 20 prime numbers are:
2 3  5  7  11  13  17  19  23  29  31  37  41  43  47  53  59  61  67  71
Execution time in nanoseconds : 28576600 nanoseconds
First 15 Fibonnaci terms:
0  1  1  2  3  5  8  13  21  34  55  89  144  233  377
Execution time in nanoseconds : 7855000 nanoseconds
*/