package main;

public class Classes {
    String course_ID;
    String venues;
    Classroom venue;
    String start_time;
    String end_time;
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

    
    public Classes(String course_ID,String venue,String mon,String tues,String wed,String thu,String fri){
    	this.course_ID=course_ID;
    	this.venues=venue;
    	this.monday=mon;
    	this.tuesday=tues;
    	this.wednesday=wed;
    	this.thursday=thu;
    	this.friday = fri;
    }
    public String getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(String course_ID) {
        this.course_ID = course_ID;
    }



    
	@Override
	public String toString() {
		return "Class [course_ID=" + course_ID + ", venues=" + venues + ", monday=" + monday + ", tuesday=" + tuesday
				+ ", wednesday=" + wednesday + ", thursday=" + thursday + ", friday=" + friday + "]";
	}
	public Classroom getVenue() {
        return venue;
    }

    public void setVenue(Classroom venue) {
        this.venue = venue;
    }
}