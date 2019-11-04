package sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;


public class CollegeTest {
    private College college;

    @org.junit.Before
    public void setUp() throws Exception {
        college = new College("AfekaTest");
    }

    @Test
    public void testCreate5StudentsAndAddToCourse(){
        Course math = new Course(10010,"math",5,"a","08:00-12:00",new String[]{"Sunday", "Monday"});
        college.addCourse(math);
        List<Student> studentList = IntStream.range(1,6)
                .mapToObj(num->new Student(num,"Student #" + num,num+"@afeka.ac.il"))
                .peek(student->college.addStudent(student))
                .collect(Collectors.toList());
        for (Student s : studentList){
            college.registerStudentToCourse(s,math);
        }
        List<Integer> studentsId = new ArrayList<>();
        for (Student s : studentList){
            studentsId.add(s.getId());
        }

        List<Integer>studentInMath = college.getAllCourses().get(math.getCourseId()).getRegisteredStudents();
        assertThat(studentsId)
                .containsExactlyInAnyOrderElementsOf(studentInMath);
    }

    @Test
    public void testAssignAndUpdateLecturerToExistedCourse(){
        Course math = new Course(10010,"math",5,"a","08:00-12:00",new String[]{"Sunday", "Monday"});
        college.addCourse(math);
        Lecturer lecturer1 = new Lecturer(7,"boris","boris@afeka.ac.il",150000);
        Lecturer lecturer2 = new Lecturer(10,"avner","avner@afeka.ac.il",150000);
        college.addLecturer(lecturer1);
        college.addLecturer(lecturer2);
        college.assignLecturerToCourse(lecturer1,math);

        college.assignLecturerToCourse(lecturer2,math);

        assertThat(math.getLecturer()).isEqualTo(lecturer2.getId());
        assertThat(lecturer2.getAttendingCourses()).contains(math.getCourseId());
        assertThat(lecturer1.getAttendingCourses()).doesNotContain(math.getCourseId());
    }


    @After
    public void tearDown() throws Exception {
    }
}