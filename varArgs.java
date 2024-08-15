public class varArgs {
    // if we want to use same method but want to add elements
    // instead of creating multiple methods we can use varargs (int...arr)
    public static int Args(int...arr){
        int sum=0;
        for (int element:arr){
            sum=sum+element;
        }

return sum;
    }
    public static void main(String[]args){
        System.out.println(Args(2,3,4,6,7));

    }

}
