package com.tms.lesson7;

public class CashElementNotFoundException extends Exception {

    public CashElementNotFoundException() {
        super("Элемент кэша не найден");
    }
}
