class Cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }

}

public class oops_Practice_Set {
    public static void main(String[]args){
        Cellphone Samsung=new Cellphone();
        Samsung.ring();
        Samsung.vibrate();
    }
}
