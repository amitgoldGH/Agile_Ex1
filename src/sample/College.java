package sample;

import java.util.Vector;

public class College {
    private final int cost_Per_Point = 300;
    private String college_Name;
    private Vector<Course> all_Courses;
    private Vector<Student> all_Students;
    private Vector<Lecturer> all_Lecturers;
    private Principle principle;


    public College(String name) {
        this.college_Name = name;
        this.all_Courses = new Vector<Course>();
        this.all_Students = new Vector<Student>();
        this.all_Lecturers = new Vector<Lecturer>();
        this.principle = null;
    }

    public int get_Revenue(Object initiator) {
        if (initiator instanceof Principle) {
            int revenue = 0;
            for (Course c : all_Courses)
                revenue += c.getPoints() * c.getRegistered_Students().size() * cost_Per_Point;
            return revenue;
        }
        else {
            System.out.println("Calling object lacks permission.");
            return -1;
        }
    }
    public void add_Lecturer(Lecturer lecturer) {
        if (!(this.all_Lecturers.contains(lecturer)) && lecturer != null) {
            this.all_Lecturers.add(lecturer);
        }
    }
    public void add_Student(Student student) {
        if (!(this.all_Students.contains(student)) && student != null)
            this.all_Students.add(student);
    }
    public void add_Course(Course course) {
        if (course != null) {
            if (!(all_Courses.contains(course))) {
                all_Courses.add(course);
                System.out.println((course.getName() + " Was added to " + this.getCollege_Name() + " College."));
            }
        }
    }
    public void register_Student_To_Course(Student student, Course course) {
        if (student != null && course != null) {
            if (all_Courses.contains(course)) {
                course.register_Student(student);
            }
        }
    }
    public void show_All_Courses() {
        for (Course c : all_Courses)
            System.out.println(c.toString());
    }

    public String getCollege_Name() { return college_Name; }
    public void setCollege_Name(String college_Name) { this.college_Name = college_Name; }

    public Vector<Course> getAll_Courses() { return all_Courses; }
    public void setAll_Courses(Vector<Course> all_Courses) { this.all_Courses = all_Courses; }

    public Vector<Student> getAll_Students() {
        return all_Students;
    }

    public void setAll_Students(Vector<Student> all_Students) {
        this.all_Students = all_Students;
    }

    public Vector<Lecturer> getAll_Lecturers() {
        return all_Lecturers;
    }

    public void setAll_Lecturers(Vector<Lecturer> all_Lecturers) {
        this.all_Lecturers = all_Lecturers;
    }

    public Principle getPrinciple() {
        return principle;
    }

    public void setPrinciple(Principle principle) {
        this.principle = principle;
    }
}
