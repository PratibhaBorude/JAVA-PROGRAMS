import java.util.Scanner;
public class AVG {
    public static void main(String[]args){
        System.out.println("Enter marks in %");
        System.out.println("Science");
        Scanner  sc=new Scanner(System.in);
        int sci= sc.nextInt();
        System.out.println("Maths");
        int Maths= sc.nextInt();

        System.out.println("English");
        int ENG= sc.nextInt();
int avg=(sci+Maths+ENG)/3;
        System.out.println("Your AVG is\n"+avg);

if(avg >= 40 && sci >= 33 && Maths >= 33 && ENG>= 33){
    System.out.println("You are PASS");
}
else {
    System.out.println("Better Luck Next Time!");
}

    }

}
