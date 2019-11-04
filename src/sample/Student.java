package sample;

import java.util.Vector;

public class Student extends User {
    private int collegeYear;
    private double monthlyPayment;
    private Vector<Integer> attendingCourses;
    private Vector<Integer> finishedCourses;
    private double average;


    public Student(int id,String name, String email) {
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.collegeYear = 0;
        this.monthlyPayment = 0;
        attendingCourses = new Vector<>();
        finishedCourses = new Vector<>();
    }

    public int getCollegeYear() {
        return collegeYear;
    }
    public void setCollegeYear(int collegeYear) {
        this.collegeYear = collegeYear;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Vector<Integer> getAttendingCourses() {
        return attendingCourses;
    }
    public void setAttendingCourses(Vector<Integer> attendingCourses) {
        this.attendingCourses = attendingCourses;
    }

    public double getAverage() { return average; }
    public void setAverage(double average) { this.average = average; }

    public Vector<Integer> getFinishedCourses() { return finishedCourses; }
    public void setFinished_Courses(Vector<Integer> finishedCourses) { this.finishedCourses = finishedCourses; }
}
