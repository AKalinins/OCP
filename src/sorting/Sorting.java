package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("One");
        list.add("ONE");
        list.add("On");

        Collections.sort(list);
        System.out.println(list);
    }
}
