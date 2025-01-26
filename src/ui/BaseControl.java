package ui;

public abstract class BaseControl implements Control {
    private int x, y;
    private char drawnChar;

    public char getDrawnChar() {
        return drawnChar;
    }

    public void setDrawnChar(char drawnChar) {
        this.drawnChar = drawnChar;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public final static char DEFAULT_CHAR = '0';

    public BaseControl(int x, int y) {
        this.x = x;
        this.y = y;
        this.drawnChar = DEFAULT_CHAR;
    }

}
