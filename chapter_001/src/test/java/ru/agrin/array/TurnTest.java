package ru.agrin.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by grin on 18.11.2016.
 */
public class TurnTest {
    @Test
    public void testBack() {
        int[] array = new int[] {5, 4, 3, 2, 1};
        Turn turn = new Turn();
        int[] result = turn.back(turn.array);
        assertThat(result, is (array));
    }
}
