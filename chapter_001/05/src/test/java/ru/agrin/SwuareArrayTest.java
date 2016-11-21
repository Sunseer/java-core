package ru.agrin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Created by grin on 21.11.2016.
 */
public class SwuareArrayTest {
    @Test
    public void testTurnArray(){
        int[][] array = new int[][]{{100, 10, 1},
                                    {200, 20, 2},
                                    {300, 30, 3}
        };
        SquareArray squareArray = new SquareArray();
        int[][] result = squareArray.turnArray(squareArray.values);
        assertThat(result, is(array));
    }
}
