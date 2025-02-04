import java.util.Scanner;

public class PrintNumbers_in_word {
    public static void printNumbers(int n) {
            switch(n) {
                case 1:
                    System.out.print("ONE");
                    break;
                    case -1:
                    System.out.print("NEGATIVE ONE");
                    break;
                case 2:
                    System.out.print("TWO");
                    break;
                    case -2:
                    System.out.print("NEGATIVE TWO");
                    break;
                case 3:
                    System.out.print("THREE");
                    break;
                case -3:
                    System.out.print("NEGATIVE THREE");
                    break;
                case 4:
                    System.out.print("FOUR");
                    break;
                case -4:
                    System.out.print("NEGATIVE FOUR");
                    break;
                case 5:
                    System.out.print("FIVE");
                    break;
                case -5:
                    System.out.print("NEGATIVE FIVE");
                    break;
                case 6:
                    System.out.print("SIX");
                    break;
                case -6:
                    System.out.print("NEGATIVE SIX");
                    break;
                case 7:
                    System.out.print("SEVEN");
                    break;
                case -7:
                    System.out.print("NEGATIVE SEVEN");
                    break;
                case 8:
                    System.out.print("EIGHT");
                    break;
                case -8:
                    System.out.print("NEGATIVE EIGHT");
                    break;
                case 9:
                    System.out.print("NINE");
                    break;
                case -9:
                    System.out.print("NEGATIVE NINE");
                    break;
                case 0:
                    System.out.print("ZERO");
                    break;
                default:
                    System.out.print("OTHER");
                    break;
            }
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printNumbers(n);
        }
    }

