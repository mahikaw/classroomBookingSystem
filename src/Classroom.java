public class Classroom {
    private String classroom_name;
    private boolean isoccupied = false;
    private int totalcapacity;

    public Classroom(String name, int capacity) {
        this.classroom_name = name;
        this.totalcapacity = capacity;
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
