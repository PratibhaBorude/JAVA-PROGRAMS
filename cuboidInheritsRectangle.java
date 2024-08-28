class rectangle {
    int length;
    int width;
    float area;


    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public void setArea(){
        this.area=area;
    }
    public float getArea(){
        return length*width;
    }
}
    class Cuboid extends rectangle{
        int height;
        public void setHeight(int height){
            this.height=height;
        }
        public int getHeight(){
            return height;
        }
        public float Area2(){
            //Surface Area=2×(lw+lh+wh)
            return (float)(2*length*width+length*height+width*height);

        }
        public float volm(){
            return (float)(length*width*height);
        }
    }

public class cuboidInheritsRectangle {
    public static void main(String[]args){
        Cuboid c=new Cuboid();
        c.setHeight(9);
        c.setLength(8);
        c.setWidth(5);

        System.out.println(c.getHeight());
        System.out.println(c.getLength());
        System.out.println(c.getWidth());
        System.out.println(c.getArea());
        System.out.println(c.Area2());
        System.out.println(c.volm());
    }

}
