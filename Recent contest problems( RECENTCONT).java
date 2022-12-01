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
		    String[] arr=new String[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=obj.next();
		    }
		    String s1="LTIME108";
		    String s2="START38";
		    int count1=0,count2=0;
		    for(int i=0;i<n;i++)
		    {
		        if(s1.equals(arr[i]))
		        {
		            count1++;
		        }
		        if(s2.equals(arr[i]))
		        {
		            count2++;
		        }
		    }
		    System.out.println(count2+" "+count1);
		    t--;
		}
	}
}
