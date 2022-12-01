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
		int n=obj.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr1[i]=obj.nextInt();
		    arr2[i]=obj.nextInt();
		}
		for(int i=0;i<(n-1);i++)
		{
		    arr1[i+1]=arr1[i]+arr1[i+1];
		    arr2[i+1]=arr2[i]+arr2[i+1];
		}
		int count1=0;
		int count2=0;
		int[] arr3=new int[n];
		for(int i=0;i<n;i++)
		{
		    if(arr1[i]<arr2[i])
		    {
		        arr3[i]=arr2[i]-arr1[i];
		        if(arr3[i]>count1)
		        {
		        count1=arr3[i];
		        }
		    }
		    else
		    {
		        arr3[i]=arr1[i]-arr2[i];
		        if(arr3[i]>count2)
		        {
		            count2=arr3[i];
		        }
		    }
		}
		if(count1>count2)
		{
		    System.out.print(2+" "+count1);
		}
		else
		{
		    System.out.print(1+" "+count2);
		}
	}
}
