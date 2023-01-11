// Output each key-value pair of the given map in the loop, each pair on a new line.

// Each line must look like key=value, for example, Gamma=3.

import java.util.*;

public class MapEntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);

        // write your code here   
        for (var entry: map.entrySet())
            System.out.println(entry.getKey()+"="+entry.getValue());
    }
}
