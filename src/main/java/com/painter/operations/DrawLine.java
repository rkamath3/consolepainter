package com.painter.operations;

import com.painter.com.painter.common.Common;

/**
 * Created by Ram on 01/04/2017.
 */
public class DrawLine {
    int xLow = 0;
    int xMax = 0;
    int yLow = 0;
    int yMax = 0;

    /**
     * To draw a line in a given canvas
     *
     * @param canvas Canvas object in which line needs to be drawn
     * @param x1     x coordinate of the origin
     * @param y1     y coordinate of the origin
     * @param x2     x coordinate of the endpoint
     * @param y2     y coordinate of the endpoint
     * @param color  Color of the line
     */
    public void draw(Canvas canvas, int x1, int y1, int x2, int y2, char color) {
        if (isInLimit(x1, y1, x2, y2)) {
            for (int x = xLow; x <= xMax; x++)
                for (int y = yLow; y <= yMax; y++) {
                    canvas.setColor(x - 1, y - 1, color);
                    System.out.print(canvas.toString());
                }
        }
    }

    /**
     * Check of the given points are in the limit of the canvas. If any of the point lies beyond canvas,
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return <i>true</i> if points are inside canvas and one of the x or y cordinate value is same, <i>false</i> otherwise.
     */
    private boolean isInLimit(int x1, int y1, int x2, int y2) {
        if (x1 < 0 || x2 < 0 || x1 > Common.CANVAS_WIDTH || x2 > Common.CANVAS_WIDTH || y1 > Common.CANVAS_HEIGHT || y2 > Common.CANVAS_HEIGHT || y1 < 0 || y2 < 0 || !(x1 == x2 || y1 == y2)) {
            return false;
        }
        if (x1 > x2) {
            xLow = x2;
            xMax = x1;
        } else {
            xLow = x1;
            xMax = x2;
        }
        if (y1 > y2) {
            yLow = y2;
            yMax = y1;
        } else {
            yLow = y1;
            yMax = y2;
        }
        return true;
    }

}
