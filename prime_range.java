// write numbers which are prime from the given range
public class prime_range {
    public static boolean primeInRange(int num){
        if(num<=1){
            return false;
        }
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){

       for (int i=10;i<=20;i++){
           if (primeInRange(i)){
               System.out.println(i);
           }
       }

    }

}
