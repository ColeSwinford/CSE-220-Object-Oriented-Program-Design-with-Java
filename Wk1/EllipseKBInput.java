import java.util.Scanner;

public class EllipseKBInput
{
    public static void main(String[] args)
    {
        System.out.println("Axis1:");
        Scanner scan = new Scanner(System.in);
        Double axis1 = scan.nextDouble();
        System.out.println("\nAxis2:");
        Double axis2 = scan.nextDouble();
        System.out.println("\nAxis1: " + axis1 + "\nAxis2: " + axis2);
        System.out.println("\nEllipse Area: " + (Math.PI*axis1*axis2));
        System.out.println("Ellipse Perimeter (crude approximation): " + (Math.PI*(axis1 + axis2)));
    }
} 