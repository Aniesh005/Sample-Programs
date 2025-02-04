import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in KGs: ");
        double kgs = sc.nextDouble();
        double grams = 0;
        double mg=0;
        convertKGstoGrams(kgs);
        convertGramsTomg(grams, mg);
    }
    public static double convertKGstoGrams(double kgs) {
        double grams = kgs / 100.0;
        System.out.println("KiloGrams: "+ kgs + "In Grams: "+ grams);
        return grams;
    }
    public static double convertGramsTomg(double grams, double mg) {
        mg = grams / 100.0;
        System.out.println("Grams: "+ grams + " In Mg: "+ mg);
        return mg;
    }
}
