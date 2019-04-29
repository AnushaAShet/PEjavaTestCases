package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.*;

public class TomTest {


    TomTest o;

    @Before
    public void setUp() throws Exception {

        o=new TomTest();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public String check()
    {
        String res=o.check();
        assertEquals("Jerry", res);
        return res;
    }

    @Test
    public String checkRange()
    {
        String res=o.checkRange();
        assertEquals("True", res);
        return res;
    }

    @Test
    public boolean checkNull()
    {
        boolean res=o.checkNull();
        assertEquals(true, res);
        return res;
    }
}



