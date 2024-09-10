public class Rectangle {
    private double height, width;
    public Rectangle(double x, double y)
    {
        height=x;
        width=y;
    }
    public Rectangle(double a)
    {   
        height = a;
        width = a;
    }

    public void printDims() 
    {
        System.out.println("This rectangle has height " + height + " and width " + width);
    }
    public void printArea() 
    {
            System.out.println("This rectangle has area of " + height*width + " units squared.");
    }
    public void printDiag()
    {
        System.out.println("This rectange has a diagnonal length of " + (Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2))) + " units.");
    }
    public void printPerimeter()
    {
        System.out.println("This rectnangle has a perimeter length of " + (height*2 + width*2) + " units.");
    }
}