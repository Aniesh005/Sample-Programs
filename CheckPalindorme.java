public class CheckPalindorme{
    public static void main (String[]args)
    {
        int number = 121;
        int reverse = 0, temp = number;
        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        if (number == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}