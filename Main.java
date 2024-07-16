import java.util.Scanner;
public class Main {
    public static boolean isPrime(int num) {
        int count = 2;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                count++;
        }
        return count == 2;
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i);

            }
            // System.out.println("Hello world!");
        }
    }
}