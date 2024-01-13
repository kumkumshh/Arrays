import java.util.Scanner;

public class maxMin {
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

        //min max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //displaying the array
        System.out.println("Displaying the array");
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();

        //output
        for(int i=0; i<number.length; i++){
            //min
            if(number[i] < min){
                min = number[i];
            }
            //max
            if(number[i] > max){
                max = number[i];
            }
        }

        System.out.println("Largest number : " + max);
        System.out.println("Smallest number : " + min);

    }
}
