package ru.agrin.tracker.start;

import ru.agrin.tracker.models.Tracker;

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
     * Запись всех порядковых номеров меню в массив
     * @return range - массив порядковых номеров меню.
     */
    public int[] ranges() {
        MenuTracker menuTracker = new MenuTracker(this.input, tracker);
        menuTracker.fillActions();
        int[] range = new int[menuTracker.getActions().length];
        for (int i = 0; i < range.length; i++) {
            range[i] = menuTracker.getActions()[i].key();
        }
        return range;
    }

    /**
     * Запуск меню.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, tracker);
        final int[] ranges = ranges();
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
