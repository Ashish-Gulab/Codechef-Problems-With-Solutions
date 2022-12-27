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
		    Arrays.sort(arr);
		    int count=0,current=0;
		    for(int i=0;i<n;i++)
		    {
		        if(i==0)
		        {
		           current=arr[i];
		           count=1;
		        }
		        else
		        {
		            if(current!=arr[i])
		            {
		                count++;
		                current=arr[i];
		            }
		        }
		    }
		    System.out.println(count);
		    t--;
		}
	}
}
