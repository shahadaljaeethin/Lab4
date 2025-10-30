public class Rectangle extends Shape{
    private double height,width;
    public Rectangle(){height=1; width=1;}
    public Rectangle(double height, double width) throws Exception{
        if(height<=0||width<=0) throw new Exception("length must be over zero.");
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws Exception {
        if(height<=0) throw new Exception("length must be over zero.");

        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws Exception{
        if(width<=0) throw new Exception("length must be over zero.");

        this.width = width;
    }
    //===============

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculateCircumference() {
        return 2*(width+height);
    }
}
