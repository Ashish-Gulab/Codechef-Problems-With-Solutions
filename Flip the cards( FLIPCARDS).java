/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try
		{
		    Scanner obj=new Scanner(System.in);
		    int n=obj.nextInt();
		    while(n>0)
		    {
		        int c=obj.nextInt();
		        int fu=obj.nextInt();
		        if(fu==0)
		        {
		            System.out.println(fu);
		        }
		        else if(fu==c)
		        {
		            System.out.println(0);
		        }   
		        else if(fu<=c/2)
		        {
		            System.out.println(fu);
		        }
		        else
		        {
		            System.out.println(c-fu);
		        }
		    }
		} 
		catch(Exception e)
		{
		    
		}
	}
}
