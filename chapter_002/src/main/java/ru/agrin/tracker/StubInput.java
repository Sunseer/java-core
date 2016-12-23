package ru.agrin.tracker;

/**
 * Имитация консольного ввода пользователем.
 * Created by grin on 21.12.2016.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers[position++];
    }
}
