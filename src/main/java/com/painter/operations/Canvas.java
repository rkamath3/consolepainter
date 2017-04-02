package com.painter.operations;

import com.painter.com.painter.common.Common;

import java.util.Arrays;


/**
 * Created by Ram on 01/04/2017.
 */
public class Canvas {
    private char[][] canvas= null;

    public Canvas(int width, int height) {
        if(width!=0 && height!=0)
        this.canvas = new char[height][width];
        Common.CANVAS_HEIGHT = height;
        Common.CANVAS_WIDTH = width;
        initCanvas();
    }

    /**
     * Method which initializes every cell of the canvas to empty character
     */
    private void initCanvas() {
        for (int row = 0; row < Common.CANVAS_HEIGHT; row++)
            for (int col = 0; col < Common.CANVAS_WIDTH; col++)
                canvas[row][col] = ' ';
    }

    /**
     *
     * @return A canvas object
     */
    public Object getCanvas() {
        return canvas;
    }

    /**
     *  Set a color to given cell of the canvas
     * @param x X coordinate
     * @param y Y coordinate
     * @param color Color to be filled
     */
    public void setColor(int x, int y, char color) {
        canvas[y][x] = color;
    }

    /**
     * Method which returns the string representation of the canvas
     * @return
     */
    @Override
    public String toString(){

        StringBuilder builder = new StringBuilder();
        char[] bytes = new char[Common.CANVAS_WIDTH+2];
        Arrays.fill(bytes, '-');
        String str = new String(bytes);
        //add header
        builder.append(str+"\n");
        for(int i = 0; i < Common.CANVAS_HEIGHT; i++)
        {
            builder.append("|");
            for(int j = 0; j < Common.CANVAS_WIDTH; j++)
            {
                builder.append(canvas[i][j]);
            }
            builder.append("|\n");
        }
        // add footer
        builder.append(str+"\n");
        return builder.toString();
    }
}
