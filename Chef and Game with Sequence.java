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
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=obj.nextInt();
		    }
		    int sum=0,count=0,count2=0;
		    if(n==1)
		    {
		        count=1;
		    }
		    if(n==2)
		    {
		        for(int i=0;i<n;i++)
		        {
		            if(arr[i]%2==0)
    		        {
    		            count2++;
    		        }
		        }
		        if(count2==2 || count2==0)
    		    {
    		        count=1;
    		    }
    		    else
    		    {
    		        count=2;
    		    }
		    }
		    int count3=0;
		    if(n>2)
		    {
		        for(int i=0;i<n;i++)
    		    {
    		        if(arr[i]%2!=0)
        		    {
        		        sum=sum+arr[i];
        		        count3++;
        		    }
    		    }
    		    if(count3==(n-1) && count3%2==0)
    		    {
    		        count=1;
    		    }
    		    else if(count3==(n-1) && count3%2!=0)
    		    {
    		        count=2;
    		    }
    		    else
    		    {
    		        if(sum%2==0)
    		        {
    		            count=1;
    		        }
    		        else
    		        {
    		            count=2;
    		        }
    		    }
		    }
		    System.out.println(count);
		    t--;
		}
	}
}
