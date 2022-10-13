public class FactoricalProgram {

    public static void main(String[] args) {
        int i, fact=1;
        int number=5;//The factorial of 5 is calculated
        i = 1;
        while(i<number)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of " + number + " is:"+ fact);
    }
    
}
