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
		    int s=obj.nextInt();
		    if(n>=s)
		        System.out.println(s);
		    else
		        System.out.println(Math.abs(n-(s-n)));
		 t--;
		}
	}
}
