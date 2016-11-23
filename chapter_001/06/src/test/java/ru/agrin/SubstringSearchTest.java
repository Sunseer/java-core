package ru.agrin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Тестирование класса SubstringSearch
 * Created by grin on 23.11.2016.
 */
public class SubstringSearchTest {
    /**
     * Тестирование метода contains(String origin, String sub)
     */
    @Test
    public void containsTest(){
        SubstringSearch substringSearch = new SubstringSearch();
        boolean expected = true;
        boolean result = substringSearch.contains("123456", "45");
        assertThat(expected, is(result));

    }
}
