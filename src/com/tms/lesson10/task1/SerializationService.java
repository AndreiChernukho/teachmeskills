package com.tms.lesson10.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationService {
    public static void serialization(User user, String USER_FILE_NAME) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(USER_FILE_NAME))) {
            objectOutputStream.writeObject(user);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deserialization(String USER_FILE_NAME) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(USER_FILE_NAME))) {
            User user = (User) objectInputStream.readObject();
            System.out.println(user.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
