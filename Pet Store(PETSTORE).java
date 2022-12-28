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
		    int num=arr[0],count=0,count2=0;
		    for(int i=0;i<n;i++)
		    {
		        if(num==arr[i])
		        {
		            count++;
		        }
		        else
		        {
		            if(count%2!=0)
		            {
		                count2=1;
		                break;
		            }
		            else
		            {
		                count=1;
		                num=arr[i];
		            }
		        }
		        if(i==(n-1))
		        {
		            if(count%2!=0)
		            {
		                count2=1;
		            }
		        }
		        
		    }
		    if(count2==0)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
