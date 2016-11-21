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
        String[] arr = new String[] {"bal", "val", null, "dal"};
        Duplicate duplicate = new Duplicate();
        String [] result = duplicate.deleteDuplicate(duplicate.abc);
        assertThat(result, is (arr));
    }
}
