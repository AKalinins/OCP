package collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Conc {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        try {
            for (Integer integer : list) {
                list.add(1);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Cannot modify inside loop");
        }

        Map<String, Integer> map = new ConcurrentHashMap<>();
        try {
            map.put(null, 1);
        } catch (Exception e) {
            System.out.println("Null keys are not allowed");
        }

        try {
            map.put("1", null);
        } catch (Exception e) {
            System.out.println("Null values are not allowed");
        }
    }
}
