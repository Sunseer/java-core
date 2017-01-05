package ru.agrin.tracker;

/**
 * Запуск трекера.
 * Created by grin on 21.12.2016.
 */
public class StartTracker {
    private Input input;
    private Tracker tracker;

    public StartTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Запуск меню.
     */
    public void init() {

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
        Tracker tracker = new Tracker();
        Input input = new ConsoleInput();
        new StartTracker(input, tracker).init();
    }
}
