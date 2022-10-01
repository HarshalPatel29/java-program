import java.util.Scanner;
public class StudResult {
    public static void main(String[] args) {
        byte m1, m2, m3;
        System.out.println("Enter your TOC marks :");
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextByte();
        System.out.println("Enter you DBMS marks :");
        m2 = sc.nextByte();
        System.out.println("Enter you SPOS marks :");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>33 && m2>33 && m3>33){
            System.out.println("CONGRATULATIONS, you have passed the exam");
        }
        else{
            System.out.println("SORRY, you have not passed the exam");
        }
        
    }
    
}
