import java.util.Scanner;
public class Ifelseladder {
    public static void main(String[] args) {
       int age;
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>55){
            System.out.println("you are Experienced");
        }
        else if(age>40){
            System.out.println("you are semi-experienced");
        }
        else{
            System.out.println("you are not experienced");
        }
    }
    
}
