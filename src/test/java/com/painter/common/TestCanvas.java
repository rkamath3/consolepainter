package com.painter.common;

import com.painter.com.painter.common.Common;
import com.painter.operations.Canvas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ram on 01/04/2017.
 */
public class TestCanvas {
    Canvas c= null;
    @Before
    public void createCanvas(){
        c= new Canvas(10,10);
        Assert.assertNotNull(c.getCanvas());
    }
    @Test
    public void testCanvasDimension(){
        Assert.assertTrue(Common.CANVAS_HEIGHT==10);
        Assert.assertTrue(Common.CANVAS_WIDTH==10);
        c = new Canvas(100,100);
        Assert.assertTrue(Common.CANVAS_HEIGHT==100);
        Assert.assertTrue(Common.CANVAS_WIDTH==100);
    }
    @Test
    public void testCornerCaseDimension(){
        c = new Canvas(0,0);
        Assert.assertNull(c.getCanvas());
    }

}
