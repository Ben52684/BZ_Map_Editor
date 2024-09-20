package Helpers;

public enum MapSize {

    SMALL(51, 21),
    MEDIUM(101, 20),
    LARGE(201, 20);

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
