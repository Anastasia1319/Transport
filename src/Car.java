public class Car extends Vehicle implements Costable{
    private int doorsCount;

    public Car (int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    public void printInfo() {
        System.out.println("Транспортное средство: Машина - Количество дверей: " + doorsCount + " - Количество колес: " + wheelCount+ ". Стоимость: "+getCost() + " y.e.");
    }

    @Override
    public int getCost() {
        return (wheelCount*doorsCount*1000) -1;
    }
}
