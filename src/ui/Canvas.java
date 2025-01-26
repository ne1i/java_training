package ui;

import java.util.ArrayList;

public class Canvas {
    private Grid2D grid;
    private ArrayList<Control> controls;

    public Canvas(Grid2D grid2D) {
        this.grid = grid2D;
        this.controls = new ArrayList<>();
    }

    public void addControl(Control control) {
        this.controls.add(control);
    }

    public void removeControl(Control control) {
        this.controls.remove(control);
    }

    public void clear() {
        grid.clear(' ');
    }

    public void draw() {
        for (var control : controls) {
            control.drawOn(grid);
        }
    }

    public void show() {
        System.out.print(grid);
    }
}
