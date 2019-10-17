package io8.files;

import java.io.FileWriter;

public class IOTest {

        public static void main(String[] args)  throws Exception
        {
            FileWriter fw = new FileWriter("./text.txt");
            // fw.write("hello"); //1
            fw.close();
        }
}
