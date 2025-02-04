public class TimeConverter {
    public static void main(String[] args) {
        System.out.println(Minutestoseconds(5600, 50));
        System.out.println(Minutestoseconds(5600));
    }
    public static String Minutestoseconds(long minutes, long seconds) {
        if(minutes < 0 || seconds <0 || seconds > 59) {
            return "Invalid Value";
        }else {
            long hours = minutes / 60;
            long remaning_Minutes = minutes % 60;
            return hours + "h " + remaning_Minutes + "m " + seconds + "s ";
        }
    }
    public static String Minutestoseconds(long seconds) {
        if(seconds < 0) {
            return "Invalid Value";
        }else {
            long minutes = seconds / 60;
            long remaning_Seconds = seconds % 60;
            return minutes + "min " + remaning_Seconds + "s ";
        }
    }
}
