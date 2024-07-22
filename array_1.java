public class array_1 {
    public static void main(String[] args) {
        // Define the array of integers
        int[] arr = {24, 67, 89, 45};

        // Initialize variables to keep track of max1 and max2
        int max1 = arr[0];  // Assume the first element as the maximum
        int max2 = arr[1];  // Assume the second element as the second maximum

        // Iterate through the array to find max1 and max2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                // If current element is greater than max1,
                // shift max1 to max2 and update max1
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                // If current element is greater than max2 (but not equal to max1),
                // update max2
                max2 = arr[i];
            }
        }

        // Print the maximum and second maximum values found
        System.out.println("Max1: " + max1);
        System.out.println("Max2: " + max2);
    }
}

