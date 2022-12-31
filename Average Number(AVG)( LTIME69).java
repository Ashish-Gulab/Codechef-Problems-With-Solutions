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
		    int v=obj.nextInt();
		    int[] arr=new int[n];
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=obj.nextInt();
		        sum=sum+arr[i];
		    }
		    int c=(v*(n+k))-sum;
		    if(c>0 && c%k==0)
		    {
		        System.out.println(c/k);
		    }
		    else
		    {
		        System.out.println("-1");
		    }
		    t--;
		}
	}
}
