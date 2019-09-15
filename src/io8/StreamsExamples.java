package io8;

import java.io.*;

import static io8.IoUtil.*;

public class StreamsExamples {

    public static void main(String[] args) throws IOException {

        String read = readFile(new File(PATH_TO_FILES + TEST_FILE_NAME));
        System.out.println("File read: " + read);
        writeToFile("We wrote this using a BufferedOutputStream.\n", new File(PATH_TO_FILES + FILE_TO_WRITE_NAME));
    }

    private static String readFile(File file) throws IOException {

        StringBuilder result = new StringBuilder();

        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {

            int bytes;
            while ((bytes = inputStream.read()) != -1) {
                result.append((char) bytes);
            }
        }
        return result.toString();
    }

    private static void writeToFile(String text, File file) throws IOException {

        try(BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            outputStream.write(text.getBytes());
        }
    }
}
