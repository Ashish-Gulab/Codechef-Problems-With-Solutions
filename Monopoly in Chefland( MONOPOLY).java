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
		    int r1=obj.nextInt();
		    int r2=obj.nextInt();
		    int r3=obj.nextInt();
		    if(r1>(r2+r3) || r2>(r1+r3) || r3>(r1+r2))
		    {
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		    t--;
		}
	}
}
