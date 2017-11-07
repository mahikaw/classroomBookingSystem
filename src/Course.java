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

    public String toString() {
        return    "type: "+this.type
                + "\ninstructor:" + this.instructor_name
                + "\nacronym:" + this.course_acronym
                + "\ncourse_id:" + this.course_ID
                + "\nName:" + this.name
                + "\nPre-req:" + this.prerequisite
                + "\nPost: " + this.postconditions;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public String getPostconditions() {
        return postconditions;
    }


    public int getInteded_audience() {
        return inteded_audience;
    }
}
