import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Task 1
        //Ask the user: How many historical figures will you register?. Store the value in an int variable.
        System.out.println("How many historical figures will you register?.  ");
          int people = scan.nextInt();

//          Task 2
//Make a 2D array named: database. The data we're going to submit will take the form of a table.
//        So, our array must have as many rows as there are historical figures. Each row also needs 3 values.
        String[][] database = new String[people][3];

//Task 3
//Create a for loop that runs through every row in the database. The user needs to submit three values per row.
//  As the user submits each value, you need to store it in the appropriate row. While doing this task, be careful of the nextLine pitfall (see cheat sheet).
   scan.nextLine();
        for (int i = 0; i < database.length; i++){
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");
   }
        System.out.println("These are the values you stored:");
        //Task 4: call print2DArray.
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String name = scan.nextLine();
        System.out.println("\n");
        for (int i = 0; i < database.length; i++){
            System.out.println("\tName: " + database[i][0]);
            System.out.println("\tDate of birth: " + database[i][1]);
            System.out.println("\tOccupation: " + database[i][2]);
        }
    }
    public static void print2DArray(String[][] array){
        for (int i= 0; i < array.length; i++){
            System.out.println("\t");
            for (int j= 0; j < array.length; j++){
                System.out.println(array[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}
