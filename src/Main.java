public class Main {
    public static void main(String[] args) {
        Vehicle moto1 = new Motorcycle(3,75);
        moto1.printInfo();
        Vehicle moto2 = new Motorcycle(2,220);
        moto2.printInfo();

        Vehicle car1 = new Car(4,3);
        car1.printInfo();
        Vehicle car2 = new Car(8,2);
        car2.printInfo();
    }
}