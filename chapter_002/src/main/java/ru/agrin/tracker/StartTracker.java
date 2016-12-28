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

    private final String[] QUESTIONS = new String[] {
            "1. Добавление заявки.",
            "2. Поиск заявки по номеру.",
            "3. Удаление заявки.",
            "4. Редактирование заявки.",
            "5. Добавление комментария к заявке.",
            "6. Получение списка всех заявок.",
            "7. Получение списка заявок по определенному имени.",
            "8. Получение списка заявок по промежутку времени.",
            "Для выхода из программы введите: выйти"
    };

    /**
     * Вывод на экран списка меню.
     */
    public void showMenu() {
        for (String item : QUESTIONS) {
            System.out.println(item);
        }
    }

    /**
     * Обработка консольного ввода пользователя.
     */
    public void init() {
        String name = input.ask("Введите номер меню:");

        if (name.equals("1")) {
            tracker.addBid(new Bid(input.ask("Введите название заявки: "), input.ask("Введите описание заявки:")));
            System.out.println("Заявка добавлена.");
            showMenu();
        }
        else if (name.equals("2")) {
            System.out.println(tracker.findById(input.ask("Введите номер заявки:")));
            showMenu();
        }
        else if (name.equals("3")) {
            tracker.removeById(input.ask("Введите номер заявки:"));
            showMenu();
        }
        else if (name.equals("4")) {
            tracker.editBid(input.ask("Введите номер заявки:"), new Bid(input.ask("Отредактируйте название:"), input.ask("Отредактируйте описание:")));
            showMenu();
        }
        else if (name.equals("5")) {
            tracker.addCommentToBid(input.ask("Введите номер заявки:"), input.ask("Введите комментарий:"));
            showMenu();
        }
        else if (name.equals("6")) {
            Bid[] result = tracker.listOfBids();
            for (Bid bid : result) {
                System.out.println(bid);
            }
            showMenu();
        }
        else if (name.equals("7")) {
            for (Bid bid : tracker.filteredListOfBidsByName(input.ask("Введите имя заявки"))){
                System.out.println(bid);
            }
            showMenu();
        }
        else if (name.equals("8")) {
            System.out.println("Укажите дату в формате dd MM yyyy HH:mm:ss");
            tracker.filteredListOfBidsByDate(Long.valueOf(input.ask("Дата начала")), Long.valueOf(input.ask("Дата окончания")));
            showMenu();
        }
        else if (name.equals("выйти")) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {

        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        StartTracker startTracker = new StartTracker(input, tracker);
        startTracker.showMenu();
        while(true) {
            startTracker.init();
            System.out.println();
        }
    }
}
