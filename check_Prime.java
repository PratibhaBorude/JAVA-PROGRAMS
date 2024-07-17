import java.util.Scanner;
public class check_Prime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        boolean isPrime= true;
       for (int i=2; i<num;i++){
           if(num%i==0){
               isPrime = false;
               break;
           }
       }
       if (num<=1){
           isPrime=false;
       }
       if (isPrime=true){
           System.out.println(num+ " is prime number");
       }else {
           System.out.println(num+" is not a prime number");
       }
    }
}

//=, ==
//-1,0,1

