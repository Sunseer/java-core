package ru.agrin.tracker;

import java.util.Scanner;

/**
 * Консольный ввод пользователем.
 * Created by grin on 21.12.2016.
 */
public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range){
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        }
        else {
            throw new MenuOutException("Такого № меню не существует.");
        }
    }
}
