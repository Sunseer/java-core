package ru.agrin.tracker.start;

import ru.agrin.tracker.models.Bid;
import ru.agrin.tracker.models.Tracker;

/**
 * Меню программы.
 * Created by grin on 04.01.2017.
 */
public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[8];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public UserAction[] getActions() {
        return actions;
    }

    public void fillActions() {
        this.actions[0] = new AddBid();
        this.actions[1] = new FindById();
        this.actions[2] = new RemoveById();
        this.actions[3] = new EditBid();
        this.actions[4] = new AddCommentToBid();
        this.actions[5] = new ListOfBids();
        this.actions[6] = new FilteredListOfBidsByName();
        this.actions[7] = new FilteredListOfBidsByDate();
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void showMenu() {
        for (UserAction action : this.actions) {
            if (action != null)
                System.out.println(action.info());
        }
    }

    private class AddBid implements UserAction {
        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.addBid(new Bid(input.ask("Введите название заявки:"),
                    input.ask("Введите описание заявки:")));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Добавление заявки.");
        }
    }

    private class FindById implements UserAction {
        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            Bid result = tracker.findById(input.ask("Введите номер заявки:"));
            if (result != null) {
                System.out.println(result);
            }
            else {
                System.out.println("Заявки с таким номером не существует.");
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Поиск заявки по номеру.");
        }
    }

    private class RemoveById implements UserAction {
        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.removeById(input.ask("Введите номер заявки:"));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Удаление заявки.");
        }
    }

    private class EditBid implements UserAction {
        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.editBid(input.ask("Введите номер заявки:"),
                    new Bid(input.ask("Отредактируйте название:"), input.ask("Отредактируйте описание:")));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Редактирование заявки.");
        }
    }

    private class AddCommentToBid implements UserAction {
        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.addCommentToBid(input.ask("Введите номер заявки:"), input.ask("Введите комментарий:"));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Добавление комментария к заявке.");
        }
    }

    private class ListOfBids implements UserAction {
        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            Bid[] result = tracker.listOfBids();
            for (Bid bid : result) {
                if (bid != null)
                    System.out.println(bid);
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Получение списка всех заявок.");
        }
    }

    private class FilteredListOfBidsByName implements UserAction {
        @Override
        public int key() {
            return 6;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Bid bid : tracker.filteredListOfBidsByName(input.ask("Введите имя заявки"))){
                if (bid != null)
                    System.out.println(bid);
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Получение списка заявок по определенному имени.");
        }
    }

    private class FilteredListOfBidsByDate implements UserAction {
        @Override
        public int key() {
            return 7;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("Укажите дату в формате dd MM yyyy HH:mm:ss");
            tracker.filteredListOfBidsByDate(Long.valueOf(input.ask("Дата начала")),
                    Long.valueOf(input.ask("Дата окончания")));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Получение списка заявок по промежутку времени.");
        }
    }
}

