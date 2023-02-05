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
		    obj.nextLine();
		    String str=obj.nextLine();
		    int count1=0,count2=0;
		    for(int i=0;i<n;i++)
		    {
		        if(str.charAt(i)=='1')
		        {
		            count1++;
		        }
		        else
		        {
		            count2++;
		        }
		    }
		    if(count1==count2)
		    {
		        System.out.println(count1);
		    }
		    
		    else if(count1<count2)
		    {
		        System.out.println(count1);
		    }
		    
		    else
		    {
		        System.out.println(count2+1);
		    }
		    t--;
		}
	}
}
