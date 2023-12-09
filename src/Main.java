import Vehicle.*;

public class Main {
    public static void main(String[] args) {
        Truck truck= new Truck(2000,200,200);
        truck.getInf();
        truck.move();
        Car car =new Car(250,200,4,"toyota");
        car.getInf();
        car.move();
        Bicycle bicycle=new Bicycle("single",45,50);
        car.getInf();car.move();
        Boat boat =new Boat("bamboo",80,250);
        boat.getInf();boat.move();
        }
    }
