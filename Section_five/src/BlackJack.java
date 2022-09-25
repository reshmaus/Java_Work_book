import java.util.Scanner;

public class BlackJack {
   public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall se..");
        System.out.println("..Ready? Press anything to begin!");

        scan.nextLine();

        int card1 = drawRandomCard();
        int card2 = drawRandomCard();

        System.out.println("\n you get a \n" + cardString(card1) + "\n and a \n" + cardString(card2));
           int total = Math.min(card1, 10) + Math.min(card2, 10) ;
        System.out.println("your total is: " + total);

        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();

        System.out.println("\n The dealer shows \n" + cardString(dealerCard1) + " \n and has a card facing down. \n" );
    }

    public static int drawRandomCard() {
        double randomNumber = Math.random() * 13; // 0-12.9999
        randomNumber += 1; //1 - 13.999
        return (int) randomNumber; // 1-13;
    }
    public static String cardString(int cardNumber){
        switch (cardNumber){
            case 1: return  "   _____\n"+
                            "  |A _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____V|\n";

            case 2: return  "   _____\n"+
                            "  |2    |\n"+
                            "  |  o  |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____Z|\n";

            case 3: return  "   _____\n" +
                            "  |3    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____E|\n";

            case 4:return       "   _____\n" +
                                "  |4    |\n"+
                                "  | o o |\n"+
                                "  |     |\n"+
                                "  | o o |\n"+
                                "  |____h|\n";

            case 5: return  "   _____ \n" +
                            "  |5    |\n" +
                            "  | o o |\n" +
                            "  |  o  |\n" +
                            "  | o o |\n" +
                            "  |____S|\n";

            case 6: return  "   _____ \n" +
                            "  |6    |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  |____6|\n";

            case 7: return  "   _____ \n" +
                            "  |7    |\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |____7|\n";

            case 8: return  "   _____ \n" +
                            "  |8    |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  |____8|\n";

            case 9: return      "   _____ \n" +
                                "  |9    |\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |____9|\n";

            case 10: return     "   _____ \n" +
                                "  |10  o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |___10|\n";

            case 11: return     "   _____\n" +
                                "  |J  ww|\n"+
                                "  | o {)|\n"+
                                "  |o o% |\n"+
                                "  | | % |\n"+
                                "  |__%%[|\n";

            case 12: return     "   _____\n" +
                                "  |Q  ww|\n"+
                                "  | o {(|\n"+
                                "  |o o%%|\n"+
                                "  | |%%%|\n"+
                                "  |_%%%O|\n";

            case 13:return  "   _____\n" +
                            "  |K  WW|\n"+
                            "  | o {)|\n"+
                            "  |o o%%|\n"+
                            "  | |%%%|\n"+
                            "  |_%%%>|\n";
            default: return " Not possible";

        }
    }
}