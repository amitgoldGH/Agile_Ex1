package sample;

import java.util.Vector;

public class Lecturer extends User {
    private Vector<Course> attending_Courses;
    private double salary;

    public Lecturer(String name, String email, double salary) {
        this.setName(name);
        this.setEmail(email);
        this.salary = salary;
        attending_Courses = new Vector<Course>();
    }

    public Vector<Course> getAttending_Courses() { return attending_Courses; }
    public void setAttending_Courses(Vector<Course> attending_Courses) { this.attending_Courses = attending_Courses; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { salary = salary; }
}
