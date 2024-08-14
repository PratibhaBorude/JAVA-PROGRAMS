public class SumOfArray {
    public static void main(String[] args) {
        float[] arr1 = {2.66f, 7.88f, 3.22f, 7.99f, 9.8f};
        float sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum=sum+(arr1[i]);
        }
        System.out.println(sum/ arr1.length);
    }
}