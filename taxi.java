import java.util.Scanner;
public class taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Taxi Number: ");
        String taxiNo = sc.next();
        System.out.print("Enter Distance Travelled: ");
        int d = sc.nextInt();
        int amt = 0;
        if (d > 0) {
            if (d > 25) {
                amt += (d - 25) * 5;
                d = 25;
            }
            if (d > 15) {
                amt += (d - 15) * 8;
                d = 15;
            }
            if (d > 5) {
                amt += (d - 5) * 10;
                d = 5;
            }
            amt += 100;
        }
        System.out.println("Taxi No.: " + taxiNo);
        System.out.println("Distance Covered: " + d + " km");
        System.out.println("Amount: " + amt);
    }
}
