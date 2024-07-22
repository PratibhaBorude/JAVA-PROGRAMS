import java.util.Scanner;
//import java.util.zip.ZipEntry;

public class zigzag {
    public static int length(int num){
        int count=0;
        while (num!=0){
            num=num/10;

            count++;

        }
        return count;

    }
    public static int reverse(int num) {
 int rev=0;
 while (num!=0){
     int d=num%10;
     rev=rev*10+d;
     num=num/10;
 }
 return rev;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if (length(num1)==length(num2)){
            int rev_of_num1 =reverse(num1);
            int zigzag=0;
            while (rev_of_num1!=0) {
                int d = rev_of_num1 % 10;
                zigzag = zigzag * 10 + d;
                d = num2 % 10;
                zigzag = zigzag * 10 + d;
                rev_of_num1 = rev_of_num1 / 10;
                num2 = num2 / 10;
            }
                System.out.println(zigzag);


        } else{
            System.out.println("Invalid");
        }
    }
}

