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
		    int d=obj.nextInt();
		    int l=obj.nextInt();
		    int r=obj.nextInt();
		    if(d>=l && d<=r)
		    {
		        System.out.println("Take second dose now");
		    }
		    if(d<l)
		    {
		        System.out.println("Too Early");
		    }
		    if(d>r)
		    {
		        System.out.println("Too Late");
		    }
		    t--;
		}
	}
}
