public class RectangleDriver
{
    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle(5, 5);
        rect1.printDims();
        rect1.printArea();
        rect1.printDiag();
        rect1.printPerimeter();
        System.out.println();
        
        Rectangle square = new Rectangle(5);
        square.printDims();
        square.printArea();
        square.printDiag();
        square.printPerimeter();
    }
}