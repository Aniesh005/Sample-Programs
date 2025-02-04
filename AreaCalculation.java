import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        Area(length);
        Area(length, breadth);
        Area(breadth, height);
    }
    public static void Area(int length){
        double sq_area = length * length;
        System.out.println("The area of Square is: " + sq_area);
    }
    public static void Area(int length, int breadth){
        double rec_area = length * breadth;
        System.out.println("The area of rectangle is: " + rec_area);
    }
    public static void Area(int breadth, double height){
        double tri_area = 0.5 * (breadth * height);
        System.out.println("The area of triangle is: " + tri_area);
    }
}
