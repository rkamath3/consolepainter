package com.painter.operations;

/**
 * Created by Ram on 01/04/2017.
 */
public class DrawRectangle {
    /**
     * This method makes use of {@link DrawLine#draw(Canvas, int, int, int, int, char)} method to draw 4 lines
     *
     * @param canvas Canvas object
     * @param x1     x coordinate of the origin
     * @param y1     y coordinate of the origin
     * @param x2     x coordinate of the endpoint
     * @param y2     y coordinate of the endpoint
     * @param color  Color of the line
     */
    void drawRectangle(Canvas canvas, int x1, int y1, int x2, int y2, char color) {
        new DrawLine().draw(canvas, x1, y1, x2, y1, color);
        new DrawLine().draw(canvas, x1, y2, x2, y2, color);
        new DrawLine().draw(canvas, x1, y1, x1, y2, color);
        new DrawLine().draw(canvas, x2, y1, x2, y2, color);
    }
}
