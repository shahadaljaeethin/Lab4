import java.text.DecimalFormat;

public class Main {
public  static void main(String[] args){
try {
    //create 4 of circle
    Circle[] c = new Circle[4];
    c[0] = new Circle(3);
    c[1] = new Circle(10.12);
    c[2] = new Circle(5.3);
    c[3] = new Circle();
//===============================
    //create 4 of rectangle
    Rectangle[] r = new Rectangle[4];
    r[0] = new Rectangle(20.31,10.32);
    r[1] = new Rectangle(10,10);
    r[2] = new Rectangle(5.2,3.3);
    r[3] = new Rectangle();
//===============================
    //create 4 of triangles
    Triangle[] t = new Triangle[4];
    t[0] = new Triangle(3.3,3);
    t[1] = new Triangle(15,15.5);
    t[2] = new Triangle(7.3,10);
    t[3] = new Triangle();


    showInfo(c,t,r);

}catch (Exception e){System.out.print(e.getMessage());}
}
//==============================
public static void showInfo(Circle[] c, Triangle[] t, Rectangle[] r){
DecimalFormat df = new DecimalFormat("#.##");

System.out.println("________________________________\nCircles:");
for(int i=0;i<c.length;i++)
System.out.println((i+1)+"# Radius: "+df.format(c[i].getRadius())+" | Area: "+df.format(c[i].calculateArea())+" | Circumference: "+df.format(c[i].calculateCircumference()));
System.out.println("________________________________\nRectangles:");
for(int i=0;i<r.length;i++)
System.out.println((i+1)+"# Height: "+r[i].getHeight()+" | Width: "+r[i].getWidth()+" | Area: "+df.format(r[i].calculateArea())+" | Perimeter: "+df.format(r[i].calculateCircumference()));
System.out.println("________________________________\nTriangles:");
for(int i=0;i<t.length;i++)
System.out.println((i+1)+"# Height: "+t[i].getHeight()+" | Base: "+t[i].getBase()+" | Area: "+df.format(r[i].calculateArea())+" | Perimeter: "+df.format(r[i].calculateCircumference()));


}
}
