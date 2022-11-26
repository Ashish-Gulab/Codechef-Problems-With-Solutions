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
// 		{
// 		    int m=obj.nextInt();
// 		    int n=obj.nextInt();
// 		    int k=obj.nextInt();
// 		    int x=obj.nextInt();
// 		    int p=m*(k-1),i=k,sum=0,z=m+n;
// 		    while(i>=k)
// 		    {
// 		        sum=sum+p;
// 		        if(x<=sum)
// 		        {
// 		            System.out.println("NO");
// 		            break;
// 		        }
// 		        else
// 		        {
// 		            sum=sum+z;
// 		            if(x<=sum)
// 		            {
// 		                System.out.println("Yes");
// 		                break;
// 		            }
// 		            else
// 		            {
// 		                i=i+k;
// 		            }
// 		        }
// 		    }
// 		    t--;
// 		}
// 	}
// }
        {
            int n=obj.nextInt();
    	    int m=obj.nextInt();
		    int k=obj.nextInt();
 		    int x=obj.nextInt();
 		    int p=n*(k-1);
 		    int q=x%((n*k)+m);
 		    if(q==0 || (q-p)>0)
 		    {
 		        System.out.println("YES");
 		    }
 		    else
 		    {
 		        System.out.println("NO");
 		    }
            t--;
        }
	}
}
