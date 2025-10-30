public class Circle extends Shape{
private double radius;
private final double pi=3.14;
//--


    public Circle(){radius=1;}

    public Circle(double radius) throws Exception {
        if(radius<=0) throw new Exception("Radius must be over 0.");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception{
        if(radius<=0) throw new Exception("Radius must be over 0.");
        this.radius = radius;
    }
//==================================
    @Override
    public double calculateArea() {
        //area = pi*radius^2
        return pi*Math.pow(radius,2);
    }

    @Override
    public double calculateCircumference() {
        //=2*pi*r
        return 2*pi*radius;
    }


}
