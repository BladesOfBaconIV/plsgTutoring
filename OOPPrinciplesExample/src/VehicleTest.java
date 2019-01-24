public class VehicleTest {

    public static void main(String[] args) {

        Horse silver = new Horse("Brown", "Silver", 16);
        System.out.println(silver);
        silver.mount();
        System.out.println(silver);

        Plane boe747 = new Plane("Boeing 747-400", "Aerlingus", 1000, 560, 400);
        System.out.println(boe747.getDescription());
        System.out.println(boe747.getWeight());

        Car focus = new Car("Ford", 130, 4);
        System.out.println(focus.getDescription());
        System.out.println(focus.getWeight());

    }
}
