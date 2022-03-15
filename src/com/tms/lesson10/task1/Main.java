package com.tms.lesson10.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    private static String USER_FILE_NAME ="user.dat";

    public static void main(String[] args) {
        User user = new User("Vanja", 16, Sex.MALE);
        serialization(user);
        deserialization();
    }

    private static void serialization(User user) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(USER_FILE_NAME))) {
            objectOutputStream.writeObject(user);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void deserialization() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(USER_FILE_NAME))) {
            User user = (User) objectInputStream.readObject();
            System.out.println(user.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
