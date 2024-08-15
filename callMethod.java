public class callMethod {
    public static int method1(int a,int b){
        int c=a+b;
        System.out.println(c);

        return c;

    }
    public static void method2(int a,int b){
        int c=a/b;
        System.out.println(c);

    }

    public static void main(String[]args){
       // method1(2,4);
        callMethod obj=new callMethod();
        obj.method1(2,5);

        callMethod object=new callMethod();
        object.method2(10,5);

        method2(45,9);
    }


}
