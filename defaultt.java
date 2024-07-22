import java.util.Scanner;
public class defaultt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dayNumber=sc.nextInt();
        //int dayNumber = 3; // Example day number (1 for Sunday, 2 for Monday, ..., 7 for Saturday)
        String day="";

        switch (dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            // No default case
        }

       System.out.println("Day of the week is: " + day);
    }
}

