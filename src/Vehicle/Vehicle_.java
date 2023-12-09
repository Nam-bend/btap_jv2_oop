package Vehicle;

 public abstract class Vehicle_ implements Move {
    private int speed;
    private int capacity;

    public Vehicle_(int speed, int capacity ) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCapacity(double capacity) {
        this.capacity = (int) capacity;
    }

    public abstract void getInf();

     @Override
     public void move() {

     }
 }
