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
		    int y=obj.nextInt();
		    float c=(float)a/x;
		    float d=(float)b/y;
		    if(c<d)
		    {
		        System.out.println("Chef");
		    }
		    else if(d<c)
		    {
		        System.out.println("Chefina");
		    }
		    else 
		    {
		        System.out.println("Both");
		    }
		    t--;
		}
	}
}
