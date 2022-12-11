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
		    int count=0;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]%2!=0)
		        {
		            count++;
		        }
		    }
		    if(count==0)
		    {
		        System.out.println("No");
		    }
		    else
		    {
		        if(count%2==0)
    		    {
    		        System.out.println("Yes");
    		    }
    		    else
    		    {
    		        System.out.println("No");
    		    }
		    }
		    t--;
		}
	}
}

// Here, we use the concept of having the total number of "odd numbers" in array are even then the we can make the first subarray of having one odd number and the rest the odd number are taken by another subarray. If the numbers of "odd number" are odd then "sum(S1)×sum(S2) is odd" is not possible
