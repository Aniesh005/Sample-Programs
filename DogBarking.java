public class DogBarking {
    public static boolean shouldWakeUp(boolean barking, int hourofTheDay) {
        if(hourofTheDay >= 1 && hourofTheDay <= 23) {
            if ((barking == true) && ((hourofTheDay <= 8) || (hourofTheDay >= 22))) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean response = shouldWakeUp(true, 4);
        System.out.println(response);
    }
}
