import java.util.Scanner;
public class CBSEper {
    
    public static void main(String[] args) {
        Scanner per = new Scanner(System.in);
        System.out.println("Enter marks of 1st subject :");
        int a = per.nextInt();
        System.out.println("Enter marks of 2nd subject :");
        int b = per.nextInt();
        System.out.println("Enter marks of 3rd subject :");
        int c = per.nextInt();
        System.out.println("Enter marks of 4th subject :");
        int d = per.nextInt();
        System.out.println("Enter marks of 5th subject :");
        int e = per.nextInt();
        System.out.print("your percentage is :");
        System.out.println((a+b+c+d+e)/5);
    }
    
}
