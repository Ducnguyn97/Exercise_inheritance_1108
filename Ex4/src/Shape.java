package Ex4.src;

public class Shape {
    private String color;
    private boolean fill = false;

    public Shape(){};

    public Shape ( String color, boolean fill){
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
    public String toString() {
        return " A shape with color: " + getColor() + ", and " + (isFill()? "filled" : "not filled");
    }
}
