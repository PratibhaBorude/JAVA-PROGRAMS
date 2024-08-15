public class callBy {
    public static int callByValue(int a){
        a=90;
        return a;

    }
    public static void arr(int[]Arr){
        Arr[0]=90;
for (int element:Arr){
    System.out.print(element+" ");
}
    }

    public static void main(String[]args){
        int X=900;
        callBy hi=new callBy();
        hi.callByValue(X);
        System.out.println(X);

        int[] Arr1={2,4,5,6};
        arr(Arr1);
    }


}
