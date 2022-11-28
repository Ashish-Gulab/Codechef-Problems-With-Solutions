import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int x=sc.nextInt();
	    int c=Math.abs(b-a);
		  String d=(c%(2*x)==0) ? "YES":"NO";
	
		  System.out.println(d);
		  t--;
    }
// Scanner sc=new Scanner(System.in);
//     int t=sc.nextInt();
//     while(t>0){
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//       int x=sc.nextInt();
//       boolean operation=false;
    
//      if(a==b){
//          System.out.println("Yes");
//      }
//      else if(a<b)
//      {
//          while(a<b)
//          {
//              a=a+x;
//              b=b-x;
//              if(a==b){
//                  operation=true;
                 
//                  break;
//              }
//          }
//           if(operation){
//           System.out.println("Yes");  
//          }else{
//              System.out.println("No");
//          }
         
//      }else{
//           while(a>b){
//              a=a-x;
//              b=b+x;
//              if(a==b){
//                  operation=true;
                 
//                  break;
//              }
             
//          }
//           if(operation){
//           System.out.println("Yes");  
//          }else{
//              System.out.println("No");
//          }
        
//      }
	
    
//       t--;
//   }
    
    }
}
