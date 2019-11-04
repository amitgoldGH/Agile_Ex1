package sample;

import java.util.Vector;

public class Lecturer extends User {

    private int seniority;
    private double salary;
    private Vector<Integer> attendingCourses;

    public Lecturer(int id, String name, String email, double salary) {
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.salary = salary;
        this.seniority=0;
        attendingCourses = new Vector<>();
    }

    public int getSeniority() {
        return seniority;
    }
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public Vector<Integer> getAttendingCourses() {
        return attendingCourses;
    }
    public void setAttendingCourses(Vector<Integer> attendingCourses) {
        this.attendingCourses = attendingCourses;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
