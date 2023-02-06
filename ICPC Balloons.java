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
		    int count=0,count1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==1 || arr[i]==2 || arr[i]==3 || arr[i]==4 || arr[i]==5 || arr[i]==6 || arr[i]==7)
		        {
		            count++;
		        }
		        if(count==7)
		        {
		            count1=i+1;
		            break;
		        }
		    }
		    System.out.println(count1);
		    t--;
		}
	}
}
