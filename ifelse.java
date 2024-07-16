/*
* Design an app to read age of 3 siblings Ramu,Raghu & Raju.App should
* display age of youngest sibling
* */
import java.util.Scanner;
public class ifelse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Ramu= sc.nextInt();
        int Raghu=sc.nextInt();
        int Raju=sc.nextInt();
        if(Ramu<Raghu && Ramu<Raju){
            System.out.println("Ramu is the youngest");}
          else if(Raghu<Raju && Raghu<Ramu){
              System.out.println("Raghu is the youngest");
            }
          else {
              System.out.println("Raju is the Youngest");
        }

            //n log n
            //o log n
        }
        //&& -and True+True=True
            // ||-or True +False=True
    }


