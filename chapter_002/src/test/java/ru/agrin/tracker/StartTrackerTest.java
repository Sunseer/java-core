package ru.agrin.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Тестирование класса StartTracker
 * Created by grin on 27.12.2016.
 */
public class StartTrackerTest {

    /**
     * Тестирование добавления новой заявки.
     */
    @Test
    public void initAddBidTest() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"0", "name", "desc", "да"});
        new StartTracker(input, tracker).init();
        assertThat(tracker.listOfBids()[0].getName(), is("name"));
        assertThat(tracker.listOfBids()[0].getDescription(), is("desc"));
    }

    /**
     * Тестирование поиска заявки по Id.
     */
    @Test
    public void initFindByIdTest() {
        Tracker tracker = new Tracker();
        Bid bid01 = tracker.addBid(new Bid("name01", "desc01"));
        Bid bid02 = tracker.addBid(new Bid("name02", "desc02"));
        Input input = new StubInput(new String[] {"1", bid02.getId(), "да"});
        new StartTracker(input, tracker).init();
        String result = tracker.findById(bid02.getId()).getName();
        assertThat(result, is("name02"));
    }

    /**
     * Тестирование удаления заявки по Id.
     */
    @Test
    public void initRemoveByIdTest() {
        Tracker tracker = new Tracker();
        Bid bid = tracker.addBid(new Bid("name", "desc"));
        Input input = new StubInput(new String[] {"2", bid.getId(), "да"});
        new StartTracker(input, tracker).init();
        assertThat(tracker.listOfBids(), is(new Bid[]{null}));
    }

    /**
     * Тестирование редактирования заявки.
     */
    @Test
    public void initEditBidTest() {
        Tracker tracker = new Tracker();
        Bid bid = tracker.addBid(new Bid("name", "desc"));
        Input input = new StubInput(new String[] {"3", bid.getId(), "editName", "editDesc", "да"});
        new StartTracker(input, tracker).init();
        assertThat(tracker.listOfBids()[0].getName(), is("editName"));
    }

    /**
     * Тестирование добавления комментария к заявке.
     */
    @Test
    public void initAddCommentToBidTest() {
        Tracker tracker = new Tracker();
        Bid bid = tracker.addBid(new Bid("name", "desc"));
        Input input = new StubInput(new String[] {"4", bid.getId(), "comment", "да"});
        new StartTracker(input, tracker).init();
        assertThat(tracker.listOfBids()[0].getComments()[0], is("comment"));
    }

    /**
     * Тестирование вывода списка всех заявок
     */
    @Test
    public void initListOfBidsTest() {
        Tracker tracker = new Tracker();
        Bid bid01 = tracker.addBid(new Bid("name01", "desc01"));
        Bid bid02 = tracker.addBid(new Bid("name02", "desc02"));
        Bid[] expected = new Bid[]{bid01, bid02};
        Input input = new StubInput(new String[] {"5", "да"});
        new StartTracker(input, tracker).init();
        assertThat(tracker.listOfBids(), is(expected));
    }

    /**
     * Тестирование вывода списка заявок по заданому имени.
     */
    @Test
    public void initFilteredListOfBidsByNameTest() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"0", "name", "desc", "нет", "6", "name", "да"});
        new StartTracker(input, tracker).init();
        String result = tracker.filteredListOfBidsByName("name")[0].getName();
        assertThat(result, is("name"));
    }
}
