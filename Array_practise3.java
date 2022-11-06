public class Array_practise3 {

//A Program to find minimum number present in the array

            public static void main(String[] args) {
            int[] arr = {22,15,86,41,20,10};
            int min = arr[0];
            for(int element:arr){
                if(element<min){
                    min = element;
                }
            }
            System.out.println("The minimum number present in the Array is: "+ min);
        }
}



