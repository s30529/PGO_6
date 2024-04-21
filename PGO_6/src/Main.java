import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", LocalDate.of(1980, 1, 1));
        StudyProgramme it = new StudyProgramme("Informatyka", "Opis programu", 7, 5);
        s.enrollStudent(it);
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");
        Students.addStudent(s);
        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();
    }
}