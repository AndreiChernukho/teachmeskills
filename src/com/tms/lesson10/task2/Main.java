package com.tms.lesson10.task2;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static final String PATHREADFILE = "src/com/tms/lesson10/task2/resources/textAll.txt";
    static final String PATHWRITEFILE = "src/com/tms/lesson10/task2/resources/text.txt";
    static final String PATHWRITEFILE2 = "src/com/tms/lesson10/task2/resources/text2.txt";
    static final String USER_FIRST = "Собака: ";
    static final String USER_SECOND = "Кошка: ";

    public static void main(String[] args) throws IOException {

        boolean isFirst = true;
        BufferedReader reader;

        StringBuilder textForFirstUser = new StringBuilder();
        StringBuilder textForSecondUser = new StringBuilder();
        reader = new BufferedReader(new FileReader(PATHREADFILE));
        String line = reader.readLine();
        while (line != null) {
            if (line.startsWith(USER_FIRST)) {
                isFirst = true;
            } else if (line.startsWith(USER_SECOND)) {
                isFirst = false;
            }
            if (isFirst) {
                textForFirstUser.append(line).append("\n");
            } else {
                textForSecondUser.append(line).append("\n");
            }
            line = reader.readLine();
        }
        reader.close();

        writeFile(textForFirstUser.toString(), PATHWRITEFILE);
        writeFile(textForSecondUser.toString(), PATHWRITEFILE2);
    }

    public static void writeFile(String text, String path) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(text);
        }
    }
}
