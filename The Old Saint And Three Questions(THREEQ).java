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
		    int[] arr1=new int[3];
		    int[] arr2=new int[3];
		    for(int i=0;i<3;i++)
		    {
		        arr1[i]=obj.nextInt();
		    }
		    for(int i=0;i<3;i++)
		    {
		        arr2[i]=obj.nextInt();
		    }
		    int count1=0;
		    int count2=0;
		    for(int i=0;i<3;i++)
		    {
		        if(arr1[i]==1)
		        {
		            count1++;
		        }
		        if(arr2[i]==1)
		        {
		            count2++;
		        }
		    }
		    if(count1==count2)
		    {
		        System.out.println("Pass");
		    }
		    else
		    {
		        System.out.println("Fail");
		    }
		    t--;
		}
	}
}
