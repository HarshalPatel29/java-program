public class Sample_Array {
    public static void main(String[] args) {
        int rows, cols, Row_sum, Col_sum;

        int a[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//Calculate number of rows and columns present in given matrix
        rows = a.length;
        cols = a[0].length;
        
        // Calculate sum of each row of give matrix
        for(int i=0; i<rows; i++){
            Row_sum = 0;
            for(int j=0; j<cols; j++){
                Row_sum = Row_sum + a[i][j];
            }
            System.out.println("sum of "+(i+1)+" row : "+Row_sum);
        }
        System.out.println("-----------------------------------");
        // Calculate sum of each column of given matrix
        for(int i=0; i<cols; i++){
            Col_sum =0;
            for(int j=0; j<rows; j++){
                Col_sum= Col_sum+a[j][i];
            }
            System.out.println("sum of "+(i+1)+" column : "+ Col_sum);
        }
}
}
