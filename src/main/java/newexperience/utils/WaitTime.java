package newexperience.utils;

public class WaitTime {
    public  static void Time(int mill){
        try {
            Thread.sleep(mill);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
