import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int largest = num1 > num2 ? num1 : num2;
        int i = largest / 2;
//        for (;;i++){
//            if(i%num1==0&&i%num2==0){
//                System.out.println(i);
        while(true){
            if(i%num1==0&&i%num2==0){
              System.out.println(i);
                break;//this will only print lcm
            }i++;
      }
//        do
//        {
//            System.out.println(i);
//            while (true)
//            {
//                if (i % num1 == 0 && i % num2 == 0)
//                {
//                    // System.out.println(i);
//                    break;//this will only print lcm
//                }
//                i++;
//
//            }


        }

    }
