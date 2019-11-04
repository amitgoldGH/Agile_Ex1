package sample;
import java.util.Vector;

public class Course {
    private String name;
    private int courseId;

    private String semester;
    private int lecturer;
    private Vector<Integer> registeredStudents;

    private int points;
    private String hours;
    private Vector<String> days;

    public Course(int courseId, String name, int points, String semester, String hours, String[] days){
        this.courseId = courseId;
        this.name = name;
        this.points = points;
        this.semester = semester;
        this.hours = hours;
        this.days = new Vector<>();
        for (String d : days) {
            this.days.add(d);
        }
        registeredStudents = new Vector<>();
        this.lecturer = -1;
    }

    @Override
    public String toString() {
        String res = "Course: " + name + ", points: " + points + ", Semester: " + semester + "\nDays: ";
        for (String d : days)
            res += d + ",";

        res += " Hours: " + hours + ", Lecturer: " + lecturer + "\n";
        res += "Students id list: \n";
        for (int s : registeredStudents)
            res += s + ", ";
        res += "\n";
        return res;
    }

    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }
    public String getHours() { return hours; }
    public void setHours(String hours) { this.hours = hours; }
    public Vector<String> getDays() { return days; }
    public void setDays(Vector<String> days) { this.days = days; }
    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
    public Vector<Integer> getRegisteredStudents() { return registeredStudents; }
    public void setRegisteredStudents(Vector<Integer> registeredStudents) { this.registeredStudents = registeredStudents; }
    public int getLecturer() { return lecturer; }
    public void setLecturer(int lecturer) { this.lecturer = lecturer; }
}
