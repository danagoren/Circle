import java.util.Scanner;
import java.lang.Math;
public class Circle
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the x value of the upper left corner of the rectangle");
        int upLeftX = scan.nextInt();
        System.out.println("Please enter the y value of the upper left corner of the rectangle");
        int upLeftY = scan.nextInt();
        System.out.println("Please enter the x value of the lower right corner of the rectangle");
        int downRightX = scan.nextInt();
        System.out.println("Please enter the y value of the lower right corner of the rectangle");
        int downRightY = scan.nextInt();
        double excircleRadius = Math.sqrt(Math.pow((Math.abs(upLeftX-downRightX)),2)+Math.pow((upLeftY-downRightY),2))/2;
        double excircleArea = Math.PI * Math.pow(excircleRadius,2);
        double excirclePerimeter = 2*Math.PI*excircleRadius;
        double incircleRadius = (Math.abs(upLeftY-downRightY))/2;
        double incircleArea = Math.PI * Math.pow(incircleRadius,2);
        double incirclePerimeter = 2*Math.PI*incircleRadius;
        System.out.println("Incircle: radius = "+incircleRadius+", area = "+incircleArea+", perimeter = "+incirclePerimeter);
        System.out.println("Excircle: radius = "+excircleRadius+", area = "+excircleArea+", perimeter = "+excirclePerimeter);
    }
}    