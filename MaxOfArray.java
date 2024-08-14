public class MaxOfArray {
    public static void main(String[]args){
        int[]arr={1,2,3,567,89,345};
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.print(max);


//        for (int element=arr){
//            if (element>max){
//                max=element;
//            }
//        }
//        System.out.print(max);

    }
}
