import java.util.Scanner;

public class NoOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void GetDaysInMonth(int year, int month) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        }
        if (year < 999) {
            System.out.println("Invalid year");
        }
        switch (month) {
            case 1:
                System.out.println("January" + " " + year + "has 31 days");
                break;
            case 2:
                System.out.println("February" + " " + year + (isLeapYear(year) ? "29 days" : "28 days"));
                break;
            case 3:
                System.out.println("March" + " " + year + "has 31 days");
                break;
            case 4:
                System.out.println("April" + " " + year + "has 30 days");
                break;
            case 5:
                System.out.println("May" + " " + year + "has 31 days");
                break;
            case 6:
                System.out.println("June" + " " + year + "has 30 days");
                break;
            case 7:
                System.out.println("July" + " " + year + "has 31 days");
                break;
            case 8:
                System.out.println("August" + " " + year + "has 31 days");
                break;
            case 9:
                System.out.println("September" + " " + year + "has 30 days");
                break;
            case 10:
                System.out.println("October" + " " + year + "has 31 days");
                break;
            case 11:
                System.out.println("November" + " " + year + "has 30 days");
                break;
            case 12:
                System.out.println("December" + " " + year + "has 31 days");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        System.out.println("Enter the month");
        int month = sc.nextInt();
        GetDaysInMonth(year, month);
    }
}
