import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        //insert into the map 0(1) if there is no collision
        map.put(1, "Adam");
        map.put(2, "Kevin");
        map.put(3, "Ana");
        map.put(40, "Lucy");
        //map.put(null,"This is an null");

        //remove items i 0(1)
        map.remove(2);

        //we can retrieve items based on keys 0(1)
      // System.out.println(map.get(70));

        for(Map.Entry<Integer,String> entry : map.entrySet())
            System.out.println(entry.getKey() +" - " + entry.getValue());

    }
}
