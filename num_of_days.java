import java.util.Scanner;
public class num_of_days {
    //program to know how many days are there in a particular day
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the month no : ");
            int month = sc.nextInt();
            if(month==2){
                System.out.println("28");//No. of days are 28
            }
            else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 ||month==12)
            {
                System.out.println("31");//No. of days are 31
            }
            else{
                System.out.println("30");//No. of days are 30
            }


        }

}
