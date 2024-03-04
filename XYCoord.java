public class XYCoord {
  private int x;
  private int y;

  // Constructor (initializes to a specific x,y value)
  public XYCoord(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Returns just the x value
  public int getX() {
    return x;
  }

  // Returns just the y value
  public int getY() {
    return y;
  }

  // Returns e.g., "(10,20)"
  public String toString() {
    return "(" + x + "," + y + ")";
  }

  // Equals method (returns true if x and y values
  // of two coordinates are equal
  public boolean equals(XYCoord rCoord) {
      return x == rCoord.getX() && y == rCoord.getY();
  }

  // Returns the distance from this coordinate to
  // coordinate rCoord
  public double distance(XYCoord rCoord) {
    int xTerm = (int) Math.pow(rCoord.getX() - x , 2); 
    int yTerm = (int) Math.pow(rCoord.getY() - y, 2); 

    double distance = Math.sqrt(xTerm + yTerm); 
    return (float) distance; 

  }

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
}