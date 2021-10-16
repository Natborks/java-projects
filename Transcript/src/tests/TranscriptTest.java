package tests;

import models.Transcript;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TranscriptTest {

    private Transcript transcript;

    @Before
    public void setup(){
        transcript = new Transcript("Davide", 216);
    }

    @Test
    public void testAddGrade(){
        String course = "Math";
        double grade = 1.0;
        //add course and grade
        transcript.addGrade(course, grade);
        //determine if transcript contains course and grade
        assertTrue(transcript.getCourses().contains(course));
        int courseIndex = transcript.getCourses().indexOf(course);
        double transcriptGrade = transcript.getGrades().get(courseIndex);
        assertEquals(transcriptGrade, grade, 0.0);
    }


    @Test
    public void testGetCourseAndGrade(){
        String course = "Math";
        double grade = 1.0;
        //add course and grade
        transcript.addGrade(course, grade);
        //get course info for added course
        String courseGradeInfo = transcript.getCourseAndGrade(course);
        //check returned info format
        assertEquals(courseGradeInfo, course + " : " + grade);
    }

    @Test
    public void testGeCourseAndGradeForCourseNotInTranscript(){
        String course = "English";
        double grade = 1.0;

        String courseGradeInfo = transcript.getCourseAndGrade(course);

        assertEquals(courseGradeInfo, "Course not yet added to transcript");
    }

    @Test
    public void testGetGPA(){
        String course = "Math";
        double grade = 1;
        String course1 = "English";
        double grade1 = 2;

        transcript.addGrade(course, grade);
        transcript.addGrade(course1, grade1);

        double gpa = transcript.getGPA();

        assertEquals(1.5, gpa, 0.0);
    }

    @Test
    public void testGetGPAForThreeCourses(){
        String course = "Math";
        double grade = 1;
        String course1 = "English";
        double grade1 = 2;
        String course2 = "Science";
        double grade2 = 3;

        transcript.addGrade(course, grade);
        transcript.addGrade(course1, grade1);
        transcript.addGrade(course2, grade2);

        double gpa = transcript.getGPA();

        assertEquals(2, gpa, 0.0);
    }

    @Test
    public void testGetGPAForEmptyTranscript(){
        double gpa = transcript.getGPA();

        assertEquals(0.0, gpa, 0.0);
    }
}
