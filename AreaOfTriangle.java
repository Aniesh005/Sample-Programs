import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the breadth of the triangle: ");
    float Breadth = sc.nextFloat();
    System.out.println("Enter the length of the triangle: ");
    float Length = sc.nextFloat();
    float Area = (float) 1/2 * (Length * Breadth);
        System.out.println("The area of the triangle is : "+Area);
    }
}
