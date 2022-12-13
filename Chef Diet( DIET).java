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
		    int k=obj.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=obj.nextInt();
		    }
		    int count=0,count1=0,sum=0;
		    for(int i=0;i<n;i++)
		    {
		        sum=arr[i]+sum;
		        if(sum>=k)
		        {
		            sum=sum-k;
		            count++;
		        }
		        else
		        {
		            count1=1;
		            count++;
		            break;
		        }
		    }
		    if(count1==1)
		    {
		        System.out.println("NO "+count);
		    }
		    else
		    {
		        System.out.println("YES");
		    }
		    t--;
		}
	}
}
