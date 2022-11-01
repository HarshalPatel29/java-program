import java.util.*;
public class HCF_of_2_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number a :");
        int a = sc.nextInt();
        System.out.println("Enter the second number b :");
        int b = sc.nextInt();

        int minimumOfTwo = Math.min(a,b);
        int hcf = 1;
        for(int i=1; i<=minimumOfTwo; i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF of a and b is :");
        System.out.println(hcf);
    }
}
