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

class Class {
    String course_ID;
    String venues;
     String end;
     String start;
    Classroom venue;
    Date start_time;
    Date end_time;
    public String getVenues() {
        		return venues;
        	}
 	public void setVenues(String venues) {
 		this.venues = venues;
        	}
 	public String getMonday() {
        		return monday;
        	}
 	public void setMonday(String monday) {
        		this.monday = monday;
        	}
 	public String getTuesday() {
        		return tuesday;
        	}
 	public void setTuesday(String tuesday) {
        		this.tuesday = tuesday;
        	}
 	public String getWednesday() {
        		return wednesday;
        }
 	public void setWednesday(String wednesday) {
 		this.wednesday = wednesday;
        	}
 	public String getThursday() {
        		return thursday;
        	}
 	public void setThursday(String thursday) {
        		this.thursday = thursday;
        	}
 	public String getFriday() {
        		return friday;
        	}
 	public void setFriday(String friday) {
        		this.friday = friday;
        	}

         	String monday;
     String tuesday;
     String wednesday;
     String thursday;
     String friday;
   public Class(String course_ID,String venue,String mon,String tues,String wed,String thu,String fri){
            	this.course_ID=course_ID;
            	this.venues=venue;
            	this.monday=mon;
            	this.tuesday=tues;
            	this.wednesday=wed;
            	this.thursday=thu;
            	this.friday = fri;
    }
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

    @Override
    public String toString() {
        return "Class{" +
                "course_ID='" + course_ID + '\'' +
                ", venue=" + venue +
                ", start_time=" + start_time.getHours() + ":" + start_time.getMinutes() +
                ", end_time=" + end_time.getHours() + ":" + end_time.getMinutes() +
                '}';
    }
}

public class TimeTable {
    public static HashMap<String, Course> courseMap = new HashMap<>();
    public static HashMap<String, Course> course_pre = new HashMap<>();
    public ArrayList<Class> Monday_TimeTable;
    public ArrayList<Class> Tuesday_TimeTable;
    public ArrayList<Class> Wednesday_TimeTable;
    public ArrayList<Class> Thursday_TimeTable;
    public ArrayList<Class> Friday_TimeTable;
    public ArrayList<Course> Time_Table;

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
                    courseMap.put(info[2], dummy);
                }

                DateFormat formatter = new SimpleDateFormat("HH:mm");

                for (int m = 6; m < 13; m++) {
                    Class temp = null;
                    if (info[m].compareTo("") != 0) {
                        //System.out.println(info[m]+" infor at "+m);
                        String[] timings_venues = info[m].split("\\$");
//                        System.out.println("timings_venue: "+timings_venues[0]);
                        try {
                            Classroom classroomTemp;
                            if (m < 11) {
                                classroomTemp = new Classroom(timings_venues[1]);
                                if (!Application.classrooms.containsKey(classroomTemp.getClassroom_name())) {
                                    System.out.println("ADDING CLASSROOM: "+classroomTemp.getClassroom_name());
                                    Application.classrooms.put(classroomTemp.getClassroom_name(), classroomTemp);
                                }
                                //for adding regular lecture classes
                                Date start = formatter.parse(timings_venues[0].split("-")[0]);
                                Date end = formatter.parse(timings_venues[0].split("-")[1]);
                                temp = new Class(info[2], classroomTemp,
                                        start,
                                        end);
                                switch (m) {
                                    case 6: {
                                        Monday_TimeTable.add(temp);
                                        Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[0].get("Monday").add(new Slot(start, end));
                                        break;
                                    }
                                    case 7: {
                                        Tuesday_TimeTable.add(temp);
//                                        System.out.println(Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[0].get("Tuesday")+"  r  f");
                                        Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[1].get("Tuesday").add(new Slot(start, end));
                                        break;
                                    }
                                    case 8: {
                                        Wednesday_TimeTable.add(temp);
                                        Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[2].get("Wednesday").add(new Slot(start, end));
                                        break;
                                    }
                                    case 9: {
                                        Thursday_TimeTable.add(temp);
                                        Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[3].get("Thursday").add(new Slot(start, end));
                                        break;
                                    }
                                    case 10: {
                                        Friday_TimeTable.add(temp);
                                        Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[4].get("Friday").add(new Slot(start, end));
                                        break;
                                    }
                                }
                            } else {
                                //for adding tutorial classes
                                String[] diff_timings_venue = info[m].split("/");
                                for (String a : diff_timings_venue) {
//                                    System.out.println("\n"+a);
                                    String time_venue[] = a.split("\\$");
                                    classroomTemp = new Classroom(time_venue[2]);
                                    if (!Application.classrooms.containsKey(classroomTemp.getClassroom_name())) {
                                        System.out.println("ADDING CLASSROOM: "+classroomTemp.getClassroom_name());
                                        Application.classrooms.put(classroomTemp.getClassroom_name(), classroomTemp);
                                    }
                                    Date start = formatter.parse(time_venue[1].split("-")[0]);
                                    Date end = formatter.parse(time_venue[1].split("-")[1]);
                                    temp = new Class(info[2], classroomTemp,
                                            start,
                                            end);
                                    switch (time_venue[0].replaceAll(" ", "")) {
                                        case "Monday": {
                                            Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[0].get("Monday").add(new Slot(start, end));
                                            Monday_TimeTable.add(temp);
                                            break;
                                        }
                                        case "Tuesday": {
                                            Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[1].get("Tuesday").add(new Slot(start, end));
                                            Tuesday_TimeTable.add(temp);
                                            break;
                                        }
                                        case "Wednesday": {
                                            Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[2].get("Wednesday").add(new Slot(start, end));
                                            Wednesday_TimeTable.add(temp);
                                            break;
                                        }
                                        case "Thursday": {
                                            Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[3].get("Thursday").add(new Slot(start, end));
                                            Thursday_TimeTable.add(temp);
                                            break;
                                        }
                                        case "Friday": {
                                            Application.classrooms.get(classroomTemp.getClassroom_name()).bookings[4].get("Friday").add(new Slot(start, end));
                                            Friday_TimeTable.add(temp);
                                            break;
                                        }
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

    public void showTimetable() {
        courseMap.forEach((k, v) -> {
                    System.out.println(k + " " + v.toString() + "\n\n");
                }
        );

        System.out.println("classes timetable:\n");

        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 1: {
                    System.out.println("MONDAY:\n");
                    for (Class a : getMonday_TimeTable()) {
                        System.out.println(a.toString() + "\n");
                    }
                    break;
                }
                case 2: {
                    System.out.println("TUESDAY:\n");

                    for (Class a : getTuesday_TimeTable()) {
                        System.out.println(a.toString() + "\n");
                    }
                    break;
                }
                case 3: {
                    System.out.println("WEDNESDAY:\n");
                    for (Class a : getWednesday_TimeTable()) {
                        System.out.println(a.toString() + "\n");
                    }
                    break;
                }
                case 4: {
                    System.out.println("THURSDAY:\n");

                    for (Class a : getThursday_TimeTable()) {
                        System.out.println(a.toString() + "\n");
                    }
                    break;
                }
                case 5: {
                    System.out.println("FRIDAY:\n");

                    for (Class a : getFriday_TimeTable()) {
                        System.out.println(a.toString() + "\n");
                    }
                    break;
                }
            }
        }
    }


}
