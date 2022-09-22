public class Mars {
    public static void main(String[] args) {
        //Create a string variable named ColonyName, and set it equal to your desired name
        String ColonyName = "DownTown";

        //Create an int variable named ShipPopulation, and set it equal to 300
        int ShipPopulation =  300;

        //Create a double variable named ShipFood, and set it equal to 4000.00
        double  ShipFood =  4000.00;


         //Create a boolean variable named Landing, and set it equal to true
        boolean  Landing = true;

        //Upon reaching Mars everyone will eat 0.75 meals a day, to preserve food

        //The landing process takes 2 days, calculate how much food is left after landing
        //Equation: Food = Food - (Pop * 0.75);
        //Use the equation twice
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);

        //Print the amount of food that is left
        System.out.println(ShipFood);

        //An extra crate of food is found increasing ShipFood by 50%
        ShipFood = ShipFood + (ShipFood * .5);

        //The births very timed perfectly and 5 more babies join the ShipPopulation
        ShipPopulation = ShipPopulation + 5;

        //Choose where you want the ship to land. The Hill, The Plain, or The Ocean
        //Create a String value called LandingLocation and set it equal to "The Hill" or "The Plain" or "The Ocean"
        String  LandingLocation = "The Hill";
        //Create an if else statement. That checks to see if the LandingLocation is equal to "The Plain" ignoring case
        if (LandingLocation == "The Plain"){
            System.out.println( "Bbzzz Landing on the Plain");
        }else{
            System.out.println( "ERROR!!! Flight plan already set. Landing on the Plain");
        }




    }
}
