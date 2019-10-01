/*Name:Orvell Ferreira  Roll No: 8671 Date: 21/08/2019 */
import java.util.*;
class Bufferstring
{
	public static void main(String args[])
  { 
 
   Scanner s= new Scanner(System.in);
   String str1=args[0];
   String str2=args[1];
   StringBuffer sb1=new StringBuffer(str1);
   StringBuffer sb2=new StringBuffer(str2);
   
   System.out.println("Enter 1 for Appending Strings\n");
   System.out.println("Enter 2 for Inseting Strings\n");
   System.out.println("Enter 3 for Replace Strings\n");
   System.out.println("Enter 4 for Deleting Strings\n");
   System.out.println("Enter 5 for Reversing  Strings\n");
   System.out.println("Enter 6 for capacity of Strings\n");
   System.out.println("Enter 7 for ensureCapacity of Strings\n");
   System.out.println("Enter 8 for character at specific location in Strings\n");
   System.out.println("Enter 9 for length of Strings\n");
   System.out.println("Enter 10 for substring in Strings\n");
   String y=s.nextLine();
   int x=Integer.parseInt(y);
		switch(x)
		{
			case 1: System.out.println("Enter the string to append");										/*APPEND*/
			        String s1=s.nextLine();
			        System.out.println("Which string do you want to append ?\n1."+sb1+"\n2."+sb2);
					int z=s.nextInt();
					if(z==1)
			        sb1.append(s1);
				    else
				    sb2.append(s1);
				   System.out.println("The Updated value of Strings are :\n"+sb1+"\n"+sb2);
			       break;
				   
			case 2:System.out.println("Enter the string to Insert");										/*INSERT*/
			        String s2=s.nextLine();
			        System.out.println("In Which string do you want to Insert ?\n1."+sb1+"\n2."+sb2);
					int b=s.nextInt();
					System.out.println("Enter at which index?");
					int h=s.nextInt();
					if(b==1)	
			        sb1.insert(h,s2);
				    else
				    sb2.insert(h,s2);
				   System.out.println("The Updated value of Strings are :\n"+sb1+"\n"+sb2);
			       break;
				   
			case 3: System.out.println("Enter the string to replace");									/*REPLACE*/
			        String s3=s.nextLine();
			        System.out.println("In Which string do you want to replace ?\n1."+sb1+"\n2."+sb2);
					int w=s.nextInt();
					System.out.println("Enter beginIndex and endIndex");
					int p=s.nextInt();
					int q=s.nextInt();
					if(w==1)
			        sb1.replace(p,q,s3);
				    else
				    sb2.replace(p,q,s3);
				   System.out.println("The Updated value of Strings are :\n"+sb1+"\n"+sb2);
			       break;
			        
			case 4:System.out.println("In Which string do you want to delete ?\n1."+sb1+"\n2."+sb2);			/*DELETE*/
					int o=s.nextInt();
					System.out.println("Enter beginIndex and endIndex");
					int i=s.nextInt();
					int j=s.nextInt();
					if(o==1)
			        sb1.delete(i,j);
				    else
				    sb2.delete(i,j);
				   System.out.println("The updated value of Strings are :\n"+sb1+"\n"+sb2);
			       break;
			       
			case 5:	 System.out.println("In Which string do you want to Reverse ?\n1."+sb1+"\n2."+sb2);			/*REVERSE*/
					int u=s.nextInt();
					if(u==1)
			        sb1.reverse();
				    else
				    sb2.reverse();
				   System.out.println("The updated value of Strings are :\n"+sb1+"\n"+sb2);
			       break;
			case 6:	 System.out.println("In Which string do you want to check capacity ?\n1."+sb1+"\n2."+sb2);			/*CAPACITY*/
					int t=s.nextInt();
					if(t==1)
			         System.out.println("Capacity of String 1:"+sb1.capacity());
				    else
				    System.out.println("Capacity of String 2:"+sb2.capacity());
				   
			       break;	
			case 7:	System.out.println("In Which string do you want to ensure capacity ?\n1."+sb1+"\n2."+sb2);			/*ENSURECAPACITY*/
					int v=s.nextInt();
					if(v==1){
				     sb1.ensureCapacity(10);
					System.out.println("Capacity of String 1:"+sb1.capacity());}
				    else{
					sb2.ensureCapacity(50);
				    System.out.println("Capacity of String 2:"+sb2.capacity());	}		
			       break;
			case 8: System.out.println("In Which string do you want to find the character ?\n1."+sb1+"\n2."+sb2);
					int k=s.nextInt();
					System.out.println("Enter at which index?");
					int e=s.nextInt();
					if(k==1)	
			        System.out.println("The character is at"+e+"postion is:"+sb1.charAt(e));
				    else
				    System.out.println("The character is at"+e+"postion is:"+sb2.charAt(e));
				   				
			       break;
			case 9:	System.out.println("In Which string do you want to find the length ?\n1."+sb1+"\n2."+sb2);			/*LENGTH*/
					int ch=s.nextInt();	
					if(ch==1)	
			        System.out.println("The length is "+sb1.length());
				    else
				    System.out.println("The length is"+sb2.length());
			       break;
			case 10:	System.out.println("In Which string do you want the substring ?\n1."+sb1+"\n2."+sb2);			/*SUBSTRING*/
					int ws=s.nextInt();
					System.out.println("Enter beginIndex and endIndex");
					int d=s.nextInt();
					int g=s.nextInt();
					if(ws==1)
		            System.out.println("The substring is : "+sb1.substring(d,g));
				    else
				     System.out.println("The substring is : "+sb2.substring(d,g));	
			       break;
		  
			default:System.out.println("Invalid Input");
		}
   
  }

}
/* output:
Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

1
Enter the string to append
lance
Which string do you want to append ?
1.Orvell
2.Ferreira
1
The Updated value of Strings are :
Orvelllance
Ferreira



Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

2
Enter the string to Insert
clint
In Which string do you want to Insert ?
1.Orvell
2.Ferreira
2
Enter at which index?
1
The Updated value of Strings are :
Orvell
Fclinterreira

Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

3
Enter the string to replace
xyz
In Which string do you want to replace ?
1.Orvell
2.Ferreira
1
Enter beginIndex and endIndex
1
4
The Updated value of Strings are :
Oxyzll
Ferreira

Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

4
In Which string do you want to delete ?
1.Orvell
2.Ferreira
1
Enter beginIndex and endIndex
1
4
The updated value of Strings are :
Oll
Ferreira

Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

5
In Which string do you want to Reverse ?
1.Orvell
2.Ferreira
1
The updated value of Strings are :
llevrO
Ferreira


Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

6
In Which string do you want to check capacity ?
1.Orvell
2.Ferreira
2
Capacity of String 2:24

Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

7
In Which string do you want to ensure capacity ?
1.Orvell
2.Ferreira
1
Capacity of String 1:22

Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

8
In Which string do you want to find the character ?
1.Orvell
2.Ferreira
1
Enter at which index?
2
The character is at2postion is:v

Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

9
In Which string do you want to find the length ?
1.Orvell
2.Ferreira
1
The length is 6

Enter 1 for Appending Strings

Enter 2 for Inseting Strings

Enter 3 for Replace Strings

Enter 4 for Deleting Strings

Enter 5 for Reversing  Strings

Enter 6 for capacity of Strings

Enter 7 for ensureCapacity of Strings

Enter 8 for character at specific location in Strings

Enter 9 for length of Strings

Enter 10 for substring in Strings

10
In Which string do you want the substring ?
1.Orvell
2.Ferreira
1
Enter beginIndex and endIndex
1
3
The substring is : rv

*/
