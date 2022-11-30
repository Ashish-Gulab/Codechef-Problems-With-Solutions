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
		    int a=obj.nextInt();
		    int b=obj.nextInt();
		    int x=obj.nextInt();
		    int count=0;
		    while(a<b)
		    {
		        count++;
		        a=a+x;
		    }
		    System.out.println(count);
		    t--;
		}
	}
}
