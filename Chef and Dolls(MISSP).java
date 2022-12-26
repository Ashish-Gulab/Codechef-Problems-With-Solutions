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
		    if(arr[n-1]!= arr[n-2])
	        {
	            System.out.println(arr[n-1]);
	        }
		    else
		    {
		        for(int i=0;i<n-1;i=i+2)
    		    {
    		        
    		        if(arr[i]!=arr[i+1])
    		        {
    		            System.out.println(arr[i]);
    		            break;
    		        }
    		    }
		    }
		    t--;
		}
	}
}
