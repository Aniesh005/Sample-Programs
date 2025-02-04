import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student");
        int Age = sc.nextInt();
        System.out.println("Enter "+name+" Marks");
        double Marks = sc.nextDouble();
        char grade = Grade(Marks);
        display(name, Age, Marks, grade);
    }
    public static char Grade(double score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        }else if (score >= 70 && score < 90) {
            grade = 'B';
        }else if (score >= 70 && score < 50) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        return grade;
    }
    public static void display(String name, int Age, double Marks, char grade) {
        System.out.println("Student Name : "+name);
        System.out.println("Student Age : "+Age);
        System.out.println("Student Marks : "+Marks);
        System.out.println("Student Grade : "+grade);
    }
}
