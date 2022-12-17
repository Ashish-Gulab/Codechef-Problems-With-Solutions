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
		    String s=obj.next();
		    int count=0;
		    if(s.charAt(0)=='1')
		    {
		        count++;
		    }
		    if(s.charAt(n-2)=='0')
		    {
		        count++;
		    }
		    for(int i=0;i<(n-2);i++)
		    {
		        if(s.charAt(i)=='0' && s.charAt(i+1)=='1')
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		    t--;
		}
	}
}
 
