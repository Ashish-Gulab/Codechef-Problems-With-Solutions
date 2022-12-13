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
		    int count=0;
		    int n=obj.nextInt();
		    String str=obj.next();
		    for(int i=0;i<n;i++)
		    {
		        Character ch=str.charAt(i);
		        if(count>3)
		        {
		            break;
		        }
		        if((ch.equals('a')) || (ch.equals('e')) ||(ch.equals('i')) || (ch.equals('o')) || (ch.equals('u')) )
		        {
		            count=0;
		        }
		        else
		        {
		            count++;
		        }
		        
		    }
		    if(count>3)
		    {
		        System.out.println("No");
		    }
		    else
		    {
		        System.out.println("Yes");
		    }
		    t--;
		}
	}
}
