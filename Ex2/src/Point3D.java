package Ex2.src;

import java.awt.*;

public class Point3D extends Point2D {
    private float z ;

    public Point3D(){};

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public float getZ() {
        return this.z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z =z;
    }
    public float[] getXYZ() {
        float[] newArr =  new float[3];
        newArr[0] = super.getX();
        newArr[1] = super.getY();
        newArr[2] = this.z;
        return newArr;
    }
    public String toString(){
        return "Point 3D has coordinates "+ super.getX() + ", " + super.getY() + ", "+this.z;
    }
}
