public class Motorcycle extends Vehicle{
    private  int maxSpeed;

    public Motorcycle (int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printInfo() {
        System.out.println("������������ ��������: �������� - ���������� �����: " + wheelCount + " - ������������ ��������: " + maxSpeed + " ��/�.");
    }
}
