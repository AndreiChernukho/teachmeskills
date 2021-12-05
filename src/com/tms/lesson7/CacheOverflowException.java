package com.tms.lesson7;

public class CacheOverflowException extends Exception {

    public CacheOverflowException(int maxSize, String element) {
        super("Кэш переполнен (Максимальное количество элементов: " + maxSize
                + "), введенное слово '" + element + "' не сохранено");
    }
}
