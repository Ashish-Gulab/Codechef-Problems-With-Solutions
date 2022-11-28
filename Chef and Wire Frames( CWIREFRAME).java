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
		int []l=new int[n];
		int []w=new int[n];
		int []c=new int[n];
		int []ct=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
		     l[i]=obj.nextInt();
		     w[i]=obj.nextInt();
		     c[i]=obj.nextInt();
		     ct[i]=((2*l[i])+(2*w[i]))*c[i];
		}
		for(int j=0;j<n;j++)
		{
		    System.out.println(ct[j]);
		}
		
	}
}
