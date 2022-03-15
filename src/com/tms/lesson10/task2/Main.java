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
        String textAll = readFile(PATHREADFILE).toString();
        StringBuilder textForFirstUser = new StringBuilder();
        StringBuilder textForSecondUser = new StringBuilder();

        String[] strings = textAll.split("\n");
        for (String str : strings) {
            if (str.startsWith(USER_FIRST)) {
                isFirst = true;
            } else if (str.startsWith(USER_SECOND)) {
                isFirst = false;
            }
            if (isFirst) {
                textForFirstUser.append(str).append("\n");
            } else {
                textForSecondUser.append(str).append("\n");
            }
        }
        writeFile(textForFirstUser.toString(), PATHWRITEFILE);
        writeFile(textForSecondUser.toString(), PATHWRITEFILE2);
    }

    public static StringBuilder readFile(String path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine()).append("\n");
            }
        }
        return stringBuilder;
    }

    public static void writeFile(String text, String path) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(text);
        }
    }
}
