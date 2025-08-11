package Ex3.src;

public class Point {
    private float x;
    private float y;

    public Point() {}

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{this.x,this.y};
    }
    public String toString(){
        return "Point: " + getX() + ", " + getY();
    }
}
