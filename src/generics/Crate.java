package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Crate<T> {

    private T goods;

    public void pack(T goods) {
        this.goods = goods;
    }

    public T unpack() {
        return goods;
    }

    public static void main(String[] args) {

        Crate<String> stringCrate = new Crate<>();
        stringCrate.pack("Goods are here.");
        String goods = stringCrate.unpack();
        System.out.println(goods);
    }
}

class NonGenericCrate {

    public static <T> void pack(T goods) {
        System.out.println("Goods packet: " + goods.toString());
    }

    public static void main(String[] args) {

        NonGenericCrate.pack("String");
        NonGenericCrate.pack(Arrays.asList(25, 26, 27));
    }
}
