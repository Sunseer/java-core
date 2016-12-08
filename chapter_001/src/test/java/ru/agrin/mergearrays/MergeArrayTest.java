package ru.agrin.mergearrays;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Тестирование класса MergeArray
 * Created by grin on 07.12.2016.
 */
public class MergeArrayTest {
    /**
     * Тестирование метода merge(int[] a, int[] b)
     */
    @Test
    public void mergeTest(){
        int[] expected = new int[] {1, 2, 5, 7, 9, 10, 15};
        int[] a = new int[] {1, 7, 9};
        int[] b = new int[] {2, 5, 10, 15};
        MergeArray mergeArray = new MergeArray();
        int[] result = mergeArray.merge(a, b);
        assertThat(result, is(expected));
    }
}
