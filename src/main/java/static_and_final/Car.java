//Question
    //WAP to show use of static keyword in java.
//Answer
package static_and_final;
public class Car {
    static double price=20;
    static class Car_info {
        static double OnRoad(String city) {
            if (city.equals("New York"))
                return price + price * 0.9;
            else if (city.equals("Mumbai")) {
                return price + price * 0.1;
            } else
                return price + price * 0.2;
        }

        static String model(int number) {
            if (number == 45)
                return "BMW";
            else
                return "Honda City";
        }
    }

    public static void main(String[] args) {
        System.out.println("The car price is "+Car.price);
        System.out.println("The Car OnRoad price is"+Car_info.OnRoad("Mumbai"));
        System.out.println("The Car OnRoad price is"+Car_info.OnRoad("Dubai"));
    }
}
