package com.painter.operations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ram on 01/04/2017.
 */
public class DrawLineTest {
    Canvas c = null;
    String canvas ;

    @Before
    public void createCanvas(){
        c= new Canvas(20,4);
        canvas= c.toString();
    }

    @Test
    public void shouldDrawVerticalLine(){
        new DrawLine().draw(c,16,1,16,4,'x');
        Assert.assertNotEquals(canvas,c.toString());
        new DrawLine().draw(c,1,1,1,4,'y');
        Assert.assertNotEquals(canvas,c.toString());
    }
    @Test
    public void shouldNotDrawVerticalLine(){
        new DrawLine().draw(c,16,1,17,4,'x');
        Assert.assertEquals(canvas,c.toString());
    }

    @Test
    public void shouldDrawHorizontalLine(){
        new DrawLine().draw(c,11,1,20,1,'x');
        Assert.assertNotEquals(canvas,c.toString());

        new DrawLine().draw(c,1,4,19,4,'y');
        Assert.assertNotEquals(canvas,c.toString());
    }
    @Test
    public void shouldNotDrawHorizontalLine(){
        new DrawLine().draw(c,16,1,17,4,'x');
        Assert.assertEquals(canvas,c.toString());
    }
    @Test
    public void shouldNotDrawLine(){

        // Under flow X
        new DrawLine().draw(c,-1,1,17,4,'x');
        Assert.assertEquals(canvas,c.toString());

        //underflow y
        new DrawLine().draw(c,1,-11,17,4,'x');
        Assert.assertEquals(canvas,c.toString());

        // overflow x
        new DrawLine().draw(c,1,1,111,4,'x');
        Assert.assertEquals(canvas,c.toString());

        // overflow y
        new DrawLine().draw(c,1,1,1,5,'x');
        Assert.assertEquals(canvas,c.toString());

    }
}
