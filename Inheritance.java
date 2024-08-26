class cars {
    int wheels;
    String color;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
    class Tesla extends cars{
        int speed;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }



public class Inheritance {
    public static void main(String[]args){
    Tesla New=new Tesla();
    New.setWheels(4);
    System.out.println(New.getWheels());

    }
    }

