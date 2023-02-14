/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			in.nextInt();
		    in.nextLine();
		    String snakes = in.nextLine();
		    snakes = snakes.replace(".", "");
		    snakes = snakes.replace("HT", "");
		    if (snakes == "") System.out.println("Valid");
		    else System.out.println("Invalid");
		}
	}
}



/*  Wrong Answer Further improvement is required
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
		StringBuilder s=new StringBuilder();
		int r=obj.nextInt();
		while(r>0)
		{
		    int l=obj.nextInt();
		    obj.nextLine();
		    String str=obj.nextLine();
		    for(int i=0;i<l;i++)
		    {   
		        if(str.charAt(i)=='H' || str.charAt(i)=='T')
		        {
		            s.append(str.charAt(i));
		        }
		    }
		    int flag=0;
		    int n=s.length();
		    int i=0;
		    if(n%2!=0)
	        {
	            System.out.println("Invalid");
	        }
	        else
	        {
	            while(i<n)
    		    {
    		        if(s.charAt(i)=='H' &&  s.charAt(i+1)=='T')
    		        {
    		            i=i+2;
    		        }
    		        else
    		        {
    		            flag=1;
    		            break;
    		        }
    		    }
    		    if(flag==1)
    		    {
    		        System.out.println("Invalid");
    		    }
    		    else
    		    {
    		        System.out.println("Valid");
    		    }
	        }
		    
		    r--;
		}
	}
}
*/
