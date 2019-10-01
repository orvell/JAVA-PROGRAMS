/*Name:Orvell Ferreira  Roll No: 8671 Date: 31/07/2019 */
import java.util.*;
class Area
{ 
    double area(double r)
	{
		return(3.14*r*r);
	}
	int area(int l ,int b)
	{
		return(l*b);
	}
	double area(double b,double h)
	{
		return((b*h)/2);
	}
     public static void main(String args[])
	 {
		 Scanner s= new Scanner(System.in);
		Area a=new Area();
		
		System.out.println("Enter 1 for Area of circle \nEnter 2 for area of rectangle  \nEnter 3 for area of triangle ");
        int n= s.nextInt();
	switch(n)
	{
	case 1: System.out.println("\nEnter the value for Radius: ");
	        double r=s.nextDouble();
			double x=a.area(r);
           System.out.println("\nThe area is: "+ x);
	  break;
	case 2: System.out.println("\nEnter the value for Length: ");
	        int l=s.nextInt();
			System.out.println("\nEnter the value for Breadth: ");
	        int b=s.nextInt();
			int y=a.area(l,b);
           System.out.println("\nThe area is: "+ y);
       	  break;
	case 3:System.out.println("\nEnter the value for base: ");
	        double q=s.nextDouble();
			System.out.println("\nEnter the value for height: ");
	        double h=s.nextDouble();
			double z=a.area(q,h);
           System.out.println("\nThe area is: "+ z);
          
	  break;
	}
	 
    }
} 


/*
Enter 1 for Area of circle
Enter 2 for area of rectangle
Enter 3 for area of triangle
1

Enter the value for Radius:
10

The area is: 314.0
Enter 1 for Area of circle
Enter 2 for area of rectangle
Enter 3 for area of triangle
2

Enter the value for Length:
10

Enter the value for Breadth:
20

The area is: 200
Enter 1 for Area of circle
Enter 2 for area of rectangle
Enter 3 for area of triangle
3

Enter the value for base:
2

Enter the value for height:
3

The area is: 3.0 */