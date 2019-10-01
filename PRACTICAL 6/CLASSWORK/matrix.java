/*Name:Orvell Ferreira  Roll No: 8671 Date: 07/08/2019 */
import java.util.*;
class matrix
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

	static void addmat(int a[][], int b[][],int m,int n)
	{
		int i,j;
		int c[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of Matrix is:");
		printmat(c,m,n);
    }		
	
	static void multimat(int a[][], int b[][],int m,int n)
	{
		int i,j,k;
		int c[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=0;
				for(k=0;k<n;k++)
				{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Product of Matrix is:");
		printmat(c,m,n);
    }		
	public static void main(String arg[])
	{   
		
		
		System.out.println("Enter the number of rows:");
	    int m=s.nextInt();
		System.out.println("Enter the number columns:");
	    int n=s.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		System.out.println("Enter Matrix A");
		readmat(a,m,n);
		System.out.println("Enter Matrix B");
		readmat(b,m,n);
		System.out.println("Matrix A is:");
		printmat(a,m,n);
		System.out.println("Matrix B is:");
		printmat(b,m,n);
		System.out.println("Enter 1 for Addition of two matrices \nEnter 2 for Multilcation of two matrices");
		int x=s.nextInt();
		switch(x)
		{
			case 1:addmat(a,b,m,n);
			       break;
			case 2:multimat(a,b,m,n);
			       break;
			default:System.out.println("Invalid Input");
		}
	}
}
/* Output:
Enter the number of rows:
3
Enter the number columns:
3
Enter Matrix A
5
7
8
4
6
5
2
1
3
Enter Matrix B
7
8
4
3
5
1
2
6
5
Matrix A is:
5 7 8
4 6 5
2 1 3
Matrix B is:
7 8 4
3 5 1
2 6 5
Enter 1 for Addition of two matrices
Enter 2 for Multilcation of two matrices
1
Sum of Matrix is:
12 15 12
7 11 6
4 7 8

Enter the number of rows:
3
Enter the number columns:
3
Enter Matrix A
5
6
7
8
4
5
9
4
4
Enter Matrix B
2
5
4
3
7
8
9
1
2
Matrix A is:
5 6 7
8 4 5
9 4 4
Matrix B is:
2 5 4
3 7 8
9 1 2
Enter 1 for Addition of two matrices
Enter 2 for Multilcation of two matrices
2
Product of Matrix is:
91 74 82
73 73 74
66 77 76    */