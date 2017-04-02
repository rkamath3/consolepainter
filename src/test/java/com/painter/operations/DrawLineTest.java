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
    public void shouldDrawVerticleLine(){
        //new DrawLine().draw(c,1,2,6,2,'x');
       // new DrawLine().draw(c,6,3,6,4,'y');

        new DrawLine().draw(c,16,1,20,1,'x');
        new DrawLine().draw(c,16,3,20,3,'x');
        new DrawLine().draw(c,16,1,16,3,'x');
        new DrawLine().draw(c,20,1,20,3,'x');

    }
}
