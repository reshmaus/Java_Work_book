import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Person("Cleopatra", "Egypt", "69 BC", 1),
                new Person("Alexander the Great", "Macedon", "356 BC", 2),
                new Person("Julius Caesar", "Rome", "100 BC", 3),
                new Person("Hannibal", "Carthage", "247 BC", 4),
                new Person("Confucius", "China", "551 BC", 5),
                new Person("Pericles", "Greece", "429 BC", 6),
                new Person("Spartacus", "Thrace", "111 BC", 7),
                new Person("Marcus Aurelius", "Rome", "121 AD", 8),
                new Person("Leonidas", "Greece", "540 BC", 9),
                new Person("Sun Tzu", "China", "544 BC", 10),
                new Person("Hammurabi", "Babylon", "1750 BC", 11),
        };

        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            //airline.setPerson(people[i]);
            if (people[i].applyPassport() == true) {
                people[i].setPassport();
                airline.createReservation(people[i]);
            }
        }
        System.out.println("********************** RESERVATIONS COMPLETE! **********************\n");
        System.out.println(airline);

//        System.out.println(airline.getPerson(1));
//        System.out.println(airline.getPerson(5));
//        System.out.println(airline.getPerson(10));


    }









//    public static void main(String[] args) {
//        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
//        Person person2 = new Person(person);
//        person.name = "Rayan Slim";
//        person.nationality = "Canadian";
//        person.dateOfBirth = "01/01/1111";
//        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
//        person.seatNumber = 5;
//        person2.setName("Jad Slim");
//        person2.setSeatNumber(3);
//        person.setSeatNumber(10);

//        person.chooseSeat();
//
//        if (person.applyPassport() == true) {
//            person.setPassport();
//        }
//
//        System.out.println(person);


//        System.out.println("Name:" + person.getName() + "\n" +
//                "Nationality: " + person.getNationality() + "\n" +
//                "Date of Birth: " + person.getDateOfBirth() + "\n" +
//                "Seat number: " + person.getSeatNumber() + "\n" +
//                "Passport: " + Arrays.toString(person.getPassport()) + "\n");


//        System.out.println("Name:" +person2.getName() + "\n" +
//                "Nationality: " + person2.getNationality() + "\n" +
//                "Date of Birth: " + person2.getDateOfBirth() + "\n" +
//                "Seat number:" + person2.getSeatNumber() + "\n");

        //if (person.applyPassport() == true) {
//            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
//        } else {
//            System.out.println("We're sorry " + person.getName() + ". We cannot process your application.");
//        }



        }


