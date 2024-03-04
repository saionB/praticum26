public class ColorXYCoord extends XYCoord {
    private String color;

    public ColorXYCoord(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return super.toString() + " Color: " + color;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ColorXYCoord other = (ColorXYCoord) obj;
        return color.equals(other.color);
    }
}
