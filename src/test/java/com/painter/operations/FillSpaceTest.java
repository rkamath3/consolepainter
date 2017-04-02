package com.painter.operations;

import org.junit.Before;

/**
 * Created by Ram on 02/04/2017.
 */
public class FillSpaceTest {
    Canvas c = null;
    String canvas;

    @Before
    public void createCanvas(){
        c= new Canvas(20,4);
        canvas= c.toString();
    }
}
