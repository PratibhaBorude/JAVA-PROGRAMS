public class overloading {
    public static int overLoad(int a){

        System.out.println(a);
        return a;

    }
    public static int overLoad(int a, int b){

        System.out.println(a+b);
        return a+b;
    }
    public static void main(String[]args){
        overLoad(3);

        overLoad(8,9);
    }

}
