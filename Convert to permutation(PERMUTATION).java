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
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=obj.nextInt();
		    }
		    int count=0,count2=0,corr=0;
		    Arrays.sort(a);
	        for(int i=0;i<n;i++)
		    {
		        if(a[i]<=(i+1))
		        {
		            count=count+((i+1)-a[i]);
		        }
		        else
		        {
		            corr=1;
		        }
		    }
		    if(corr==1)
		    {
		        System.out.println("-1");
		    }
		    else
		    {
		        System.out.println(count);
		    }
		    t--;
		}
	}
}
