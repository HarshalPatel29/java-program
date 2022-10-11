import java.util.*;
import java.lang.*;
import java.io.*;
public class sumofNnumbers {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = (( N*(N+1) )/2) ;
    System.out.println(sum);
	}

}
