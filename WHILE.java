public class WHILE {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + 2*i;
                i++;
        }
        System.out.println(sum);
    }
}