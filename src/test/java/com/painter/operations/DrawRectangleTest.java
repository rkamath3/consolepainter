package com.painter.operations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ram on 01/04/2017.
 */
public class DrawRectangleTest {
    Canvas c = null;
    String canvas;

    @Before
    public void createCanvas(){
        c= new Canvas(20,4);
        canvas= c.toString();
    }
    @Test
    public void shouldDrawRectangle(){
        new DrawRectangle().drawRectangle(c,6,1,20,3,'@');
        Assert.assertNotEquals(canvas,c.toString());
    }

    @Test
    public void shouldNotDrawRectangle(){

        // Overflow x
        new DrawRectangle().drawRectangle(c,26,1,16,1,'@');
        Assert.assertEquals(canvas,c.toString());

        //Underflow x
        new DrawRectangle().drawRectangle(c,-1,1,16,1,'@');
        Assert.assertEquals(canvas,c.toString());

        // Overflow y
        new DrawRectangle().drawRectangle(c,6,1,16,10,'@');
        Assert.assertEquals(canvas,c.toString());

        //Underflow y
        new DrawRectangle().drawRectangle(c,1,-11,16,1,'@');
        Assert.assertEquals(canvas,c.toString());

    }

}
