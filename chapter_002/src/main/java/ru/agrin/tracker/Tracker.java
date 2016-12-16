package ru.agrin.tracker;

import java.util.Random;

/**
 * Управляющий класс заявками.
 * Created by grin on 15.12.2016.
 */
public class Tracker {
    private final Bid[] bids = new Bid[10];
    private int countBids = 0;
    private static final Random RN = new Random();

    /**
     * Генерирует случайное неповторяющиеся число.
     * @return String.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Добавление новой заявки.
     * @param bid - новая заявка.
     * @return заявку.
     */
    public Bid addBid(Bid bid) {
        bid.setCreate(System.currentTimeMillis());
        bid.setId(generateId());
        this.bids[countBids++] = bid;
        return bid;
    }

    /**
     * Поиск заявки по id.
     * @param id - номер заявки.
     * @return заявку.
     */
    public Bid findById(String id) {
        Bid result = null;
            for(Bid bid : this.bids) {
                if (bid != null && bid.getId().equals(id)) {
                    result = bid;
                    break;
                }
            }
        return result;
    }

    /**
     * Список всех заявок.
     * @return список всех заявок.
     */
    public Bid[] listOfBids() {
        Bid[] result = new Bid[this.countBids];
        for (int i = 0; i < countBids; i++) {
            result[i] = this.bids[i];
        }
        return result;
    }

    /**
     * Удаление заявки.
     * @param id - номер заявки, которую удаляем.
     */
    public void removeById(String id) {
        for (int i = 0; i < countBids; i++) {
            if (bids[i] != null && bids[i].getId().equals(id)) {
                bids[i] = null;
            }
        }
    }

    /**
     * Редактирование заявки.
     * @param id - номер заявки.
     * @param bid - отредактированная заявка.
     */
    public void editBid(String id, Bid bid) {
        for (int i = 0; i < countBids; i++) {
            if (bids[i] != null && bids[i].getId().equals(id)) {
                bids[i] = bid;
            }
        }
    }

    /**
     * Фильтрует по имени список заявок.
     * @param name - название заявки.
     * @return список всех отфильтрованных заявок.
     */
    public Bid[] filteredListOfBidsByName(String name) {
        int countOfBidsFound = 0;
        Bid[] result = new Bid[countBids];
        for (int i = 0; i < countBids; i++) {
            if (bids[i] != null && bids[i].getName().equals(name)) {
                result[countOfBidsFound++] = result[i];
            }
        }
        return result;
    }

    /**
     * Фильтрует по промежутку времени список заявок.
     * @param startDate - начальная дата.
     * @param endDate - конечная дата.
     * @return отфильтрованный по промежутку времени список заявок.
     */
    public Bid[] filteredListOfBidsByDate(long startDate, long endDate) {
        int countOfBidsFound = 0;
        Bid[] result = new Bid[countBids];
        for (int i = 0; i < countBids; i++) {
            if (bids[i] != null && bids[i].getCreate() >= startDate && bids[i].getCreate() <= endDate) {
                result[countOfBidsFound++] = result[i];
            }
        }
        return result;
    }

    /**
     * Добавление комментария к заявке
     * @param id - номер заявки.
     * @param comment - комментарий.
     */
    public void addCommentToBid(String id, String comment) {
        Bid bid = this.findById(id);
        bid.addComment(comment);
    }
}
