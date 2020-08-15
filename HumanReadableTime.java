public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    // Simple
    int hours = 0;
    int mins = 0;
    int secs = 0;
    
    if (seconds >= 3600) {
      hours = seconds/3600;
      seconds = seconds%3600;
    }
    
    if (seconds >= 60) {
      mins = seconds/60;
      seconds = seconds%60;
    }
    
    secs = seconds;
    
    return String.format("%02d",hours)+":"+String.format("%02d",mins)+":"+String.format("%02d",secs);
  }
}
