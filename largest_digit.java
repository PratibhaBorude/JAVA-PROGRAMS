//from given number find the largest digit
//test case
// input 3647
//output=7
import java.util.Scanner;
public class largest_digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        //initialize largest with 0
        int largest=0;
        //while loop continues until num becomes 0
        while (num!=0){
            // num%10 wil extract the last digit
            int digit=num%10;
            //digit>largest will compare
            if (digit>largest){
                //update the current digit as a last digit
                largest=digit;
            }
            //removes last digit from number at each iteration
            num=num/10;
        }
       System.out.println(largest);
    }
}
