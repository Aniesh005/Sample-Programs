public class CatPlaying {
    public static boolean CatPlaying(boolean Summer, int temperature) {
        if (Summer) {
           if(temperature >= 25 && temperature <= 35) {
                return true;
            }
        }else{
            return false;
        }
        if(temperature >= 25 && temperature <= 35) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        CatPlaying(true, 10);
        CatPlaying(false, 36);
        CatPlaying(false, 35);
    }
}
