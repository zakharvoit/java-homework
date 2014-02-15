package com.github.zakharvoit;

import junit.framework.Assert;
import org.junit.Test;

public class SumTest extends Assert {
    @Test
    public void test1() throws Exception {
        assertEquals(6, Sum.solve(new String[]{"1", "2", "3"}));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(0, Sum.solve(new String[]{"1", "2", "-3"}));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(6, Sum.solve(new String[]{"1 2 3"}));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(6, Sum.solve(new String[]{"1 2", " 3"}));
    }

    @Test
    public void testEmpty() throws Exception {
        assertEquals(0, Sum.solve(new String[]{""}));
    }

    @Test
    public void testOtherWhitespaceSymbols() throws Exception {
        assertEquals(21, Sum.solve(new String[]{"  1   2\t3\n4\r5\t\t6\r"}));
    }
}
