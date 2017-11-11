package main;
import java.util.Date;

public class Classroom {
    private String classroom_name;
    private boolean isoccupied = false;
    private int totalcapacity;
    public Date[] Occupied_timeslot_start;//we will store the time when the room is occupied on the day of the week
    public Date[] Occupied_timeslot_end;
    
    public Classroom (String name) {
        this.classroom_name = name;
//        this.totalcapacity = capacity;
        totalcapacity++;
    }

   

	public String getClassroom_name() {
        totalcapacity++;
        return classroom_name;
    }

    public boolean isIsoccupied() {
        totalcapacity++;
        return isoccupied;
    }

    public int getTotalcapacity() {
        totalcapacity++;
        return totalcapacity;
    }
}
