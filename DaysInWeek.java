import java.util.Scanner;
public class DaysInWeek {
    public static void main(String[] args) {
        int num1;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        if(num1==1){
            System.out.println("Monday");
        }
        else if (num1==2){
            System.out.println("Tuesday");
        }
        else if (num1==3){
            System.out.println("wednesday");
        }
        else if (num1==4){
            System.out.println("Thursday");
        }
        else if (num1==5){
            System.out.println("Friday");
        }
        else if (num1==6){
            System.out.println("Saturday");
        }
        else if (num1==7){
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("'Invalid input', Please select from 1 to 7 ");
        }
    }

    
}
