package com.example.bealdung.collections;

import java.util.*;

public class IteratorMain {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("Hello", "World", "NNNANA", "AJAHHAHA"));

        Iterator<String> iterator = items.iterator();

        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);

            if ("TWO".equals(next)) {
                iterator.remove(); // remove while iterating, w/o risk of ConcurrentModificationException
            }
        }


        // ListIterator: extension of Iterator
        ListIterator<String> listIterator = items.listIterator(items.size());

        while (listIterator.hasNext()) {
            String nextWithIndex = items.get(listIterator.nextIndex());
            String next = listIterator.next();
            if ("REPLACE ME".equals(next)) {
                // replace the element that was returned in the call to next() or previous():
                listIterator.set("REPLACED");
            }
        }
        listIterator.add("NEW");
        // hasPrevious & previous
        while (listIterator.hasPrevious()) {
            String previousWithIndex = items.get(listIterator.previousIndex());
            String previous = listIterator.previous();
            System.out.println(previous);
        }



    }
}
