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
		    int count=0;
		    for(int i=0;i<n-1;i++)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            if(str.charAt(i)==str.charAt(j))
		            {
		                count=1;
		            }
		        }
		    }
		    if(count==1)
		    {
		        System.out.println(n-2);
		    }
		    else
		    {
		        System.out.println(-1);
		    }
		    t--;
		}
	}
}
