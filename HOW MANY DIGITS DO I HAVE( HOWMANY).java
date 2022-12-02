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
		int n=obj.nextInt();
		int count=0;
		while(n>0)
		{
		    n=n/10;
		    count++;
		}
		if(count==1)
		{
		    System.out.println(1);
		}
		if(count==2)
		{
		    System.out.println(2);
		}
		if(count==3)
		{
		    System.out.println(3);
		}
		if(count>3)
		{
		    System.out.println( "More than 3 digits");
		}
	}
}
