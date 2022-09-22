import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        int[][] grades = {
                {72, 74, 78, 76},
                {65, 64, 61, 67},
                {95, 98, 99, 100}

        };
//        for (int j = 0; j < grades[0].length; j++){
//            System.out.print(grades[0][j] + " "); //[0][0]  [0][1]  [0][2]
//        }
//        System.out.println("\n");
//        for (int j = 0; j < grades[1].length; j++){
//            System.out.print(grades[1][j] + " "); //[1][0]  [1][1]  [1][2]
//        }
//        System.out.println("\n");
//        for (int j = 0; j < grades[2].length; j++){
//            System.out.print(grades[2][j] +" "); //[2][0]  [2][1]  [2][2]
//        }
//        System.out.println("\n");

//        Nested loops
        for (int i = 0; i < grades.length; i++){ //0 1 2

            switch (i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tRobert: "); break;

            }

            for(int j= 0; j < grades[i].length; j++){
                System.out.print(grades[i][j] + " ");
            }
            System.out.print("\n");
        }




//        System.out.println("\tHarry: " + grades[0][0] + " " +grades[0][1] + " " + grades[0][2] +  " " + grades[0][3]);
//        System.out.println("\tRon: " + grades[1][0] + " " +grades[1][1] + " " + grades[1][2] +  " " + grades[1][3]);
//        System.out.println("\tRobert: " + grades[2][0] + " " +grades[2][1] + " " + grades[2][2] +  " " + grades[2][3]);
    }
}
