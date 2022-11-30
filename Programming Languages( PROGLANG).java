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
		    int a=obj.nextInt();
		    int b=obj.nextInt();
		    int a1=obj.nextInt();
		    int b1=obj.nextInt();
		    int a2=obj.nextInt();
		    int b2=obj.nextInt();
		    if((a==a1 || a==b1) && (b==b1 || b==a1)) 
		    {
		        System.out.println(1);
		    }
		    else if((a==a2 || a==b2) && (b==b2 || b==a2))
		    {
		        System.out.println(2);
		    }
		    else
		    {
		        System.out.println(0);
		    }
		    t--;
		}
	}
}
