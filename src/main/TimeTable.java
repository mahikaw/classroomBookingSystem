package main;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import main.Classroom;
import main.Course;

class Class {
    String course_ID;
    Classroom venue;
    Date start_time;
    Date end_time;

    public Class(String course_ID, Classroom venue, Date start_time, Date end_time) {
        this.course_ID = course_ID;
        this.venue = venue;
        this.end_time = end_time;
        this.start_time = start_time;
    }

    public String getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(String course_ID) {
        this.course_ID = course_ID;
    }

    public Classroom getVenue() {
        return venue;
    }

    public void setVenue(Classroom venue) {
        this.venue = venue;
    }
}

public class TimeTable {
    public static HashMap<String, Course> courseMap = new HashMap<>();
    public static HashMap<String, Course> course_pre = new HashMap<>();
    private ArrayList<Class> Monday_TimeTable;
    private ArrayList<Class> Tuesday_TimeTable;
    private ArrayList<Class> Wednesday_TimeTable;
    private ArrayList<Class> Thursday_TimeTable;
    private ArrayList<Class> Friday_TimeTable;

    public TimeTable(HashMap<String, Course> courseMap, ArrayList<Class> monday_TimeTable, ArrayList<Class> tuesday_TimeTable, ArrayList<Class> wednesday_TimeTable, ArrayList<Class> thursday_TimeTable, ArrayList<Class> friday_TimeTable) {
        this.courseMap = courseMap;
        Monday_TimeTable = monday_TimeTable;
        Tuesday_TimeTable = tuesday_TimeTable;
        Wednesday_TimeTable = wednesday_TimeTable;
        Thursday_TimeTable = thursday_TimeTable;
        Friday_TimeTable = friday_TimeTable;
    }

    public ArrayList<Class> getMonday_TimeTable() {
        return Monday_TimeTable;
    }

    public ArrayList<Class> getTuesday_TimeTable() {
        return Tuesday_TimeTable;
    }

    public ArrayList<Class> getWednesday_TimeTable() {
        return Wednesday_TimeTable;
    }

    public ArrayList<Class> getThursday_TimeTable() {
        return Thursday_TimeTable;
    }

    public ArrayList<Class> getFriday_TimeTable() {
        return Friday_TimeTable;
    }


//    public TimeTable generate_TimeTable() {
//        return new TimeTable();
//    }

    public void read() throws IOException {

        try {

            BufferedReader br = new BufferedReader(new FileReader("./src/tt.csv"));
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {


                //System.out.println("line read:\n\n\n"+line + "\n\n");
                String info[] = line.split(";");
                if (!courseMap.containsKey(info[2])) {
                    //todo add the course in hashmap
                    Course dummy = new Course(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), info[5], info[13], info[14]);
                    //System.out.println(info[14]);
                    course_pre.put(info[14], dummy);
                    courseMap.put(info[2],dummy);
                }

                DateFormat formatter = new SimpleDateFormat("HH:mm");

                for (int m = 6; m < 13; m++) {
                    Class temp = null;
                    if (info[m].compareTo("") != 0) {
                        //System.out.println(info[m]+" infor at "+m);
                        String[] timings_venues = info[m].split("\\$");
//                        System.out.println("timings_venue: "+timings_venues[0]);
                        try {
                            if (m < 11) {
                                //for adding regular lecture classes
                                temp = new Class(info[2], new Classroom(timings_venues[1]),
                                        formatter.parse(timings_venues[0].split("-")[0]),
                                        formatter.parse(timings_venues[0].split("-")[1]));
                                switch (m) {
                                    case 6: {
                                        Monday_TimeTable.add(temp);
                                        break;
                                    }
                                    case 7: {
                                        Tuesday_TimeTable.add(temp);
                                        break;
                                    }
                                    case 8: {
                                        Wednesday_TimeTable.add(temp);
                                        break;
                                    }
                                    case 9: {
                                        Thursday_TimeTable.add(temp);
                                        break;
                                    }
                                    case 10: {
                                        Friday_TimeTable.add(temp);
                                        break;
                                    }
                                }
                            } else {
                                //for adding tutorial classes
                                temp = new Class(info[2], new Classroom(timings_venues[2]),
                                        formatter.parse(timings_venues[1].split("-")[0]),
                                        formatter.parse(timings_venues[1].split("-")[1]));
                                switch (timings_venues[0].replaceAll(" ","")) {
                                    case "Monday": {
                                        Monday_TimeTable.add(temp);
                                        break;
                                    }
                                    case "Tuesday": {
                                        Tuesday_TimeTable.add(temp);
                                        break;
                                    }
                                    case "Wednesday": {
                                        Wednesday_TimeTable.add(temp);
                                        break;
                                    }
                                    case "Thursday": {
                                        Thursday_TimeTable.add(temp);
                                        break;
                                    }
                                    case "Friday": {
                                        Friday_TimeTable.add(temp);
                                        break;
                                    }
                                }
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                    } else {//System.out.println("info at "+m+" was empty");
                        continue;
                    }
                }
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void showTimetable(){
        courseMap.forEach((k,v)->{
            System.out.println(k+" "+v.toString());
                }
        );
    }



}
