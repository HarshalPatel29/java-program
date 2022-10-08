import java.io.*;
import java.util.*;
public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) > 0){
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
        String first = A.substring(0,1);
        String second = B.substring(0,1);
        String four = A.substring(1, A.length());
        String five = B.substring(1, B.length());
        
        first = first.toUpperCase();
        second = second.toUpperCase();
        
        
        
        System.out.print(first+four+" ");
        System.out.print( second+five);
        
}




    
}
