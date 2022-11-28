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
		        int n1=obj.nextInt();
		        if(n1<7)
		        {
		            System.out.println("Yes");
		        }
		        else
		        {
		            System.out.println("No");
		        }
		    }
		} 
		catch(Exception e) 
		{
		    return;
		}
	}
}
