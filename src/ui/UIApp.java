package ui;

public class UIApp {
    public static void main(String[] args) {
        var grid = new Grid2D(50, 30, '_');
        var canvas = new Canvas(grid);
        var rect = new Rectangle(15, 15, 10, 10, 'T');
        var rect1 = new Rectangle(10, 10, 20, 8, 'B');

        canvas.addControl(rect1);
        canvas.addControl(rect);
        canvas.draw();
        canvas.show();
    }
}
