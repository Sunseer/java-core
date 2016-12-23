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
}
