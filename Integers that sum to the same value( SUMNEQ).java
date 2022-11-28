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
		int n=obj.nextInt();
		int num=n;
		int i,j,count=0;
		for(i=1;i<n;i++)
		{
		    for(j=1;j<n;j++)
		    {
		        if((i+j)==num)
		        {
		            count++;
		        }
		    }
		}
		System.out.println(count);
	}
}
