interface GPS {
    void Gps();
}

interface CALC {
    void Calculating();
    private void helo(){
        System.out.println("I am private");

    }
    default void calculate() {
        System.out.println("Hello I am default");
        helo();

    }
}

class CellPhone {
    void ring() {
        System.out.println("Ringing...");
    }

    void songs() {
        System.out.println("Listening to music>>>");
    }

    class SmartPhone extends CellPhone implements GPS, CALC {
        @Override
        public void Gps() {
            System.out.println("Location");
        }

        @Override
        public void Calculating() {
            System.out.println("Calculating");
        }

        public void Instagram() {
            System.out.println("Scroll");
        }
    }
}

public class Pol_Inh_Interface {
    public static void main(String[] args) {
        // Create an instance of CellPhone
        CellPhone cellPhone = new CellPhone();
        cellPhone.ring(); // Test method from CellPhone

        // Create an instance of SmartPhone using the CellPhone instance
        CellPhone.SmartPhone mySmartPhone = cellPhone.new SmartPhone();

        // Test methods from SmartPhone
        mySmartPhone.ring();         // Inherited from CellPhone
        mySmartPhone.songs();        // Inherited from CellPhone
        mySmartPhone.Gps();          // Implemented from GPS
        mySmartPhone.Calculating();  // Implemented from CALC
        mySmartPhone.Instagram();    // Specific to SmartPhone
        mySmartPhone.calculate();
    }
}


