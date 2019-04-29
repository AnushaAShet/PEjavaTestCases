package com.stackroute;
import java.lang.String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {


    ReverseTest revobj;
    ReverseTest revobj2;


    @Before
    public void setUp() throws Exception {
        revobj=new ReverseTest();
        revobj2=new ReverseTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public String revmethod()
    {
        //act
        String opstr=revobj.revmethod();
        //assert
        assertEquals("olleH",opstr);
        return opstr;
    }

    @Test
    public boolean checkNull()
    {

        //act
        boolean b=revobj.checkNull();
        //assert
        assertEquals(false,b);
        return b;
    }

    @Test
    public boolean checkisInteger()
    {
        //act
        boolean bint=revobj2.checkisInteger();
        //assert
        assertEquals(true,bint);
        return bint;
    }




}