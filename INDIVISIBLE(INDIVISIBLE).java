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
		    int c=obj.nextInt();
		    for(int i=2;i<100;i++)
		    {
		        if(a%i!=0 && b%i!=0 && c%i!=0)
		        {
		            System.out.println(i);
		            break;
		        }
		    }
		    t--;
		}
	}
}
