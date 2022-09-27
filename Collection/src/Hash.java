import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        // there is a doubly linked list connecting the inserted items
        //LinkedHashMaps need more memory
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("aaa", 1);
        map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("ddd", 4);
        map.put("eee", 5);

        for (String key : map.keySet())
            System.out.println(key + " - " + map.get(key));

    }
}
