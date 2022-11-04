import java.util.Scanner;
public class Array_practise {
   //A program to find out whether the array is present in the array or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = { 10, 20, 30, 40, 50, 60, 70};
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int elements:numbers){
            if(num==elements){
                isInArray = true;
                break;
            }
        }
        if(isInArray==true){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }

    }
}

