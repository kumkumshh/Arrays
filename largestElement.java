import java.util.Scanner;

public class largestElement {

    public static void main(String[] args) {
        
        // Largest Element in an Arrary
        int array[] = new int[5];
        Scanner r = new Scanner(System.in);

        for(int i=0; i<5; i++){
            array[i] = r.nextInt();
        }

        int max = array[0];

        for(int i=1; i<=4; i++){
            if(array[i]>max){
                max = array[i];
            }     
        }
        System.out.println(max);
    }
}