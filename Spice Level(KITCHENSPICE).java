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
		    int x=obj.nextInt();
		    if(x>=1 && x<4)
		    {
		        System.out.println("MILD");
		    }
		    else if(x>=4 && x<7)
		    {
		        System.out.println("MEDIUM");
		    }
		    else
		    {
		        System.out.println("HOT");
		    }
		    t--;
		}
	}
}
