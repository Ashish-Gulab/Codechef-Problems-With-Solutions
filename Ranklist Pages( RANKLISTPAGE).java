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
		while(n>0)
		{
		    int n1=obj.nextInt();
		    if(n1<=25)
		    {
		        System.out.println(1);
		    }
		    else
		    {
		        int count=1;
		        while(n1>25)
		        {
		            n1=n1-25;
		            count++;
		        }
		        System.out.println(count);
		    }
		    n--;
		}
	}
}
