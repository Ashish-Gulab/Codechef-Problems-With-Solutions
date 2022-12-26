/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t>0)
		{
		    String s=obj.next();
		    String s2=obj.next();
		    for(int i=0;i<5;i++)
		    {
		        if(s.charAt(i)==s2.charAt(i))
		        {
		            System.out.print("G");
		        }
		        else
		        {
		            System.out.print("B");
		        }
		    }
		    System.out.println();
		    t--;
		}
	}
}
