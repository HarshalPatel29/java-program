//Printing the armstrong numbers from 1 to 500
public class armstrong_num {
    public static void main(String[] args) {
        
        for(int i=1; i<=500; i++){
            int sum=0;
            int n= i;
            while(n>0){
                int lastDigit = n%10;
                sum = sum + lastDigit*lastDigit*lastDigit;
                n = n/10;
            }
            if (sum==i){
                System.out.println(i);
            }
        }

    }
}
