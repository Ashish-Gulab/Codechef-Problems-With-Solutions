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
		    long n=obj.nextInt();
		    long total=(n*n)/2;
		    System.out.println(total);
		    t--;
		}
	}
}

// It exceeds time limit but the concept is correct
// while(t>0)
// 		{
// 		    int n=obj.nextInt();
// 		    int count=0;
// 		    for(int i=1;i<=n;i++)
// 		    {
// 		        if(i%2==0)
// 		        {
// 		            for(int j=1;j<=n;j=j+2)
// 		            {
// 		                count++;
// 		            }
// 		        }
// 		        else
// 		        {
// 		            for(int j=2;j<=n;j=j+2)
// 		            {
// 		                count++;
// 		            }
// 		        }
// 		    }
// 		    System.out.println(count);
// 		    t--;
// 		}
