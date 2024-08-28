import java.util.HashMap;

public class StudentRegister {

    private HashMap<Integer, Student> studentMap = new HashMap<>();

    public StudentRegister() {
        studentMap = new HashMap<>();
    }

    public void addStudent(Student student) { 
        studentMap.put(student.getStudentID(), student);
    }

    public Student getStudentByID(Integer studentID) {
        return studentMap.get(studentID);
    }

}