package com.curious.tiger.firebase_support;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
        String path = "/room/$messageId/content";
        String[] items = path.split("/");

        for(String item : items){
            System.out.println(item);
        }
    }
}