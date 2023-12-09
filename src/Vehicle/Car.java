package Vehicle;

 public class Car extends Vehicle_ {
    private int numDoors;
    private String fuelType;


    public Car(int speed, int capacity, int numDoors, String fuelType) {
        super(speed, capacity);
        this.numDoors = numDoors;
        this.fuelType = fuelType;

    }


    @Override
    public void getInf() {
        System.out.println("num door =" + numDoors);
        System.out.println("fuel type =" + fuelType);
        System.out.println(" speed" + getSpeed());
        System.out.println("capacity " + getCapacity());
    }

    @Override
    public void move() {
        System.out.println(" car go to school");

    }
}



