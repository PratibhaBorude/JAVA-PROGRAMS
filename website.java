import java.util.Scanner;
public class website {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String web= sc.nextLine();
        if(web.endsWith(".com")){
            System.out.println("Commercial");
        }
        else if (web.endsWith(".org")){
            System.out.println("Organizational");
        }
        else if (web.endsWith(".in")){
            System.out.println("Indian");
        }
        else {
            System.out.println("unknown");
        }
    }
}
