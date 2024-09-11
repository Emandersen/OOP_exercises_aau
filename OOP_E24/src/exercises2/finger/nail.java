package finger;

public class nail {
    // Instance variables
    private int width;
    private int height;
    private String color;

    // Constructors
    public nail(int width, int height) {
        this.width = width;
        this.height = height;
        this.color = "pink";
    }

    public nail(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }


    // getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    // setters

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }
}
