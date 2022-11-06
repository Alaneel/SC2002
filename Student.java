/*
 * The student class models a student having courses and grades
 */

public class Student extends Person {
    // The private instance variables
    private String[] courses; // course codes
    private int[] grades; // grade for the corresponding course codes, valid range is [0, 100]
    private int numCourses; // Number of courses taken so far
    private static final int MAX_COURSES = 30; // Maximum number of courses taken by student

    // Constructs a Student instance with the given name and address
    public Student(String name, String address) {
        super(name, address);
        courses = new String[MAX_COURSES]; // allocate arrays
        grades = new int[MAX_COURSES];
        numCourses = 0; // no courses so far
    }
    
    // Returns a self-descriptive string
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    // Adds a course and grade - No input validation
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    // Prints all courses and their grades
    public void printGrades() {
        System.out.print(this);
        for (int i = 0; i< numCourses; ++i) {
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }

    // Computes the average grade
    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourses; ++i) {
            sum += grades[i];
        }
        return (double)sum / numCourses;
    }
}
