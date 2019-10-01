/*Name:Orvell Ferreira  Roll No: 8671 Date: 21/08/2019 */
import java.util.*;
class diagmatrix
{
	static Scanner s= new Scanner(System.in);
	static void readmat(int a[][],int m,int n)
	{
		int i,j;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
	}
    static void printmat(int a[][],int m,int n)
	{
		int i,j;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			 System.out.print(a[i][j]+" ");	
			}
			System.out.println("");	
		}
	}
    static void diagonal(int a[][],int m,int n)
	{
		int i,j,sum=0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
					sum=sum+a[i][j];
			}
		}
		System.out.println("The sum of Diagonal elements is : " + sum);	
	}
	static void nondiagonal(int a[][],int m,int n)
	{
		int i,j,sum=0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i!=j)
					sum=sum+a[i][j];
			}
		}
		System.out.println("The sum of Non-Diagonal elements is : " + sum);	
	}
		public static void main(String arg[])
	{   
		
		
		System.out.println("Enter the number of rows:");
	    int m=s.nextInt();
		System.out.println("Enter the number columns:");
	    int n=s.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the Matrix");
		readmat(a,m,n);
		printmat(a,m,n);
		System.out.println("Enter 1 for Sum of Diagonal elements \nEnter 2 for sum of Non Diagonal elements");
		int x=s.nextInt();
		switch(x)
		{
			case 1:diagonal(a,m,n);
			       break;
			case 2:nondiagonal(a,m,n);
			       break;
			default:System.out.println("Invalid Input");
		}
	}
}
/*
Output:
Enter the number of rows:
3
Enter the number columns:
3
Enter the Matrix
1
2
3
4
5
6
7
8
9
1 2 3 
4 5 6 
7 8 9 
Enter 1 for Sum of Diagonal elements 
Enter 2 for sum of Non Diagonal elements
1
The sum of Diagonal elements is : 15

Enter the number of rows:
3
Enter the number columns:
3
Enter the Matrix
1
2
3
4
5
6
7
8
9
1 2 3 
4 5 6 
7 8 9 
Enter 1 for Sum of Diagonal elements 
Enter 2 for sum of Non Diagonal elements
2
The sum of Non-Diagonal elements is : 30
*/
