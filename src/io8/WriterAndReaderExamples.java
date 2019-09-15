package io8;

import java.io.*;

import static io8.IoUtil.*;

public class WriterAndReaderExamples {

    public static void main(String[] args) throws IOException {

        String read = readFile(new File(PATH_TO_FILES + TEST_FILE_NAME));
        System.out.println("File read: " + read);
        writeToFile("Written using BufferedWriter.\n", new File(PATH_TO_FILES + FILE_TO_WRITE_NAME));
    }

    private static String readFile(File file) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                stringBuilder.append(data);
            }
        }
        return stringBuilder.toString();
    }

    private static void writeToFile(String text, File file) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))){
            bufferedWriter.write(text);
        }
    }
}
