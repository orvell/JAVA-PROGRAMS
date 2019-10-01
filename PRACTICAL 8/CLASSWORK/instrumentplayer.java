/*Name:Orvell Ferreira  Roll No: 8671 Date: 21/08/2019 */
import java.util.*; 
abstract class instrument
{
  abstract void play();
  
}

class Piano extends instrument
{
    void play()
    {
	System.out.println("Piano is playing tan tan tan tan");
	}
}

class Flute extends instrument
{
    void play()
    {
	System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends instrument
{

    void play()
    {
	System.out.println("Guitar is playing tin tin tin");
	}
}

class instrumentplayer
{
 public static void main(String args[])
  { 
	instrument array[]=new instrument[10];
        array[0]= new Piano(); 
	array[1]= new Piano();
	array[2]= new Piano();
	array[3]= new Flute();
	array[4]= new Flute();
	array[5]= new Flute();
	array[6]= new Guitar();
	array[7]= new Guitar();
	array[8]= new Guitar();
	array[9]= new Guitar();
     
     for(int i=0;i<10;i++)
	{
	if (array[i] instanceof Piano) 
	{
           System.out.println(i+" It is instance of Piano"); 
	   array[i].play();
	}
        else if (array[i] instanceof Flute) 
	{
           System.out.println(i+" It is instance of Flute"); 
	   array[i].play();
	}
       else if (array[i] instanceof Guitar) 
	{
           System.out.println(i+" It is instance of Guitar"); 
	   array[i].play();
	}
       
          
	}
    
	


  }
}

/*Output:
0 It is instance of Piano
Piano is playing tan tan tan tan
1 It is instance of Piano
Piano is playing tan tan tan tan
2 It is instance of Piano
Piano is playing tan tan tan tan
3 It is instance of Flute
Flute is playing toot toot toot toot
4 It is instance of Flute
Flute is playing toot toot toot toot
5 It is instance of Flute
Flute is playing toot toot toot toot
6 It is instance of Guitar
Guitar is playing tin tin tin
7 It is instance of Guitar
Guitar is playing tin tin tin
8 It is instance of Guitar
Guitar is playing tin tin tin
9 It is instance of Guitar
Guitar is playing tin tin tin

*/

