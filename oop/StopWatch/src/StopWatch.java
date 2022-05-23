import java.time.LocalTime;
public class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }


    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public  void start(){
        startTime = LocalTime.now();
    }

    public void  stop(){
        endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int miliSecond = ((endTime.getHour() - startTime.getHour())*3600 +
                (endTime.getMinute() - startTime.getMinute())*60 +
                (endTime.getSecond() - startTime.getSecond())*1000);
        return miliSecond;
    }
}
