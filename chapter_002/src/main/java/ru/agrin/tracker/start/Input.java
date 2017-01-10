package ru.agrin.tracker.start;

/**
 * Интерфейс ввода.
 * Created by grin on 21.12.2016.
 */
public interface Input {
    String ask(String question);

    int ask(String question, int[] range);
}
