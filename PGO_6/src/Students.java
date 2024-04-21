import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Students {
    private static List<Student> students = new ArrayList<>();

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : students) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println("Imię: " + student.getFirstName());
            System.out.println("Nazwisko: " + student.getLastName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Adres: " + student.getAddress());
            System.out.println("Numer telefonu: " + student.getPhoneNumber());
            System.out.println("Data urodzenia: " + student.getDateOfBirth());
            System.out.println("Numer indeksu: " + student.getIndexNumber());
            System.out.println("Status: " + student.getStatus());
            System.out.println("Aktualny semestr: " + student.getCurrentSemester());
            System.out.println("Program studiów: " + student.getCurrentStudyProgramme().getName());
            System.out.println("Opis programu studiów: " + student.getCurrentStudyProgramme().getDescription());
            System.out.println("Oceny:");
            for (Map.Entry<String, Integer> entry : student.getGrades().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("--------------------------------------------");
        }
    }
}