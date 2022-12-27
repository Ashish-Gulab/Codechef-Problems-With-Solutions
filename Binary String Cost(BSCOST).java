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
		    int x=obj.nextInt();
		    int y=obj.nextInt();
		    String str=obj.next();
		    int count1=0,count2=0;
		    for(int i=0;i<n;i++)
		    {
		        if(str.charAt(i)=='1')
		        {
		            count2++;
		        }
		        if(str.charAt(i)=='0')
		        {
		            count1++;
		        }
		    }
		    if(count1>0 && count2>0)
		    {
		        if(x>y)
		        {
		            System.out.println(y);
		        }
		        else
		        {
		            System.out.println(x);
		        }
		    }
		    else
		    {
		        System.out.println(0);
		    }
		    t--;
		}
	}
}
