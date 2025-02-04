public class sum_of_first_lastDigit {
    public static int sum(int num) {
        int last=num%10;
        int first =0;
        num=num/10;
        while(num==0){
            first=num/10;
        }
        return first+last;
    }
    public static void main(String[] args) {
        System.out.println(sum(121));
    }
}
