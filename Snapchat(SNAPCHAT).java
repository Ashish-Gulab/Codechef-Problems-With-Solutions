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
		    int[] arr1=new int[n];
		    int[] arr2=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr1[i]=obj.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        arr2[i]=obj.nextInt();
		    }
		    int i=0,count=0,count1=0;
		    while(i<n)
		    {
		        if(arr1[i]!=0 && arr2[i]!=0)
		        {
		            count++;
		        }
		        else
		        {
		            count=0;
		        }
		        if(count1<count)
		        {
		            count1=count;
		        }
		        i++;
		    }
		    System.out.println(count1);
		    t--;
		}
	}
}
