package sample;

import java.util.Vector;

public class Lecturer {
    private String name;
    private Vector<Course> attending_Courses;
    private double salary;

    public Lecturer(String name, double salary) {
        this.name = name;
        this.salary = salary;
        attending_Courses = new Vector<Course>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Vector<Course> getAttending_Courses() { return attending_Courses; }
    public void setAttending_Courses(Vector<Course> attending_Courses) { this.attending_Courses = attending_Courses; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { salary = salary; }
}
