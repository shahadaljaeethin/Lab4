public class Triangle extends  Shape{
private double height,base;
    public Triangle(){height=1; base=1;}
    public  Triangle(double height,double base)throws Exception{
    if(height<=0||base<=0) throw new Exception("length must be over zero.");

    this.height=height;
    this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    //=======


    @Override
    public double calculateCircumference() {
        //p = a +b + c, since all three are equals a*3.
        return base*3;
    }

    @Override
    public double calculateArea() {
        return (height*base)/2;
    }
}
