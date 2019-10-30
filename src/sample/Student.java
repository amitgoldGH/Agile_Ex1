package sample;

import java.util.Vector;

public class Student {
    private String name;
    private double average;
    private Vector<Course> attending_Courses;
    private Vector<Course> finished_Courses;

    public Student(String name) {
        this.name = name;
        attending_Courses = new Vector<Course>();
        finished_Courses = new Vector<Course>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getAverage() { return average; }
    public void setAverage(double average) { this.average = average; }

    public Vector<Course> getAttending_Courses() { return attending_Courses; }
    public void setAttending_Courses(Vector<Course> attending_Courses) { this.attending_Courses = attending_Courses; }

    public Vector<Course> getFinished_Courses() { return finished_Courses; }
    public void setFinished_Courses(Vector<Course> finished_Courses) { this.finished_Courses = finished_Courses; }
}
