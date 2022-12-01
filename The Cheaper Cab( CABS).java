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
		for(int i=0;i<n;i++)
		{
		    int n1=obj.nextInt();
		    int n2=obj.nextInt();
		    if(n1>n2)
		    {
		        System.out.println("SECOND");
		    }
		    else if(n1==n2)
		    {
		        System.out.println("ANY");
		    }
		    else
		    {
		        System.out.println("FIRST");
		    }
		}
	}
}
