package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Classroom {

    private String classroom_name;
    private boolean isoccupied = false;
    private int totalcapacity;
    public HashMap<String, ArrayList<Slot>>[] bookings = new HashMap[5];

    public Classroom(String name) {
        this.classroom_name = name;
        totalcapacity++;
        bookings[0]= new HashMap<>();
        bookings[0].put("Monday",new ArrayList<>());
        bookings[1]= new HashMap<>();
        bookings[1].put("Tuesday",new ArrayList<>());
        bookings[2]= new HashMap<>();
        bookings[2].put("Wednesday",new ArrayList<>());
        bookings[3]= new HashMap<>();
        bookings[3].put("Thursday",new ArrayList<>());
        bookings[4]= new HashMap<>();
        bookings[4].put("Friday",new ArrayList<>());

    }

    public String toString() {
        return classroom_name;
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
