import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        
        //size of array
        System.out.println("Size of array");
        int size = s1.nextInt();

        //array declaration
        System.out.println("Elements of the array");
        int number[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            number[i] = s1.nextInt();
        }

           //displaying the original array
           System.out.println("Displaying the original array");
           for(int i=0; i<number.length; i++){
               System.out.print(number[i] + " ");
           }

           System.out.println();

            //displaying the reversed array
            System.out.println("Displaying the reversed array");
            for(int i=number.length-1; i>=0; i--){
                System.out.print(number[i] + " ");
            }
        

    }
}
