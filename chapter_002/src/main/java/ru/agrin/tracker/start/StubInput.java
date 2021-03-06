package ru.agrin.tracker.start;

/**
 * Имитация консольного ввода пользователем.
 * Created by grin on 21.12.2016.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 1;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers[position++];
    }

    @Override
    public int ask(String question, int[] range) {
        //throw new UnsupportedOperationException("Операция не поддерживается");
        return Integer.valueOf(answers[0]);
    }
}
