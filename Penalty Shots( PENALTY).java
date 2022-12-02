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
		    int count1=0;
    		int count2=0;
    		for(int i=1;i<=10;i++)
    		{
    		    int n=0;
    		    n=obj.nextInt();
    		    if(i%2==0)
    		    {
    		        if(n==1)
    		        {
    		            count2++;
    		        }
    		    }
    		    else
    		    {
    		        if(n==1)
    		        {
    		            count1++;
    		        }
    		    }
            }
            if(count1==count2)
    		{
    		    System.out.println(0);
    		}
    		else if(count1<count2)
    		{
    		    System.out.println(2);
    		}
    		else
    		{
    		    System.out.println(1);
    		}
		    t--;
		}
		
	}
}
