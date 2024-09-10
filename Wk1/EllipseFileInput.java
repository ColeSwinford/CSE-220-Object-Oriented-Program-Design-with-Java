import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class EllipseFileInput
{
    public static void main(String[] args) throws FileNotFoundException
    {
        double curtoken;
        File file = new File("EllipseAxes.txt");
        Scanner fscnr = new Scanner(file);

        double axis1 = fscnr.nextDouble();
        double axis2 = fscnr.nextDouble();
        System.out.println("\nEllipse Area: " + (Math.PI*axis1*axis2));
        System.out.println("Ellipse Perimeter (crude approximation): " + (Math.PI*(axis1 + axis2)));
    }
}