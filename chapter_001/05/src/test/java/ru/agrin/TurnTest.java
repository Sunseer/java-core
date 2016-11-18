package ru.agrin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by grin on 18.11.2016.
 */
public class TurnTest {
    @Test
    public void testBack() {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] arrayResult = array.clone();
        Turn turn = new Turn();
        arrayResult = turn.back(arrayResult);

        for (int i = 0; i < array.length; i++) {
            assertThat(arrayResult[i], is (array[array.length - 1 - i]));
        }
    }
}
