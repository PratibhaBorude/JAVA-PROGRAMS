public class ArraySwap {
    public static void main(String[]args){
        int []arr={1,3,2,4,6,7,8,9};
        int length= arr.length;
        int temp;
        int n=Math.floorDiv(length,2);
        for (int i=0;i<=n;i++){
            temp=arr[i];
            arr[i]=arr[length-1-i];
            arr[length-1-i]=temp;

        }
        for (int element:arr){
            System.out.print(element+" ");
        }

    }

}
