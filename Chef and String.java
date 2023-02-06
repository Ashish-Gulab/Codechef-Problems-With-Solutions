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
		    String str=obj.next();
		    int n=str.length();
		    String shift1=left(str);
		    String shift2=right(str);
		    int count=0;
		    if(n==1 || n==2)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        if(shift1.equals(shift2))
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		    t--;
		}
	}
	
	public static String left(String s)
	{
	    String str="";
	    str=s.substring(1,s.length());
	    str=str+s.charAt(0);
	    return str;
	}
	
	public static String right(String s)
	{
	    String str="";
	    str=str+s.charAt(s.length()-1);
	    
	    str=str+s.substring(0,s.length()-1);
	    return str;
	}
}
