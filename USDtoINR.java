import java.util.*;
import java.lang.*;
import java.io.*;
public class USDtoINR {
    
//code to convert USD to indian RUPEE
	public static void main (String[] args)
	{
    int INR;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the USD amount : ");
    int USD = sc.nextInt();
    INR = USD*80;
    System.out.println(INR);
	}
}

