package metal;

public class nail {
    // Instance variables
    private int length;
    private int thickness;

    // Constructor
    public nail(int length, int thickness) {
        this.length = length;
        this.thickness = thickness;
    }



    // Getters
    public int getLength() {
        return length;
    }

    public int getThickness() {
        return thickness;
    }

    // Setters
    public void setLength(int length) {
        if (this.length != 0) {
            this.length = length;
        }
    }

    public void setThickness(int thickness) {
        if (this.thickness != 0) {
            this.thickness = thickness;
        }
    }
}
