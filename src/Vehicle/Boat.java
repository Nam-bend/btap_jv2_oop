package Vehicle;

public class Boat extends Vehicle_{
    private String hullMaterial ;
    public Boat(String hullMaterial,int speed ,int capacity){
        super(speed,capacity);
        this.hullMaterial=hullMaterial ;
    }

    @Override
    public void getInf() {
        System.out.println(" hull material "+hullMaterial);
        System.out.println(" speed ="+ getSpeed());
        System.out.println("capacity = "+ getCapacity());
    }

    @Override
    public void move() {
        System.out.println("boat run  ");
    }
}
