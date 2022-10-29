import java.util.*;
public class diagonal_matrix {
    


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] mat = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    mat[i][j] = sc.nextInt();
            }
            int sum=0;
            for(int i=0; i<n; i++){
              for(int j=0; j<n; j++){
                if(i==j || (i+j)==(n-1)){
                  sum+= mat[i][j];
    //               System.out.print(mat[i][j]);
                }
    //             else{
    //               System.out.print(" ");
    //             }
              }
    //           System.out.println();
            }
          System.out.println(sum);
        }
    }
