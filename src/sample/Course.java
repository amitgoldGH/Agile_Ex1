package sample;
import java.util.Vector;

public class Course {
    private String name;
    private int points;
    private String hours;
    private Vector<String> days;
    private String semester;
    private Vector<Student> registered_Students;
    private Lecturer lecturer;

    public Course(String name, int points, String semester, String hours, String[] days){
        this.name = name;
        this.points = points;
        this.semester = semester;
        this.hours = hours;
        this.days = new Vector<>();
        for (String d : days) {
            this.days.add(d);
        }
        registered_Students = new Vector<>();
        this.lecturer = null;
    }

    public void register_Student(Student student) {
        if (student != null) {
            if (registered_Students.contains(student)) {
                System.out.println(student.getName() + " Is already registered to " + this.name);
            } else {
                this.registered_Students.add(student);
                student.getAttending_Courses().add(this);
                System.out.println(student.getName() + " Has been registered to " + this.name);
            }
        }
    }
    public void assign_Lecturer(Lecturer lecturer) {
        if (lecturer != null) {
            if (lecturer == this.lecturer) {
                System.out.println(lecturer.getName() + " Is already assigned to " + this.name);
            }
            else {
                if (this.lecturer != null) {
                    this.lecturer.getAttending_Courses().remove(this);
                    System.out.println(this.lecturer.getName() + " Has been unassigned from " + this.name);
                }
                this.lecturer = lecturer;
                lecturer.getAttending_Courses().add(this);
                System.out.println(this.lecturer.getName() + " Has been assigned to " + this.name);

            }
        }

    }
    @Override
    public String toString() {
        String res = "Course: " + name + ", points: " + points + ", Semester: " + semester + "\nDays: ";
        for (String d : days)
            res += d + ",";

        res += " Hours: " + hours + ", Lecturer: " + ((lecturer != null) ? lecturer.getName() : "None") + "\n";
        res += "Students: \n";
        for (Student s : registered_Students)
            res += s.getName() + ", ";

        return res;
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
    public Vector<Student> getRegistered_Students() { return registered_Students; }
    public void setRegistered_Students(Vector<Student> registered_Students) { this.registered_Students = registered_Students; }
    public Lecturer getLecturer() { return lecturer; }
    public void setLecturer(Lecturer lecturer) { this.lecturer = lecturer; }
}
