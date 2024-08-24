public class repeat {
    public static void repeatNumber(int number, int times) {
            if (times > 0) {
                System.out.print(number + " ");
                repeatNumber(number, times-1 );
            }
        }
        public static void hi(int j){
       // boolean repeat=true;
int count=0;
        while (count<=6){
            System.out.print(j);
            count++;
        }
        }
    public static void main(String[] args) {
//        int number = 4;
//        int times = 5; // Number of times to repeat
       repeatNumber(7, 8);
       // hi(6);
    }
    }


