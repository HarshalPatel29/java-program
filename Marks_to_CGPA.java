import java.util.*;

public class Marks_to_CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of sub 1:");
        float sub1 = sc.nextFloat();
        System.out.print("Enter the marks of sub 2: ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter the marks of sub 3: ");
        float sub3 = sc.nextFloat();
        float cgpa = (sub1 + sub2 + sub3) / 30;
        System.out.println(" Your CGPA is: " + cgpa);
    }

}

