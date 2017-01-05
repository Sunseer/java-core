package ru.agrin.tracker;

/**
 * Created by grin on 04.01.2017.
 */
public interface UserAction {

    int key();

    void execute(Input input, Tracker tracker);

    String info();
}
