package ui;

public class Rectangle extends BaseControl {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, char drawnChar) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.setDrawnChar(drawnChar);
    }

    @Override
    public void drawOn(Grid2D grid) {
        for (int dx = 0; dx < this.width; ++dx) {
            for (int dy = 0; dy < this.height; ++dy) {
                grid.write(this.getDrawnChar(), getX() + dx, getY() + dy);
            }
        }
    }

}
