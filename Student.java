import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String address;
    private String indexNumber;
    private String studyProgramme;
    private int currentSemester;
    private int courseDuration;
    private ArrayList<String> grades;



    public Student(String firstName, String lastName, String dateOfBirth, String email, String address, Date indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.indexNumber = "s"+ indexNumber;
    }



    public String getStatus() {
        if(currentSemester == 0) {
            return "Kandydat";
        }
        else if(currentSemester>=1 && currentSemester <= courseDuration) {
            return "Obecny student uczelni";
        }else {
            return "Absolwent";
        }
    }

    public void enrollStudent(StudyProgramme studyProgramme){
        this.studyProgramme = String.valueOf(studyProgramme);
        this.currentSemester = 1;
    }

    public void addGrade(int grade, String subject){
        grades.add(grade+", "+subject);
    }

    public void promoteToNextSemester(int currentSemester){
        if (currentSemester < courseDuration) {
            currentSemester++;
        }else{
            currentSemester=8;
            System.out.println("Student został absolwentem");
        }
    }

}
