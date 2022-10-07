import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i;
        for (i = 1; i <= 10; i++)
            System.out.println(N + " x " + i + " = " + N * i);
    }
}
