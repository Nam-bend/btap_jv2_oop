package Vehicle;

public class Bicycle extends Vehicle_ {
    private String typeOfBicycle ;
    public Bicycle(String typeOfBicycle ,int speed ,int capacity){
        super(speed,capacity);
        this.typeOfBicycle=typeOfBicycle;

    }
    @Override
    public void move() {
        System.out.println("This mountain bike moves uphill");
    }
    @Override
    public void getInf() {
        System.out.println("type of bicycle ="+ typeOfBicycle);
        System.out.println("speed ="+ getSpeed());
        System.out.println("capacity = "+ getCapacity());
    }
}
