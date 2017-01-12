package ru.agrin.tracker.start;

import ru.agrin.tracker.models.Tracker;

/**
 * Абстрактный класс
 * Created by grin on 11.01.2017.
 */
public abstract class BaseAction implements UserAction {
    String name;

    BaseAction(String name) {
        this.name = name;
    }

    public abstract int key();

    public abstract void execute(Input input, Tracker tracker) ;

    @Override
    public String info() {
        return name;
    }
}
