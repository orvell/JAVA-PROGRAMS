/*Name:Orvell Ferreira  Roll No: 8671 Date:17/07/2019 */
import java.util.*;
class resume
{
   public static void main(String arg[])

   { 
      Scanner s= new Scanner(System.in);
      System.out.println(" Enter your Name");
      String name=s.nextLine();
      System.out.println(" Enter your Branch");
      String branch=s.nextLine();
      System.out.println(" Enter your City");
      String c=s.nextLine();
      System.out.println(" Enter your Roll No");
      int rn=s.nextInt();
      System.out.println(" Enter your HSC marks");
      int hsc=s.nextInt();
      System.out.println(" Enter your SSC marks");
      int ssc=s.nextInt();
      System.out.println(" Enter your HSC percentage");
      float hscp=s.nextFloat();
      System.out.println(" Enter your ssc percentage");
      double sscp=s.nextDouble();
      System.out.println(" Enter your Phone no:");
      long phone=s.nextLong();
      System.out.println(" Enter your Gender");
      char gender=s.next().charAt(0);
      System.out.println("Name is" + name+ "Branch is" + branch+ "Roll No is" + rn);
      System.out.println("City is" + c+ "Gender" + gender);
      System.out.println("HSC Marks" + hsc+ "SSC Marks" + ssc);
      System.out.println("HSC percentage" + hscp+ "SSC percentage" + sscp);
     System.out.println("Phone no :" + phone);
   }
}

/*   Output:
Enter your Name
Orvell Ferreira
 Enter your Branch
IT
 Enter your City
Vasai
 Enter your Roll No
8671
 Enter your HSC marks
421
 Enter your SSC marks
432
 Enter your HSC percentage
91.03
 Enter your ssc percentage
89.69
 Enter your Phone no:
8554961562
 Enter your Gender
Male
Name isOrvell FerreiraBranch isITRoll No is8671
City isVasaiGenderM
HSC Marks421SSC Marks432
HSC percentage91.03SSC percentage89.69
Phone no :8554961562*/

