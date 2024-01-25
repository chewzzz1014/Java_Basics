package function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", String::length);

        // compose(): combine several functions into one and execute sequentially
        // intToString -> quote
        Function<Integer, String> intToString = Object::toString;
        Function<String, String> quote = s -> "'" + s + "'";
        Function<Integer, String> quoteIntToString = quote.compose(intToString);

        short[] array = {(short) 1, (short) 2, (short) 3};
        byte[] tranformedArray = transformArray(array, s-> (byte)(s*2));
    }

    public static byte[] transformArray(short[] array, ShortToByreFunction fn) {
        byte[] transformedArray = new byte[array.length];
        for (int i=0; i<array.length; i++) {
            transformedArray[i] = fn.applyAsByte(array[i]);
        }
        return transformedArray;
    }
}
