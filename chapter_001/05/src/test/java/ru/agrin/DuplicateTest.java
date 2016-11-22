package ru.agrin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by grin on 21.11.2016.
 */
public class DuplicateTest {
    @Test
    public void testDeleteDuplicate() {
        String[] incomingArray = new String[] {"bal", "val", "val", "dal"};
        String[] expectedArray = new String[] {"bal", "val", "dal"};
        Duplicate duplicate = new Duplicate();
        String[] result = duplicate.deleteDuplicate(incomingArray);
        assertThat(result, is (expectedArray));
    }

    @Test
    public void testDeleteDuplicateStreamApi() {
        String[] incomingArray = new String[] {"bal", "val", "val", "dal"};
        String[] expectedArray = new String[] {"bal", "val", "dal"};
        Duplicate duplicate1 = new Duplicate();
        String[] result = duplicate1.deleteDuplicateStreamApi(incomingArray);
        assertThat(result, is (expectedArray));
    }

}
