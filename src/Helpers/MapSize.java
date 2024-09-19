package Helpers;

public enum MapSize {

    SMALL(50, 50),
    MEDIUM(100, 100),
    LARGE(200, 200);



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
