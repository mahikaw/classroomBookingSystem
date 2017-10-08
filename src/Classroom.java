public class Classroom {
    private String classroom_name;
    private boolean isoccupied =false;
    private int totalcapacity;
    public Classroom(String name,int capacity){
           this.classroom_name=name;
           this.totalcapacity=capacity;
    }

    public String getClassroom_name() {
        return classroom_name;
    }

    public boolean isIsoccupied() {
        return isoccupied;
    }

    public int getTotalcapacity() {
        return totalcapacity;
    }
}
