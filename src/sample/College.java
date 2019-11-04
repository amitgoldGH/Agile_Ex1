package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class College {
    private final int costPerPoint = 300;
    private String collegeName;
    private Map<Integer,Course> allCourses;
    private Map<Integer,Student> allStudents;
    private Map<Integer,Lecturer> allLecturers;
    private Principle principle;

    public College(String name) {
        this.collegeName = name;
        this.allCourses = new HashMap<>();
        this.allStudents = new HashMap<>();
        this.allLecturers = new HashMap<>();
        this.principle = null;
    }
/*
    public int getRevenue(Object initiator) {
        if (initiator instanceof Principle) {
            int revenue = 0;
            for (Course c : allCourses)
                revenue += c.getPoints() * c.getRegisteredStudents().size() * costPerPoint;
            return revenue;
        }
        else {
            System.out.println("Calling object lacks permission.");
            return -1;
        }
    }
  */
    public void addLecturer(Lecturer lecturer) {
        if (lecturer != null){
            if(!allLecturers.containsKey(lecturer.getId())) {
                allLecturers.put(lecturer.getId(), lecturer);
                System.out.println(lecturer.getName() + " has been added.");
            }
            else{
                System.out.println(lecturer.getName() +" already exists.");
            }
        }
    }

    public void addStudent(Student student) {
        if (student != null){
            if(!allStudents.containsKey(student.getId())) {
                allStudents.put(student.getId(), student);
                System.out.println(student.getName() +" has been added.");
            }
            else{
                System.out.println(student.getName() +" already exists.");
            }
        }
    }

    public void addCourse(Course course) {
        if (course != null) {
            if (!allCourses.containsKey(course.getCourseId())) {
                allCourses.put(course.getCourseId(), course);
                System.out.println(course.getName() + " has been added.");
            } else {
                System.out.println(course.getName() + " already exists.");
            }
        }
    }

    public void registerStudentToCourse(Student student, Course course) {
        if (student != null && course != null) {
            int studentId = student.getId();
            int courseId = course.getCourseId();
            if (allCourses.containsKey(courseId)) {
                if (allCourses.get(courseId).getRegisteredStudents().contains(studentId)) {
                    System.out.println(allStudents.get(studentId).getName() + " Is already registered to " + allCourses.get(courseId).getName());
                } else {
                    allCourses.get(courseId).getRegisteredStudents().add(studentId);
                   allStudents.get(studentId).getAttendingCourses().add(courseId);
                    System.out.println(allStudents.get(studentId).getName() + " Has been registered to " + allCourses.get(courseId).getName());
                }
            }
        }
    }

    public void assignLecturerToCourse(Lecturer lecturer, Course course) {
        if (lecturer != null && course != null) {
            int lecturerId = lecturer.getId();
            int courseId = course.getCourseId();
            if (lecturerId == allCourses.get(courseId).getLecturer()) {
                System.out.println(allLecturers.get(lecturerId).getName() + " Is already assigned to " + allCourses.get(courseId).getName());
            }
            else {
                if (allCourses.get(courseId).getLecturer() != -1) {
                    allLecturers.get(allCourses.get(courseId).getLecturer()).getAttendingCourses().removeElement(course.getCourseId());
                    System.out.println(allLecturers.get(allCourses.get(courseId).getLecturer()).getName() + " Has been unassigned from " + allCourses.get(courseId).getName());
                }
                allCourses.get(courseId).setLecturer(lecturerId);
                allLecturers.get(lecturerId).getAttendingCourses().add(courseId);
                System.out.println(allLecturers.get(lecturerId).getName() + " Has been assigned to " + allCourses.get(courseId).getName());
            }
        }

    }


    public void show_All_Courses() {
        System.out.println("**show_All_Courses**");
        for (Map.Entry<Integer,Course> c :allCourses.entrySet())
            System.out.println(c.getValue().toString());
    }

//    public void show_All_Lecturer() {
//        for (Course c : all_Courses)
//            System.out.println(c.toString());
//    }

     public String getAllLectureName() {
        Vector<String> lecturerName = new Vector();
        for (Map.Entry<Integer,Lecturer> l : allLecturers.entrySet()) {
            lecturerName.add(l.getValue().getName());
        }
        return lecturerName.toString();
    }



    public String getAllStudentName() {
        Vector<String> studentName = new Vector();
        for (Map.Entry<Integer,Student> s : allStudents.entrySet()) {
            studentName.add(s.getValue().getName());
        }
        return studentName.toString();
    }






    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String college_Name) { this.collegeName = college_Name; }

    public Map<Integer,Course> getAllCourses() { return allCourses; }
    public void setAllCourses(Map<Integer,Course> allCourses) { this.allCourses = allCourses; }

    public Map<Integer,Student> getAllStudents() {
        return allStudents;
    }
    public void setAllStudents(Map<Integer,Student> allStudents) {
        this.allStudents = allStudents;
    }

    public Map<Integer,Lecturer> getAllLecturers() {
        return allLecturers;
    }
    public void setAllLecturers(Map<Integer,Lecturer> allLecturers) {
        this.allLecturers = allLecturers;
    }

    public Principle getPrinciple() {
        return principle;
    }
    public void setPrinciple(Principle principle) {
        this.principle = principle;
    }
}
