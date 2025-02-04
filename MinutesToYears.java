public class MinutesToYears {
    public static void YearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid minutes");
        }
        int hours = (int) minutes/60;
        int days =  hours / 24;
        int years = days / 365;
        int remaining_days = days % 365;
        System.out.println(minutes + "min = " + years + " y and " +remaining_days +" d");
    }
    public static void main(String[] args) {
        YearsAndDays(525600);
        YearsAndDays(1051200);
        YearsAndDays(561600);
    }
}
