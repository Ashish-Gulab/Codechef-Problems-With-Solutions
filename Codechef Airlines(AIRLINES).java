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
		    int y=obj.nextInt();
		    int z=obj.nextInt();
		    if(y<x*10)
		    {
		        System.out.println(y*z);
		    }
		    else
		    {
		        System.out.println(x*10*z);
		    }
		    t--;
		}
	}
}
