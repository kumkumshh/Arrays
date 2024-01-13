import java.util.Scanner;

public class checkAscendingOrder {
    public static void main(String[] args) {
        
        Scanner s2 = new Scanner(System.in);

             //size of array
             System.out.println("Size of array");
             int size = s2.nextInt();
     
             //array declaration
             System.out.println("Elements of the array");
             int number[] = new int[size];
     
             //input
             for(int i=0; i<size; i++){
                 number[i] = s2.nextInt();
             }

                //displaying the array
            System.out.println("Displaying the array");
            for(int i=0; i<number.length; i++){
                System.out.print(number[i] + " ");
            }
            
            System.out.println();

            //check array in ascending or not
            boolean isAscending = true;
            for(int i=0; i<number.length-1; i++){
                //condition to check descending order
                if(number[i] > number[i+1]){
                    isAscending = false;
                }
            }

            if(isAscending){
                System.out.println("Array is sorted in ascending order");
            }else{
                System.out.println("Array is not sorted in ascending order");
            }
    }
}
