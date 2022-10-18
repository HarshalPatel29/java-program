import java.util.*;
import java.lang.*;
import java.io.*;
public class Plus_Minus {

  public static void main (String[] args) throws java.lang.Exception
  {
   Scanner sr=new Scanner(System.in);
   int n=sr.nextInt();
   int[] arr=new int[n];
   for(int i=0;i<n;i++)
   {
     arr[i]=sr.nextInt();
   }
   double positive=0;
   double negative=0;
   double zero=0;
   for(int i=0;i<n;i++)
   {
     if(arr[i]>0)
     {
       positive++;
     }
     else if(arr[i]<0)
     {
       negative++;
     }
     else
     {
       zero++;
     }      
   }
    System.out.println(positive/n);
    System.out.println(negative/n);
    System.out.println(zero/n);
  }
}
