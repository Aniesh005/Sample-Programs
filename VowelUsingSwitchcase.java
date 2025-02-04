import java.util.Scanner;

public class VowelUsingSwitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char s = sc.next().charAt(1);
        System.out.println(vowels(s));
    }
    public static char vowels(char s) {
        switch (s) {
            case 'a':
                return 'a';
            case 'e':
                return 'e';
            case 'i':
                return 'i';
            case 'o':
                return 'o';
            case 'u':
                return 'u';
            default:
                System.out.println(s +": It is not a vowel");
        }
        return ' ';
    }
}
