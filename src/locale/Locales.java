package locale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class Locales {

    public static void main(String[] args) {

        Locale system = Locale.getDefault();
        System.out.println("Default = " + system);
        Locale en = Locale.ENGLISH;
        Locale lv = new Locale("lv");

        ResourceBundle bundle = ResourceBundle.getBundle("Locales", en);
        Set<String> keys = bundle.keySet();
        keys.stream().map(k -> k + " " + bundle.getObject(k)).forEach(System.out::println);

        ResourceBundle bundle2 = ResourceBundle.getBundle("Locales", lv);
        keys = bundle.keySet();
        keys.stream().map(k -> k + " " + bundle2.getObject(k)).forEach(System.out::println);
    }

}