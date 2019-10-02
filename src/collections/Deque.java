package collections;

import java.util.ArrayDeque;

public class Deque {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("1");
        deque.push("2");
        String s = deque.poll();
        System.out.println(s);

        deque.clear();
        deque.push("1");
        deque.push("2");
        s = deque.pop();
        System.out.println(s);

        deque.clear();
        deque.offer("1");
        deque.offer("2");
        s = deque.pop();
        System.out.println(s);

        deque.clear();
        deque.offer("1");
        deque.offer("2");
        s = deque.poll();
        System.out.println(s);
    }
}
