public class Precise {
    public static void main(String[] args) {
        float pertrol_price = 84.11f;
        float disel_price = 74.91f;
        float wallet_amt = 1546.12f;
        float petrolQuantity, DiselQuantity;
        petrolQuantity = (wallet_amt / pertrol_price);
        DiselQuantity = (wallet_amt / disel_price);
        double pertrol_price1 = 84.11;
        double disel_price1 = 74.91;
        double wallet_amt1 = 1546.12;
        double petrolQuantity1, DiselQuantity1;
        petrolQuantity1 = wallet_amt1 / pertrol_price1;
        DiselQuantity1 = wallet_amt1 / disel_price1;
        System.out.println("The quality of the petrol that we can buy in " +wallet_amt + " is " + petrolQuantity);
        System.out.println("The quality of the petrol that we can buy in " +wallet_amt + " is " + DiselQuantity);
        System.out.println("The quality of the petrol that we can buy in " +wallet_amt + " is " + petrolQuantity1);
        System.out.println("The quality of the petrol that we can buy in " +wallet_amt + " is " + DiselQuantity1);
    }
}

