class circlee{
    int rad;
    float area;
    public void setRad(int m){
        this.rad=m;
    }
    public int getRad(){
        return  rad;
    }
    public float Area(){
        return (float) (Math.PI*rad*rad);
    }
}
class cylinderr extends circlee{
    int height;
    public  void setHeight(int n){
        this.height=n;
    }
    public int getHeight(){
        return height;
    }
    public float AreaCyli(){
        return (float)(2*Math.PI*rad*height*(rad+height));
    }
}
public class cylinderInheritsCircle {
    public static void main(String[]args){
        cylinderr H=new cylinderr();
        H.setHeight(8);
        H.setRad(10);
       System.out.println(H.getRad());
        System.out.println(H.getHeight());
        System.out.println(H.Area());
        System.out.println(H.AreaCyli());
    }
}
