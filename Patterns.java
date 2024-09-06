public class Patterns {
    public void pattern1(int n) {
//        ***
//        ***
//        ***
        for (int rows = 1; rows <= n; rows++) {
            for (int star = 1; star <= n; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    *
//    **
//    ***

    public void pattern2(int m) {
        for (int rows = 1; rows <= m; rows++) {
            for (int star = 1; star <= rows; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    ****
//    ***
//    **
//    *
    public void pattern3(int k) {
        for (int rows = 1; rows <= k; rows++) {
            for (int star = k; star >= rows; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//        4321
//        432
//        43
//        4

    public void pattern4(int k) {
        for (int rows = 1; rows <= k; rows++) {
            for (int star = k; star >= rows; star--) {
                System.out.print(star);
            }
            System.out.println();
        }


    }

    //               *
//                  ***
//                 *****
//                *******
    public void pattern5(int k) {
        for (int i = 1; i < k; i++) {
            for (int j = k; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (2 * i); j++) {
                System.out.print("*");
            }
            for (int j = k; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
//       *******
//        *****
//         ***
//          *

    public void pattern6(int k) {
        for (int i = 1; i < k; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <(2*k)- (2 * i); j++) {
                System.out.print("*");
            }
            for (int j = k; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

        public static void main(String[]args){
        Patterns s=new Patterns();
        s.pattern6(5);

    }
}
