package ru.agrin.tracker;

/**
 * Запуск трекера.
 * Created by grin on 21.12.2016.
 */
public class StartTracker {
    private Input input;
    private final Tracker tracker;

    public StartTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Запуск меню.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, tracker);
        final int[] ranges = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        menu.fillActions();
        do {
            menu.showMenu();
            menu.select(this.input.ask("Введите номер меню.", ranges));
        }
        while (!"да".equals(this.input.ask("Выйти из программы?")));
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new ValidateInput();
        new StartTracker(input, tracker).init();
    }
}
