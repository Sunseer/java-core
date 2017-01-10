package ru.agrin.tracker.start;

import ru.agrin.tracker.models.Tracker;

/**
 * Created by grin on 04.01.2017.
 */
public interface UserAction {

    int key();

    void execute(Input input, Tracker tracker);

    String info();
}
