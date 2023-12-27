public class Student {
    private String studentName;
    private String collegeName;

    // Constructor
    public Student(String studentName, String collegeName) {
        this.studentName = studentName;
        this.collegeName = collegeName;
    }

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Setter for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter for collegeName
    public String getCollegeName() {
        return collegeName;
    }

    // Setter for collegeName
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}