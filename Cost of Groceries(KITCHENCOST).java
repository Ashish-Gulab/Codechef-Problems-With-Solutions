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
		    int[] a=new int[n];
		    int[] b=new int[n];
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=obj.nextInt();
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        b[i]=obj.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]>=x)
		        {
		            sum=sum+b[i];
		        }
		    }
		    System.out.println(sum);
		    t--;
		}
	}
}
