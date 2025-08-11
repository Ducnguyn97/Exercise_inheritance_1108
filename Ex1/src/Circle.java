package Ex1.src;

public class Circle {
    private double radius;
    private String color;

    public Circle(){};

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Radius: " + this.radius + "\nColor: " + this.color;
    }
}
