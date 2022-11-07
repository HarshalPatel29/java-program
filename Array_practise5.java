public class Array_practise5 {
   
// Create an array of 5 floats and calculate their sum
    public static void main(String[] args) {
        float[] marks ={45.7f, 84.5f, 70.8f, 90.0f, 95.5f};
        float sum= 0;
        for (float elements:marks){
            sum = sum+ elements;
        }
        System.out.println("The value of sum of marks is : "+sum);
     }
}
