package com.painter.operations;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ram on 01/04/2017.
 */
public class DrawRectangleTest {
    Canvas c = null;

    @Before
    public void createCanvas(){
        c= new Canvas(20,4);
    }
    @Test
    public void shouldDrawRectangle(){
        new DrawRectangle().drawRectangle(c,16,1,20,3,'@');
    }

}
