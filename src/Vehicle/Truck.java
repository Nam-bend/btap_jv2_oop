package Vehicle;

public class Truck extends Vehicle_ {
    private int towingCapacity;

    public Truck(int towingCapacity, int speed, int capacity) {
        super(speed, capacity);
        this.towingCapacity =towingCapacity ;
    }

    @Override
    public void getInf() {
        System.out.println("towing câpcity" + towingCapacity);
        System.out.println("speed =" + getSpeed());
        System.out.println("capacity =" + getCapacity());
    }

    @Override
    public void move() {
        System.out.println("Long distance transport truck ");
    }

}
