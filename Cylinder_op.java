class areaVolm{
    float height;
    float radius;
    public  areaVolm(float height,float radius){
        this.height=height;
        this.radius=radius;
    }
    public float Area(){
        return (float) (2*Math.PI*radius*(radius+height));
    }
    public float Volume(){
        return (float) (Math.PI*radius*radius*height);
    }
}
public class Cylinder_op {
    public static void main(String[] args) {

        areaVolm U = new areaVolm(7,9);

        System.out.println(U.height);
        System.out.println(U.radius);
        System.out.println(U.Area());
        System.out.println(U.Volume());

    }
}
