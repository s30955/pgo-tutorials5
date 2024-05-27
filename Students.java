import java.util.ArrayList;

public class Students extends Student {
    private static final ArrayList<Student> studentList;

    public Students(ArrayList<Student> studentList) {
        super();
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void promoteAllStudents() {
        for (Student student : studentList) {
            student.promoteToNextSemester();
        }
    }

}
