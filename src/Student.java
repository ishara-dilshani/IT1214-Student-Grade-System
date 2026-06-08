public class Student {
    private String studentId;
    private String studentName;
    private double marks;

    // Constructor
    public Student(String studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMarks() {
        return marks;
    }

    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Display student info
    @Override
    public String toString() {
        return "ID: " + studentId + " | Name: " + studentName + " | Marks: " + marks;
    }
}