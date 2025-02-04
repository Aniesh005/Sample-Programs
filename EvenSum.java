public class EvenSum {
    public static boolean isEven(int num) {
        if(num<=0){
            return false;
        }
        if(num%2==0){
            return true;
        }
        return false;
    }
    public static int evenSum(int start, int end) {
        int sum = 0;
        if(start>end){
            return -1;
        }
        if(start <=0 || end<=0){
            return -1;
        }
        for(int i=start; i<=end;i++){
            if(isEven(i)){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(evenSum(2,20));
    }
}