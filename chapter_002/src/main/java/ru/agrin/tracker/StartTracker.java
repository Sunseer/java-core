package ru.agrin.tracker;

/**
 * Запуск трекера.
 * Created by grin on 21.12.2016.
 */
public class StartTracker {
    public static void main(String[] args) throws Exception {
        Tracker tracker = new Tracker();
        tracker.addBid(new Bid("name", "desc"));
        System.out.println(tracker.listOfBids().toString());
    }
}
