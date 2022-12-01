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
// 		int n1=obj.nextInt();
// 		int n2=obj.nextInt();
// 		int n3=obj.nextInt();
// 		int n4=obj.nextInt();
        int[] arr=new int[4];
        for(int i=0;i<4;i++)
        {
            arr[i]=obj.nextInt();
        }
        int count=0;
		for(int i=0;i<4;i++)
		{
		    if(arr[i]>=10)
		    {
		        count ++;
		    }
		}
		System.out.println(count);
	}
}
