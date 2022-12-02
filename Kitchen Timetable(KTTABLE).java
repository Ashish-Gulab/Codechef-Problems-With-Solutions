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
		    int count=0;
		    if(arr1[0]>=arr2[0])
		        {
		            count++;
		        }
		    for(int i=1;i<n;i++)
		    {
		        arr1[i]=arr1[i]-arr1[i-1];
		        if(arr1[i]>=arr2[i])
		        {
		            count++;
		        }
		        arr1[i]=arr1[i]+arr1[i-1];
		    }
		    System.out.println(count);
		    t--;
		}
	}
}
