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
		    int c=obj.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=obj.nextInt();
		    }
		    int count=0;
		    for(int i=0;i<n;i++)
		    {
		        if((x-arr[i])>c)
		        {
		            arr[i]=x;
		            count++;
		        }
		    }
		    int sum=0;
		    int operation=count*c;
		    for(int i=0;i<n;i++)
		    {
		        sum=sum+arr[i];
		    }
		    System.out.println(sum-operation);
		    t--;
		}
	}
}
