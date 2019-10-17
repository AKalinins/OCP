package collections;

import java.util.ArrayDeque;

public class Deque {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("1");
        System.out.println(deque);
        deque.push("2");
        System.out.println(deque);
        String s = deque.poll();
        System.out.println(deque);

        deque.clear();
        deque.push("1");
        System.out.println(deque);
        deque.push("2");
        System.out.println(deque);
        s = deque.pop();
        System.out.println(deque);

        deque.clear();
        deque.offer("1");
        System.out.println(deque);
        deque.offer("2");
        System.out.println(deque);
        s = deque.pop();
        System.out.println(deque);

        deque.clear();
        deque.offer("1");
        System.out.println(deque);
        deque.offer("2");
        System.out.println(deque);
        s = deque.poll();
        System.out.println(deque);
    }
}
