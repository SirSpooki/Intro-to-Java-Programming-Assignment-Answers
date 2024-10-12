import java.time.*;
public class FitnessTracker2 {
    String activity;
    int minutes;
    LocalDate date;
    public FitnessTracker2() 
    {
        this("running",0,LocalDate.of(2018, 1, 1));
    }
    public FitnessTracker2(String activityParam, int minutesParam, LocalDate dateParam) 
    {
        this.activity = activityParam;
        this.minutes = minutesParam;
        this.date = dateParam;
    }
    public String getActivity() 
    {
        return activity;
    }
    public int getMinutes() 
    {
        return minutes;
    }
    public LocalDate getDate() 
    {
        return date;
    }
}
