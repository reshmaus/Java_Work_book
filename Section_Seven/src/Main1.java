import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
//        String[] parts = {"tires", "keys"};
        Scanner scan = new Scanner(System.in);
        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red",new String[] {"tires", "keys"}),
                new Car("Dodge", 8500,2019,"blue", new String[] {"tires", "keys"}),
                new Car("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filters"}),
                new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filters"}),
                new Car("Mercedes", 12000, 2015, "jet black", new String[] { "tires", "filters", "transmission"}),
        };

        DealerShip dealerShip = new DealerShip(cars);
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make = scan.nextLine();
        System.out.print("Enter your budget: ");
        int budget = scan.nextInt();

        int index = dealerShip.search(make, budget);
        switch (index){
            case 404:
                System.out.println(" Feel free to browse through our collection of cars.\\n");
                System.out.println(dealerShip);
                break;

            default: scan.nextLine();
            String decision =scan.nextLine();
            if (decision.equalsIgnoreCase("yes")){
                dealerShip.sell(index);
            }
        }



        //System.out.println(dealerShip);
//
//        for (int i = 0; i < cars.length; i++){
//            dealerShip.setCar(cars[i], i);
//
//            //System.out.println(cars[i]);
//        }
//             dealerShip.sell(2);
//        System.out.println(dealerShip);
//
//

//        Car newCar = dealerShip.getCar(0);
//        newCar.setColor("blue");
//       System.out.println(dealerShip.getCar(0));
//        System.out.println(dealerShip);
//        System.out.println("0");
//        System.out.println(newCar);
//

//        dealerShip.setCar(cars[0], 0);
//        dealerShip.setCar(cars[1], 1);
//        dealerShip.setCar(cars[2], 2);

//          Car nissan = new Car("Nissan", 5000, 2020, "red", parts);
//           Car dodge = new Car("Dodge", 8500,2019,"blue", parts);
//           Car nissan2 = new Car(nissan);

//          nissan.make = "Nissan";
//          nissan.price = 5000;
//          nissan.year = 2020;
//          nissan.color = "red";
//
//          Car dodge = new Car();
//        dodge.make = "Dodge";
//        dodge.price = 11000;
//        dodge.year = 2019;
//        dodge.color = "blue";
//
//        System.out.println(nissan.getColor());

//        nissan.setColor("Jet Black");
//        dodge.setColor("Jet Black");
//
//
//        nissan.setPrice( nissan.getPrice() / 2);
//
//
//        dodge.setPrice(dodge.getPrice() / 2);

//        nissan2.setColor("Yellow");
//        nissan2.setParts(new String[] { "tires", "filters"}); //return new String[] {"1", "2"..}
//         DealerShip dealerShip = new DealerShip();
//         dealerShip.setCar(nissan, 0);
//        dealerShip.setCar(dodge, 1);
//        dealerShip.setCar(nissan2, 2);


//        System.out.println(nissan);
//        System.out.println(dodge);
//        System.out.println(nissan2);

//        String[] outsideVariable = nissan.getParts();
//        outsideVariable[1] = "hello";
      // System.out.println(Arrays.toString(nissan2.getParts()));

//        nissan.drive();
//        dodge.drive();
//        nissan2.drive();



//        System.out.println("This " + nissan.getMake() + " is worth $ " + nissan.getPrice() +
//                ". it was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
//
//        System.out.println("This " + dodge.getMake() + " is worth $ " + dodge.getPrice() +
//                ". it was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
//
//        System.out.println("This " + nissan2.getMake() + " is worth $ " + nissan2.getPrice() +
//                ". it was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");


//        System.out.println(nissan.make);
//        System.out.println(nissan.price);
//        System.out.println(nissan.year);
//        System.out.println(nissan.color);

    }
}
