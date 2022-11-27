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
		    int n=obj.nextInt();
		    int k=obj.nextInt();
		    int n1=n%k;
		    n=n-n1;
		    int c=(n*n)/(k*k);
		    System.out.println(c);
		    t--;
		}
	}
}
