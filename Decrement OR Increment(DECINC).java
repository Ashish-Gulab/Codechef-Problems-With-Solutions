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
		if(n%4==0)
		{
		    System.out.println(n+1);
		}
		else
		{
		    System.out.println(n-1);
		}
		
	}
}
