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
		int[] arr=new int[t];
		for(int i=0;i<t;i++)
		{
		    int count=0;
		    int n=obj.nextInt();
		    while(n>0)
		    {
		        int num=n%10;
		        n=n/10;
		        if(num==4)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
