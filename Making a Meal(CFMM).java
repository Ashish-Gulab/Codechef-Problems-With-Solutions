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
		    int n=obj.nextInt();
		    int count=0,countC=0,countD=0,countE=0,countO=0,countH=0,countF=0;
		    for(int i=0;i<n;i++)
		    {
		        String str=obj.next();
		        for(int j=0;j<str.length();j++)
		        {
		            if(str.charAt(j)=='c')
		            {
		                countC++;
		            }
		            if(str.charAt(j)=='o')
		            {
		                countO++;
		            }
		            if(str.charAt(j)=='d')
		            {
		                countD++;
		            }
		            if(str.charAt(j)=='e')
		            {
		                countE++;
		            }
		            if(str.charAt(j)=='h')
		            {
		                countH++;
		            }
		            if(str.charAt(j)=='f')
		            {
		                countF++;
		            }
		        }
		    }
		    int c=countC/2;
		    for(int i=0;i<c;i++)
		    {
		        if(countC<=1 || countE<=1 || countD==0|| countO==0 || countH==0 || countF==0)
		        {
		            break;
		        }
		        else
		        {
		            countC=countC-2;
		            countE=countE-2;
		            countD--;
		            countO--;
		            countH--;
		            countF--;
		        }
		        count++;
		    }
		    System.out.println(count);
		    t--;
		}
	}
}
