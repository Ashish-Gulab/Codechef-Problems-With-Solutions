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
		    int i=0;
		    while(i<n)
		    {
		        if(arr[i]<=k)
		        {
		            System.out.print("1");
		            k=k-arr[i];
		        }
		        else
		        {
		            System.out.print("0");
		        }
		        i++;
		    }
		    System.out.println();
		    t--;
		}
	}
}
