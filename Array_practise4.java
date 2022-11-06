public class Array_practise4 {

// A Program to find maximum number present in the array

    public static void main(String[] args) {
        int[] arr = {22,15,86,41,20,10};
        int max=0;
        for(int element:arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println("The maximum number present in the Array is: "+ max);
    }
}


