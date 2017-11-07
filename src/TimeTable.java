import java.util.ArrayList;

public class TimeTable {
    private ArrayList<Course> Monday_TimeTable;
    private ArrayList<Course> Tuesday_TimeTable;
    private ArrayList<Course> Wednesday_TimeTable;
    private ArrayList<Course> Thursday_TimeTable;
    private ArrayList<Course> Friday_TimeTable;
    private ArrayList<Course> Saturday_TimeTable;

    public ArrayList<Course> getMonday_TimeTable() {
        return Monday_TimeTable;
    }

    public ArrayList<Course> getTuesday_TimeTable() {
        return Tuesday_TimeTable;
    }

    public ArrayList<Course> getWednesday_TimeTable() {
        return Wednesday_TimeTable;
    }

    public ArrayList<Course> getThursday_TimeTable() {
        return Thursday_TimeTable;
    }

    public ArrayList<Course> getFriday_TimeTable() {
        return Friday_TimeTable;
    }

    public ArrayList<Course> getSaturday_TimeTable() {
        return Saturday_TimeTable;
    }

    public TimeTable generate_TimeTable() {
        return new TimeTable();
    }
}
