public class DecimalComparator {
    public static boolean compareDecimal(double num1, double num2, double num3) {
        num1 = Math.round(num1 * 100000);
        num2 = Math.round(num2 * 100000);
        num3 = Math.round(num3 * 100000);
        return (num1 == num2 && num2 == num3);
    }
    public static void main(String[] args) {
        System.out.println(compareDecimal(1.575664, 2.565684, 3.685954));

    }
}
