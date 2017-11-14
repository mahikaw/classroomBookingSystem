package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class timetable_student {
	public static HashMap<String,Class> Monday_TimeTable = new HashMap<>();
    public static HashMap<String,Class> Tuesday_TimeTable= new HashMap<>();
    public static HashMap<String,Class> Wednesday_TimeTable= new HashMap<>();
    public static HashMap<String,Class> Thursday_TimeTable= new HashMap<>();
    public static HashMap<String,Class> Friday_TimeTable= new HashMap<>();
    public static HashMap<String,Classes> Time_Table= new HashMap<>();
	public static void generate(){
    	if(Student.listofcourses.containsKey("CSE201")){
    		Time_Table.put("CSE201", new Classes("CSE201", "C21", "11:00-12:00"," ","11:00-12:00", "11:00-12:00", " "));
    		
    	}
    	if(Student.listofcourses.containsKey("CSE121")){
    		Time_Table.put("CSE121", new Classes("CSE121", "C21", " ","1:30-3:00"," ", " ", "11:30-1:00"));
    		
    	}
    	if(Student.listofcourses.containsKey("MTH2xx")){
    		Time_Table.put("MTH2xx", new Classes("MTH2xx", "C12", "10:00-11:00", " ", "10:00-11:00", " ", "9:30-10:30")); 		
    	}
    	if(Student.listofcourses.containsKey("CSE112")){
    		Time_Table.put("CSE112", new Classes("CSE112", "C21", " ", " ", "14:30-16:00", "16:00-17:30", " "));
    		
    	}
    	if(Student.listofcourses.containsKey("MTH203")){
    		Time_Table.put("MTH203", new Classes("MTH203", "C21", " ", "15:00-16:00", " ", "15:00-16:00", "15:00-16:00"));    		
    	}
    	if(Student.listofcourses.containsKey("ECE250")){
    		Time_Table.put("ECE250", new Classes("ECE250", "C21", " ", "11:00-12:00", " ", "14:00-15:00", "14:00-15:00"));    		
    	}
    	if(Student.listofcourses.containsKey("MTH2RA")){
    		Time_Table.put("MTH2RA", new Classes("MTH2RA", "C02"	, "15:00-16:00", "10:00-11:00", " ", "10:00-11:00", " "));    		
    	}
    	if(Student.listofcourses.containsKey("HSS2ES")){
    		Time_Table.put("HSS2ES", new Classes("HSS2ES", "C21", " ", "16:00-17:30", " ", "16:00-17:30", " "));    		
    	}
    	if(Student.listofcourses.containsKey("HSS2xx")){
    		Time_Table.put("HSS2xx", new Classes("HSS2XX", "C03", " ", "16:00-17:30", " ", "16:00-17:30", " "));
    		
    	}
    	if(Student.listofcourses.containsKey("HSS208")){
    		Time_Table.put("HSS208", new Classes("HSS208", "C22", " ", "16:00-17:30", " ", "16:00-17:30", " "));
    		
    	}
    	if(Student.listofcourses.containsKey("HSS2ISI")){
    		Time_Table.put("HSS2ISI", new Classes("HSS2ISI", "C13", " ", "16:00-17:30", " ", "16:00-17:30", " "));
    		
    	}
    	if(Student.listofcourses.containsKey("HSS2IDE")){
    		Time_Table.put("HSS2IDE", new Classes("HSS2IDE", "C11", "16:00=17:30", " "," "," ","16:00=17:30"));    		
    	}
    	if(Student.listofcourses.containsKey("HSS204")){
    		Time_Table.put("HSS204", new Classes("HSS204", "C01", "16:00=17:30", " "," "," ","16:00=17:30"));
    		
    	}
    	if(Student.listofcourses.containsKey("HSS202")){
    		Time_Table.put("HSS202", new Classes("HSS202", "C24", "16:00=17:30", " "," "," ","16:00=17:30"));
    		
    	}
    	if(Student.listofcourses.containsKey("HSS211")){
    		Time_Table.put("HSS211", new Classes("HSS211", "C12", "16:00=17:30", " "," "," ","16:00=17:30"));
    		
    	}
    	if(Student.listofcourses.containsKey("HSS223A")){
    		Time_Table.put("HSS223A", new Classes("HSS223A", "C02", " ", "16:30-18:00", " ", " ", " "));
    	}
    	
    		System.out.println(Time_Table);
    }
}
