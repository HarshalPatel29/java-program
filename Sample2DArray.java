//this is a program which makes use of 2D arrays 
public class Sample2DArray {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int k = 0;
        System.out.println("\tStoring the numbers in array");
        for(int i=0 ; i<3; i++)
        {for(int j=0; j<3; j++)
        {
            a[i][j]=k+10;
            k=k+10;
        }
        }
        System.out.println("You have stored...");
        for(int i=0; i<3 ; i++){
            for(int j=0; j<3 ; j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
