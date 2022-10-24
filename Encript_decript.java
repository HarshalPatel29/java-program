
public class Encript_decript {
    


        public static void main(String[] args) {
            // Encrypting the grade
            char grade = 'C';
            grade = (char) (grade + 8);
            System.out.println(grade);
    
            // Decrypting the grade
            grade = (char) (grade - 8);
            System.out.println(grade);
        }
    }
