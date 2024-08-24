public class fibo {
    public static int fibonacci(int p) {
        if (p <= 0) {
            return 0;
        } else if (p == 1) {
            return 1;
        } else {
            return fibonacci(p - 1) + fibonacci(p - 2);
        }
    }
        public static void main(String[]args){
        //fibonacci(3);
        System.out.print(fibonacci(3));

        }
}
