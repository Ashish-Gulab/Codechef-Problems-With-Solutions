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
		    int k=obj.nextInt();
		    int count=0;
		    if(x==y)
		    {
		        System.out.println("0");
		    }
		    else if(x<y)
		    {
		        while(x<y)
        	    {
        	        x=x+k;
        	        count++;
        	    }
        	    System.out.println(count);
		    }
		    else
		    {
		        while(x>y)
        	    {
        	        x=x-k;
        	        count++;
        	    }
        	    System.out.println(count);
		    }
		    t--;
		}
	}
}
