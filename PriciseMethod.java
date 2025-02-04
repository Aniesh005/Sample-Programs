public class PriciseMethod {
    public static void main(String[] args) {
        float petrol_price = 84.11f;
        float disel_price = 74.91f;
        float wallet_amt = 1546.12f;

        FloatPetrol(petrol_price, wallet_amt);
        FloatDisel(disel_price,wallet_amt);
        DoublePetrol(petrol_price,wallet_amt);
        DoubleDisel(disel_price,wallet_amt);

    }
    public static void FloatPetrol(float petrol_price, float wallet_amt) {
        float petrolQuantity = (wallet_amt / petrol_price);
        System.out.println("The quantiy of petrol we can buy in "+ wallet_amt + " is " + petrolQuantity);
    }
    public static void DoublePetrol(double petrol_price, double wallet_amt) {
        double petrolQuantity = (wallet_amt / petrol_price);
        System.out.println("The quantiy of petrol we can buy in "+ wallet_amt + " is " + petrolQuantity);
    }
    public static void FloatDisel(float disel_price, float wallet_amt) {
        float DiselQuantity = (wallet_amt / disel_price);
        System.out.println("The quantiy of disel we can buy in "+ wallet_amt + " is " + DiselQuantity);
    }
    public static void DoubleDisel(double disel_price, double wallet_amt) {
        double DiselQuantity = (wallet_amt / disel_price);
        System.out.println("The quantiy of disel we can buy in "+ wallet_amt + " is " + DiselQuantity);
    }

}
