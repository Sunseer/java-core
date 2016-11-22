package ru.agrin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Тест класса Duplicate
 * Created by grin on 21.11.2016.
 */
public class SquareArrayTest {
    /**
     * Тест метода turnArray
     */
    @Test
    public void testTurnArray(){
        int[][] incomingValues = new int[][]{{1, 2, 3},
                                            {10, 20, 30},
                                            {100, 200, 300}
        };
        int[][] expectedValues = new int[][]{{100, 10, 1},
                                            {200, 20, 2},
                                            {300, 30, 3}
        };
        SquareArray squareArray = new SquareArray();
        int[][] result = squareArray.turnArray(incomingValues);
        assertThat(result, is(expectedValues));
    }
}
