public class PrimeNumbers {
    public static void main(String[] args) {
        int n =50;
        for(int i=1;i<=n;i++){
            IsPrime(i);
        }
    }
    public static void IsPrime(int n){
        int count = 0;
        for(int j=2;j<n;j++) {
            if (n % j == 0) {
                count++;
            }
        }
            if(count==0){
                System.out.print(n+"\n It is a not prime number");
            }
            else{
                System.out.print(n+"\n It is a prime number");
            }
        }
    }
