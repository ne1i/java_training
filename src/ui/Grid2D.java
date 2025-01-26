package ui;

public class Grid2D {
    private char[][] grid;
    private int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Grid2D(int width, int height, char initialValue) {
        this.grid = new char[height][width];
        this.width = width;
        this.height = height;
        clear(initialValue);
    }

    public void clear(char cellValue) {
        for (int y = 0; y < grid.length; ++y) {
            for (int x = 0; x < grid[0].length; ++x) {
                write(cellValue, x, y);
            }
        }
    }

    public void write(char value, int x, int y) {
        if (y < this.grid.length && x < this.grid[y].length && x >= 0 && y >= 0) {
            this.grid[y][x] = value;
        }
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("X".repeat(width + 2));
        sb.append("\n");
        for (var line : grid) {
            sb.append("X");
            for (var cell : line) {
                sb.append(cell);
            }
            sb.append("X");
            sb.append("\n");
        }
        sb.append("X".repeat(width + 2));
        sb.append("\n");

        return sb.toString();
    }
}
