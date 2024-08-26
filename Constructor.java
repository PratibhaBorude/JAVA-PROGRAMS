class rectanghe {
    int length;
    int breadth;
    public rectanghe(int length,int breadth){
        length=length;
        breadth=breadth;
        System.out.println(length + "\n"+breadth);
    }
    public rectanghe(int height){
        height=height;
        System.out.println(height);
    }
}
public class Constructor {
    public static void main(String []args) {
        rectanghe ABCD = new rectanghe(9);
        rectanghe Abcd=new rectanghe(7,8);
    }
    }

