import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args) {
       List<String> names = new ArrayList<>();

        names.add("Kevin");
        names.add("Adam");
        names.add("Ana");

        //contains will check whether the item is present in the array
        System.out.println(names.contains("Adam"));

        //System.out.println(names.get(0));
        //insert item into a given index - 0(N)
        //names.add(0, "Daniel");
        names.remove(0);

        for(String s : names)
            System.out.println(s);

    }




}
