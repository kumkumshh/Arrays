public class kadaneAlgo {

    public static void kadaneAlgo(int arr[]){
        int sum = Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i<arr.length; i++){
            temp += arr[i];
            if(temp>sum){
                sum=temp;
            }  
            if(temp<0){
                temp = 0;
            }
        }
        System.out.println("MAX SUM : "+sum);
    }
    public static void main(String[] args){
        int arr[] = {-2,-1,-6,-4,-3};

        kadaneAlgo(arr);
    }
}
