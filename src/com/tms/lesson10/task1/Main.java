package com.tms.lesson10.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        User user = new User("Vanja", 16, Sex.MALE);
        String USER_FILE_NAME = "user.dat";
        SerializationService.serialization(user, USER_FILE_NAME);
        SerializationService.deserialization(USER_FILE_NAME);
    }


}
