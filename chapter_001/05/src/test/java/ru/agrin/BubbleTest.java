package ru.agrin;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by grin on 18.11.2016.
 */
public class BubbleTest {
    @Test
    public void testBubbleSort() {
        Bubble bubble = new Bubble();
        int[] result = bubble.bubbleSort(bubble.values);
        for (int i = 0; i < result.length - 1 ; i++) {
            assertTrue(result[i] <= result[i + 1]);
        }
    }
}
