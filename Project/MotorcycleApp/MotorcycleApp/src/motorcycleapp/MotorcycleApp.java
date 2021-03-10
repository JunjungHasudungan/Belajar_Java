
package motorcycleapp;

public class MotorcycleApp {

    private String name;
    int amount = 0;
    
    MotorcycleApp(String inputName){
     this.name = inputName;
     this.amount += 1;
    }

    void setName(String inputName){
    
        this.name = inputName;
        this.amount += 1;
    }
    
    public String getName(){
     
        return this.name;
    }
    
    
    public static void main(String[] args) {
       
        MotorcycleApp motor = new MotorcycleApp("Vario");
        MotorcycleApp motor1 = new MotorcycleApp("Beat");
        
        System.out.println(motor.name);
        System.out.println(motor1.name);
        motor1.setName("Supra");
        System.out.println("Nama sudah berubah: " + motor1.getName());
    }
    
}
