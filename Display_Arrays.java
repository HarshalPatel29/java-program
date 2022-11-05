public class Display_Arrays {

// Displaying the Arrays ie. 1-D, 2-D and 3-D

    public static void main(String[] args) {
        // An 1-D Array
        int marks[] = new int[3];
        marks[0] = 34;
        marks[1] = 54;
        marks[2] = 45;
        // Displaying An 1-D array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // An 2-D arrays
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        // Displaying An 2-D Arrays
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[0].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        // A 3-D Arrays
        int[][][] school = new int[2][2][2];
        school[0][0][0]=11;
        school[0][0][1]=12;
        school[0][1][0]=21;
        school[0][1][1]=22;
        school[1][0][0]=31;
        school[1][0][1]=32;
        school[1][1][0]=41;
        school[1][1][1]=42;
        // Displaying 3-D Arrays
        for(int i=0; i<school.length; i++){
            for (int j=0; j<school.length; j++){
                for (int k=0; k<school.length; k++){
                    System.out.print(school[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }
}

