import java.util.Scanner;

public class printString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        //array declaration
        String names[] = new String[size];

        //declaring elements
        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }

        //printing the elements
        for(int i=0; i<names.length; i++){
            System.out.print(names[i] + " ");
        }
    }
}
