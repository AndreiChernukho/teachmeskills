package com.tms.lesson10.task3;

import java.io.File;
import java.util.*;

public class Main {

    public static ArrayList<File> AllFiles(ArrayList<File> files) {

        ListIterator<File> iter = files.listIterator();
        while (iter.hasNext()) {                                     //идем до конца списка, пока будут файлы
            File file = iter.next();                                 //сохраняем в переменную рассматриваемый файл или директорию
            if (file.isDirectory()) {                                //если файл - директория
                int count = iter.nextIndex();                        //запоминаем положение в списке
                files.addAll(Arrays.asList(file.listFiles()));       //добавляем в конец списка все содержимое папки
                iter = files.listIterator(count);                    //устанавливаем итератор на след элемент сразу после директории
            }
        }
        return files;
    }


    public static void main(String[] args) {
        //константа
        final String PATH = "D:\\IdeaProjects\\Teachmeskills\\teachmeskills\\src\\com\\tms\\lesson10\\task2";
        File file = new File(PATH);
        ArrayList<File> files = new ArrayList<>(Arrays.asList(file.listFiles()));
        //здесь возвращаем список всех файлов из директории и поддерикторий
        for (File value : Main.AllFiles(files)) {                                      //выводим абсолютные пути к файлам
            System.out.println(value.getAbsolutePath());
        }
    }
}
