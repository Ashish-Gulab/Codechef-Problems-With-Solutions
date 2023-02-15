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
		    int d=obj.nextInt();
		    int c=obj.nextInt();
		    int a1=obj.nextInt();
		    int a2=obj.nextInt();
		    int a3=obj.nextInt();
		    int b1=obj.nextInt();
		    int b2=obj.nextInt();
		    int b3=obj.nextInt();
		    int a=a1+a2+a3;
		    int b=b1+b2+b3;
		    int s=0;
		    if (a>=150)
            {
                s=s+d;
            }
            if (b>=150)
            {
                s=s+d;
            }
            if (c<s)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
		    t--;
		}
	}
}
