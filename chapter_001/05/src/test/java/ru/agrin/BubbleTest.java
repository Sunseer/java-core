package ru.agrin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Created by grin on 18.11.2016.
 */
public class BubbleTest {
    @Test
    public void testBubbleSort() {
        int[] array = new int[] {1, 2, 4, 5, 8};
	Bubble bubble = new Bubble();
        int[] result = bubble.bubbleSort(bubble.values);
        assertThat(result, is(array));
    }
}
