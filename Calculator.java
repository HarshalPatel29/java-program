import java.util.*;
public class Calculator {
    

  
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("Enter the first number: ");
                int a = sc.nextInt();
                System.out.print("Enter the second number: ");
                int b = sc.nextInt();
                System.out.print("Enter the operation: ");
                int calculator = sc.nextInt();
    
                switch (calculator) {
                    case 1:
                        System.out.println("Addition is: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Substraction is: " + (a - b));
                        break;
                    case 3:
                        System.out.println("multiplication is: " + (a * b));
                        break;
                    case 4:
                        System.out.println("Division is: " + (a / b));
                        break;
                    case 5:
                        System.out.println("Reminder is: " + (a % b));
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                System.out.println("\nNext Operation: \n");
            }
        }
    }

