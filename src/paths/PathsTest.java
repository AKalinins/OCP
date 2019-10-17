package paths;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest {

    public static void main(String[] args) {

        Path p1 = Paths.get("photos\\..\\beaches\\.\\calangute\\a.txt");
        Path p2 = p1.normalize();
        Path p3 = p1.relativize(p2);
        Path p4 = p2.relativize(p1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println(
                p1.getNameCount()+" "+p2.getNameCount()+" "+
                        p3.getNameCount()+" "+p4.getNameCount());

        System.out.println(Paths.get("/", "test.txt"));

    }
}
