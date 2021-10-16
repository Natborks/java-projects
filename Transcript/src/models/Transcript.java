package models;

import java.util.ArrayList;
import java.util.List;

public class Transcript {
    /**
     * INVARIANT: course list and grade list are the same size
     * each course has a grade associated, and vice versa, at matching indices
     */

    private String studentName;
    private int studentID;
    private List<String> courses;
    private List<Double> grades;

    public Transcript(String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    //Getter
    public String getStudentName() {
        return studentName;
    }

    //MODIFIES: this
    //EFFECTS: Add course and grade to transcript
    public void addGrade(String course, double grade){
        courses.add(course);
        grades.add(grade);
    }

    //EFFECTS: Return course and grade information for a given course
    public String getCourseAndGrade(String course){
        double grade;
        if(courses.contains(course)){
            int courseIndex = courses.indexOf(course);
            grade = grades.get(courseIndex);
            return course + " : " + grade;
        }

        return "Course not yet added to transcript";
    }

    //EFFECTS: Prints every course and grade in the transcript
    public void printTranscript(){ }

    //EFFECTS: Return the GPA
    public double getGPA(){
        if (grades.size() == 0)
            return 0;
        int count = 0;
        double total = 0;

        for (Double grade : grades) {
            total = total + grade;
            count++;
        }

        return  total / count;
    }

    public List<String> getCourses() {
        return courses;
    }

    public List<Double> getGrades() {
        return grades;
    }
}
