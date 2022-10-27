package Programs;

import java.util.*;

public class Int_or_Not {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter your number: ");
            Scanner scan = new Scanner(System.in);
            System.out.println(scan.hasNextInt());
        }
    }
}
