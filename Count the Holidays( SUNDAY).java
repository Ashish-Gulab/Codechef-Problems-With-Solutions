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
		    int count=0;
		    for(int i=0;i<n;i++)
		    {
		        int n1=obj.nextInt();
		        if((n1-6)%7!=0 && (n1%7)!=0)
		        {
		            count++;
		        }
		    }
		    System.out.println(count+8);
		    t--;
		}
	}
}
