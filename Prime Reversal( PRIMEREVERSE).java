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
		    String a=obj.next();
		    String b=obj.next();
		    int count1=0;
		    int count2=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a.charAt(i)=='1')
		        {
		            count1++;
		        }
		        if(b.charAt(i)=='1')
		        {
		            count2++;
		        }
		    }
		    if(count1==count2)
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
