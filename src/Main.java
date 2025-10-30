import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
public static final String result = "\u001B[32m";   //red for X
public static final String defultColor = "\u001B[0m";
public static final String sample = "\u001B[33m";
public static final String errorMessage = "\u001B[31m";   //red for X

public  static void main(String[] args){
    Scanner read = new Scanner(System.in);
    int choice=0; double radius,height,width,base;
    DecimalFormat df = new DecimalFormat("#.##");
    Circle circle;
    Triangle triangle;
    Rectangle rectangle;
    ArrayList<Shape> recent = new ArrayList<>();
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
//==================================================

    while(choice!=6) {
    try{
        System.out.println("this is a calculator of a circle/triangle/rectangle 's area or perimeter.\n1.Circle\n2.Triangle\n3.Rectangle\n4.Show system sample\n5.Show recent calculate\n6.No thanks!");
        choice=read.nextInt();
        switch (choice){
            case 1: System.out.println("Enter the radius:");
                    radius = read.nextDouble();
                    circle = new Circle(radius);
                   recent.add(circle);

                System.out.println(result+"#  Radius: "+df.format(circle.getRadius())+" | Area: "+df.format(circle.calculateArea())+" | Circumference: "+df.format(circle.calculateCircumference())+ defultColor);
                    break;
            case 2: System.out.println("Enter the height:");
            height = read.nextDouble();
            System.out.println("Enter the base:");
            base = read.nextDouble();
            triangle = new Triangle(height,base);
            recent.add(triangle);
            System.out.println(result+"#  Height: "+triangle.getHeight()+" | Base: "+triangle.getBase()+" | Area: "+df.format(triangle.calculateArea())+" | Perimeter: "+df.format(triangle.calculateCircumference())+ defultColor);
            break;

            case 3:
                    System.out.println("Enter height:");
                    height = read.nextDouble();
                    System.out.println("Enter width:");
                    width = read.nextDouble();
                    rectangle = new Rectangle(height,width);
                    recent.add(rectangle);

                System.out.println(result+"#  Height: "+rectangle.getHeight()+" | Width: "+rectangle.getWidth()+" | Area: "+df.format(rectangle.calculateArea())+" | Perimeter: "+df.format(rectangle.calculateCircumference())+ defultColor);

            break;

            case 4:     showInfo(c,t,r); break;
            case 5: showRecent(recent); break;

            case 6: System.out.println("Hope you like it."); break;

            default: System.out.println(errorMessage+"Please choose from 1-5"+defultColor);

        }
    }


catch (InputMismatchException e){System.out.println(errorMessage+"Please enter numbers only"+defultColor); read.nextLine(); }
catch (IndexOutOfBoundsException e) {System.out.println(errorMessage+"showing sample index and array error"+defultColor);}
catch (Exception e){System.out.println(errorMessage+e.getMessage()+defultColor);}
}}catch (Exception e){} }
//==============================
public static void showInfo(Circle[] c, Triangle[] t, Rectangle[] r){
DecimalFormat df = new DecimalFormat("#.##");

System.out.println("________________________________\nCircles:");
for(int i=0;i<c.length;i++)
System.out.println(sample +(i+1)+"# Radius: "+df.format(c[i].getRadius())+" | Area: "+df.format(c[i].calculateArea())+" | Circumference: "+df.format(c[i].calculateCircumference())+defultColor);
System.out.println("________________________________\nRectangles:");
for(int i=0;i<r.length;i++)
System.out.println(sample +(i+1)+"# Height: "+r[i].getHeight()+" | Width: "+r[i].getWidth()+" | Area: "+df.format(r[i].calculateArea())+" | Perimeter: "+df.format(r[i].calculateCircumference())+defultColor);
System.out.println("________________________________\nTriangles:");
for(int i=0;i<t.length;i++)
System.out.println(sample +(i+1)+"# Height: "+t[i].getHeight()+" | Base: "+t[i].getBase()+" | Area: "+df.format(r[i].calculateArea())+" | Perimeter: "+df.format(r[i].calculateCircumference())+defultColor);
}

public static void showRecent(ArrayList<Shape> r){
    DecimalFormat df = new DecimalFormat("#.##");
    if(!r.isEmpty())
for(int i=0;i<r.size();i++)
{
if(r.get(i) instanceof Circle) System.out.println(sample +"# Radius: "+df.format(((Circle) r.get(i)).getRadius())+" | Area: "+df.format(((Circle) r.get(i)).calculateArea())+" | Circumference: "+df.format(((Circle) r.get(i)).calculateCircumference())+defultColor);
if(r.get(i) instanceof Rectangle) System.out.println(sample +"# Height: "+ ((Rectangle) r.get(i)).getHeight()+" | Width: "+((Rectangle) r.get(i)).getWidth()+" | Area: "+df.format(((Rectangle) r.get(i)).calculateArea())+" | Perimeter: "+df.format(((Rectangle) r.get(i)).calculateCircumference())+defultColor);
if(r.get(i) instanceof Triangle)System.out.println(sample +"# Height: "+((Triangle) r.get(i)).getHeight()+" | Base: "+((Triangle) r.get(i)).getBase()+" | Area: "+df.format(((Triangle) r.get(i)).calculateArea())+" | Perimeter: "+df.format(((Triangle) r.get(i)).calculateCircumference())+defultColor);


} else System.out.println("No recent calculation yet.");

}
}
