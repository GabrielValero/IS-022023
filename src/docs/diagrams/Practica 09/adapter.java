public class CoffeeMaker{
    public static void on(){};
    public static void off(){};
    public static void isOff(){};
}

public class CMAdapter extends Connectable{
    private CoffeeMaker cm = new CoffeeMaker(); 

    public void turnOn(){
        this.cm.on(); 
    }
    public void turnOff(){
        this.cm.off(); 
    }
    public void isOn(){
        this.cm.isOff(); 
    }
}
public class TurnOnDevices {

    public static void main(String[] args) {
        turnOnDevice(new CMAdapter());
        turnOnDevice(new Lamp());
        turnOnDevice(new Computer());
    }
   
    private static void turnOnDevice(Connectable device) {
        device.turnOn();
        System.out.println(device.isOn());
    }
   }