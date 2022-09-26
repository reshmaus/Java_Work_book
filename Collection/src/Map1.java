import java.util.HashSet;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
         //initial capacity = 16
        //hashCode function (hash-function) transforms the input into an array index
        Set<String> set = new HashSet<>();
        set.add("Adam");
        set.add("Mary");
        set.add("Katy");
        set.add("Ana");

        for(String s : set)
            System.out.println(s);


    }
}
