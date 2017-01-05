package ru.agrin.tracker;

/**
 * Запуск трекера.
 * Created by grin on 21.12.2016.
 */
public class StartTracker {
    private Input input;

    public StartTracker(Input input) {
        this.input = input;
    }

    /**
     * Запуск меню.
     */
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        do {
            menu.showMenu();
            int key = Integer.valueOf(input.ask("Введите номер меню"));
            menu.select(key);
        }
        while (!"да".equals(this.input.ask("Выйти из программы?")));
    }

    public static void main(String[] args) {

        Input input = new ConsoleInput();
        new StartTracker(input).init();
    }
}
