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
		    int count1=0,count2=0;
		    int n=obj.nextInt();
		    int[] arr=new int[n];
    		for(int i=0;i<n;i++)
    		{
    		    arr[i]=obj.nextInt();
    		}
    		int large=arr[0];
    		for(int i=0;i<n;i++)
    		{
    		    if(arr[i]==1)
    		    {
    		        count1=i;
    		        break;
    		    }
    		}
    		for(int i=1;i<n;i++)
    		{
    		    if(arr[i]>large)
    		    {
    		        large=arr[i];
    		        count2=i;
    		    }
    		}
    		int c=0;
    		if(count2<count1)
    		{
    		    if(count1>0 && count2<(n-1))
    		    {
    		        c=count1+((n-1)-count2-1);
    		    }
    		}
    		else
    		{
    		    c=count1+((n-1)-count2);
    		}
    		System.out.println(c);
		    t--;
		}
	}
}
