package com.painter.operations;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ram on 01/04/2017.
 */
public class DrawLineTest {
    Canvas c = null;

    @Before
    public void createCanvas(){
        c= new Canvas(20,4);
    }

    @Test
    public void shouldDrawVerticalLine(){
        new DrawLine().draw(c,16,1,16,4,'x');
        System.out.println(c.toString());
        new DrawLine().draw(c,1,1,1,4,'y');
        System.out.println(c.toString());
    }
    @Test
    public void shouldNotDrawVerticalLine(){
        new DrawLine().draw(c,16,1,17,4,'x');
        System.out.println(c.toString());
    }

    @Test
    public void shouldDrawHorizontalLine(){
        new DrawLine().draw(c,11,1,20,1,'x');
        System.out.println(c.toString());
        new DrawLine().draw(c,1,4,19,4,'y');
        System.out.println(c.toString());
    }
    @Test
    public void shouldNotDrawHorizontalLine(){
        new DrawLine().draw(c,16,1,17,4,'x');
        System.out.println(c.toString());
    }
}
