import java.util.Scanner;

public class printNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        //array declaration
        int number[] = new int[size];

        //declaring elements
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        //printing the elements
        for(int i=0; i<size; i++){
            System.out.print(number[i] + " ");
        }
    }
}
