import java.util.Scanner;

public class KbtoMb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilobytes");
        double kb = sc.nextDouble();
        kbToMb(kb);
    }
    public static double kbToMb(double kb){
        double Mb = kb / 1024;
        System.out.println("Kilo bytes: "+kb + " Mega Bytes" + Mb + " Bytes");
        return Mb;
    }
}
