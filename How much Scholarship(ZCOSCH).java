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
		int r=obj.nextInt();
		if(r>=1 && r<=50)
		{
		    System.out.println("100");
		}
		else if(r>50 &&r<=100)
		{
		    System.out.println("50");
		}
		else
		{
		    System.out.println("0");
		}
	}
}
