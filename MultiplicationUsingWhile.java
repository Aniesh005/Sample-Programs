public class MultiplicationUsingWhile {
    public static void main(String[] args) {
        multiply(1,1,5);
    }
    public static void multiply(int i, int table, int n) {
        while (i<=10) {
            table = i * n;
            System.out.println(table);
            i++;
        }
    }
}
