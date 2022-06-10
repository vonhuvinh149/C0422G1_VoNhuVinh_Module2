package ss4_module2.StopWatch;

import java.util.Date;

public class StopWatch {
   private Date startTime;
    private Date endTime;
    public StopWatch () {
       this.startTime = new Date();
        this.endTime = new Date();
    }
    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void start(){
        this.startTime = new Date();
    }
    public void stop(){
        this.endTime= new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }
}

