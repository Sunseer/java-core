package ru.agrin.tracker;

/**
 * Проверка корректности вввода пользователя
 * Created by grin on 06.01.2017.
 */
public class ValidateInput extends ConsoleInput {
    @Override
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Такого № меню не существует.");
            } catch (NumberFormatException nfr) {
                System.out.println("Пожалуйста введите корректные данные");
            }
        } while (invalid);
        return  value;
    }
}

