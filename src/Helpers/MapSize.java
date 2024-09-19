package Helpers;

public enum MapSize {

    SMALL(50, 20),
    MEDIUM(100, 20),
    LARGE(200, 20);

    private final int height;
    private final int width;

    MapSize(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
