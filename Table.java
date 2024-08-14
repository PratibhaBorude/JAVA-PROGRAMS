public class Table {
    public static void main(String[]args){
        int n=10;
        System.out.println("Table of " +n );
        for (int i=10;i>=1;i--){
           int table=n*i;

            System.out.printf("%d X %d = %d\n " , n,i,table);
        }
    }
}
