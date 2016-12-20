package ru.agrin.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Тестирование класса Tracker.
 * Created by grin on 16.12.2016.
 */
public class TrackerTest {
    /**
     * Тестирование метода addBid(Bid bid).
     */
    @Test
    public void testAddBid() {
        Bid expected = new Bid("name", "desc");
        Tracker tracker = new Tracker();
        Bid result = tracker.addBid(expected);
        assertThat(result, is(expected));
    }

    /**
     * Тестирование метода findById(String id).
     */
    @Test
    public void testFindById() {
        Tracker tracker = new Tracker();
        Bid expected = tracker.addBid(new Bid("name", "desc"));
        Bid result = tracker.findById(expected.getId());
        assertThat(result, is(expected));
    }

    /**
     * Тестирование метода listOfBids().
     */
    @Test
    public void testListOfBids() {
        Tracker tracker = new Tracker();
        Bid testBid = new Bid("name", "desc");
        Bid[] expected = new Bid[]{testBid};
        tracker.addBid(testBid);
        assertThat(tracker.listOfBids(), is(expected));

    }

    /**
     * Тестирование метода removeById(String id).
     */
    @Test
    public void testRemoveById() {
        Tracker tracker = new Tracker();
        Bid[] expected = new Bid[] {null};
        Bid testBid = tracker.addBid(new Bid("name", "desc"));
        tracker.removeById(testBid.getId());
        assertThat(tracker.listOfBids(), is(expected));
    }

    /**
     * Тестирование метода editBid(String id, Bid bid).
     */
    @Test
    public void testEditBid() {
        Tracker tracker = new Tracker();
        Bid testBid = new Bid("name", "desc");
        tracker.addBid(testBid);
        Bid expected = new Bid("newName", "newDesc");
        assertThat(tracker.editBid(testBid.getId(), expected), is(expected));


    }

    /**
     * Тестирование метода filteredListOfBidsByName(String name).
     */
    @Test
    public void testFilteredListOfBidsByName() {
        Tracker tracker = new Tracker();
        Bid testBid01 = new Bid("name_01", "desc_01");
        Bid testBid02 = new Bid("name_01", "desc_02");
        Bid testBid03 = new Bid("name_03", "desc_03");
        Bid[] expected = new Bid[] {testBid01, testBid02, null};
        tracker.addBid(testBid01);
        tracker.addBid(testBid02);
        tracker.addBid(testBid03);
        assertThat(tracker.filteredListOfBidsByName("name_01"), is(expected));
    }
}
