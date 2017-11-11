package main;
public class Course {
    String name;
    String course_ID;
    String type;
    String course_acronym;
    String instructor_name;
    int credits;
    private String prerequisite;
    private String postconditions;
    private int inteded_audience;

    public Course(String type, String name, String code, String instructor, int creds, String course_acronym, String course_prerequisite, String course_postconditions) {
        this.prerequisite = course_prerequisite;
        this.name = name;
        this.course_ID = code;
        this.credits = creds;
        this.postconditions = course_postconditions;
        this.type = type;
        this.instructor_name = instructor;
        this.course_acronym = course_acronym;
    }

    /*public Course(String line, String name2, String pre, String desc, int i, int j) {
		// TODO Auto-generated constructor stub
    	this.name = line;
    	this.course_ID = name2;
    	this.prerequisite=pre;
    	this.postconditions=desc;
    	this.credits=j;
    	this.inteded_audience= i;
	}
*/
	public String toString() {
        return    "type: "+this.type
                + "\ninstructor:" + this.instructor_name
                + "\nacronym:" + this.course_acronym
                + "\ncourse_id:" + this.course_ID
                + "\nName:" + this.name
                + "\nPre-req:" + this.prerequisite
                + "\nPost: " + this.postconditions;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse_ID() {
		return course_ID;
	}

	public void setCourse_ID(String course_ID) {
		this.course_ID = course_ID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCourse_acronym() {
		return course_acronym;
	}

	public void setCourse_acronym(String course_acronym) {
		this.course_acronym = course_acronym;
	}

	public String getInstructor_name() {
		return instructor_name;
	}

	public void setInstructor_name(String instructor_name) {
		this.instructor_name = instructor_name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(String prerequisite) {
		this.prerequisite = prerequisite;
	}

	public String getPostconditions() {
		return postconditions;
	}

	public void setPostconditions(String postconditions) {
		this.postconditions = postconditions;
	}

	public int getInteded_audience() {
		return inteded_audience;
	}

	public void setInteded_audience(int inteded_audience) {
		this.inteded_audience = inteded_audience;
	}


   
}
