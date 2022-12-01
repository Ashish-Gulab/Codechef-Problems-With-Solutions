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
		int a=obj.nextInt();
		int b=obj.nextInt();
		if(a==0 && b==1)
		{
		    System.out.println("https://www.codechef.com/practice");
		}
		if(a==0 && b==0)
		{
		    System.out.println("https://www.codechef.com/practice");
		}
	    if(a==1 && b==0)
		{
		    System.out.println("https://www.codechef.com/contests");
		}
		if(a==1 && b==1) 
		{
		    System.out.println("https://discuss.codechef.com");
		}
	}
}
