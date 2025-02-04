public class PredictOddUsing_While {
    public static boolean predictOdd(int n) {
        if(n%2 != 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num=4;
        int max=29;
        while(num<max) {
            num++;
            if(predictOdd(num)) {
                System.out.println(num);
            }
        }
    }
}
