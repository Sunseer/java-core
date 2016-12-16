package ru.agrin.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Тестирование класса Tracker.
 * Created by grin on 16.12.2016.
 */
public class TrackerTest {
    @Test
    public void testAddBid() {
        Bid expected = new Bid("name", "desc");
        Tracker tracker = new Tracker();
        Bid result = tracker.addBid(expected);
        assertThat(result, is(expected));
    }

    @Test
    public void testFindById() {
        Tracker tracker = new Tracker();
        Bid expected = tracker.addBid(new Bid("name", "desc"));
        Bid result = tracker.findById(expected.getId());
        assertThat(result, is(expected));
    }

    @Test
    public void testListOfBids() {
        Tracker tracker = new Tracker();

    }

    @Test
    public void testRemoveById() {

    }

    @Test
    public void testEditBid() {

    }

}
