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
		    int n1=obj.nextInt();
		    int n2=obj.nextInt();
		    int n3=obj.nextInt();
		    if((n1>n2 && n1<n3) || (n1<n2 && n1>n3))
		    {
		        System.out.println(n1);
		    }
		    if((n3>n2 && n3<n1) || (n3<n2 && n3>n1))
		    {
		        System.out.println(n3);
		    }
		    if((n2>n1 && n2<n3) || (n2<n1 && n2>n3))
		    {
		        System.out.println(n2);
		    }
		    t--;
		}
	}
}
