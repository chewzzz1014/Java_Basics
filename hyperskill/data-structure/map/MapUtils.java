// Implement these two methods for a given array of string:

//     wordCount that returns a SortedMap<String, Integer> where keys are all different strings and values are the number of times that string appears in the array. The method takes an array of strings as input;
//     printMap that prints all entries of the map ("key : value").


import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        // write your code here
        SortedMap <String, Integer> map = new TreeMap <>();
        for (String c: strings){
            if (map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.putIfAbsent(c, 1);
        }
           
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        for(var entry: map.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}
