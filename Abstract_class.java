 abstract class Animal{
    abstract void makeSound();
void sleep(){
    System.out.println("Zzz");

}
}
class dog extends Animal{
    void makeSound(){
        System.out.println("barking");
    }
}
public class Abstract_class {
    public static void main(String[]args){
        Animal Mydog=new dog();
        Mydog.makeSound();
    }
}
