public class ReverseStr {
    //Printing the string in reverse order
    public static void main(String[] args) {
        char str[] = {'S', 'T','R','I','N','G'};
        String S = new String(str);
        System.out.println("The string S is "+S);
        System.out.println("The string written in reverse order ");
        for(int i=S.length()-1; i >=0; i--)
        {
            System.out.print(str[i]);
        }

    
}

}
