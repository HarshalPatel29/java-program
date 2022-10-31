import javax.sound.sampled.SourceDataLine;

public class Matrix {
    public static void main(String[] args) 
        throws java.io.IOException
        {
            int a[][]={
                {10,20,30},
                {40,50,60},
                {70,80,90}
            };
            int b[][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };
            int c[][]=new int[3][3];
            for(int i=0; i<3; i++)
            {
                for(int j =0; j<3; j++){
                    c[i][j]=a[i][j]+ b[i][j];
                }
            }
            System.out.println("The Addition is...");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    System.out.print(" "+c[i][j]);
                }
                System.out.println();
            }
            for(int i=0; i<3; i++)//setting diagonal elements to 0
            {
                for(int j=0; j<3; j++){
                    if(i==j)
                    c[i][j]=0;
                }
            }
        }

    }

