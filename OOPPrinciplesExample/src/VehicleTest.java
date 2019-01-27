public class VehicleTest {

    public static void main(String[] args) {

        Horse silver = new Horse("Brown", "Silver", 16);
        System.out.println(silver);
        silver.mount();
        System.out.println(silver);

        Plane boe747 = new Plane("Boeing 747-400", "Aerlingus", 1000, 560, 400);
        Car focus = new Car("Ford", 130, 4);
        Bike mountainBike = new Bike("Mountain", 20);

        // All these can go in the same array as they are all children of the vehicle class
        // Horse can't however as it isn't a child of Vehicle
        Vehicle[] vehicles = {boe747, focus, mountainBike};

        // This is an example of polymorphism,
        // despite calling the same function each time it does different things based on the object
        for (Vehicle v : vehicles) {
            System.out.println(v.getDescription());
            System.out.println(v.getWeight());
        }

        // You can also make an array of objects that implement the same interface
        Rideable[] rideables = {silver, mountainBike};
        for (Rideable r : rideables) {
            // will call the dismount function associated with each rideable object
            r.dismount();
        }
    }
}
