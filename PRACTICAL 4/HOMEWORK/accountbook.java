/*Name:Orvell Ferreira  Roll No: 8671 Date: 31/07/2019 */
import java.util.*;
class Account
{
	long account_id;
	double balance;
	Account()
	{
		balance=0;
	}
	Account(long x,double y)
	{
		account_id=x;
		balance=y;
	}

}
 class accountbook
 {
	 public static void main(String arg[])

   { 
	Scanner sc= new Scanner(System.in);
	Account a= new Account(); //default constructor
	System.out.println("Balance= "+a.balance);
	System.out.println("Enter Account Id : ");
	long m=sc.nextLong();
	System.out.println("Enter Balance : ");
	double n=sc.nextDouble();
    Account a1=new Account(m,n); //parameterised constructor with 2 variables
	System.out.println("Account Id : " + a1.account_id + "  Balance: Rs. " + a1.balance);
   }
 }
 /* Output:
 Balance= 0.0
Enter Account Id :
100000002356
Enter Balance :
250000
Account Id : 100000002356  Balance: Rs. 250000.0  */