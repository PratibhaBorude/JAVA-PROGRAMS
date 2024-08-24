class Rectangle {
    int length;
    int breadth;


    public void side() {
        System.out.println(length +"\n" +breadth);
    }

    public void Area() {
        float Area_of_Rectangle = length * breadth;
        System.out.println(Area_of_Rectangle);
    }

    public void Perimeter() {
        int perimeter_of_Rectangle= 2*length+2*breadth;
System.out.println(perimeter_of_Rectangle);
    }
}

    public class square_Operations {
        public static void main(String[]args){

            Rectangle ABCD=new Rectangle();
            ABCD.length=5;
            ABCD.breadth=3;
            ABCD.side();
            ABCD.Area();
            ABCD.Perimeter();
        }

}
