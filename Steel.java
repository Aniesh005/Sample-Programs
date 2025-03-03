import java.util.Scanner;

public class Steel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hardness: ");
        int h = sc.nextInt();
        System.out.println("Enter the carbon content: ");
        float c = sc.nextFloat();
        System.out.println("Enter the Tensile strength: ");
        int ts = sc.nextInt();
        boolean cond1 = h>60;
        boolean cond2 = c>0.8;
        boolean cond3 = ts>5700;
        char steelClass;
        if(cond1 && cond2 && cond3){
            steelClass = 'A';
        }else if(cond1&& cond2){
            steelClass = 'B';
        }else if(cond1 && cond3){
            steelClass ='C';
        }else if(cond2 & cond3){
            steelClass = 'D';
        }else if(cond1 || cond2 || cond3){
            steelClass = 'E';
        }else{
            steelClass = 'F';
        }
        System.out.println("The steel is classifies as: "+steelClass);
    }
}
