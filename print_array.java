public class print_array {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 4};
//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.print(arr[i]);
//            if (i < arr.length-1) {
//                System.out.print(",");
//            }
            for (int element : arr) {
                System.out.print(element + " ");

//        }
    }
}
}