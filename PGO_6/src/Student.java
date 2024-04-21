import java.time.LocalDate;
import java.util.*;

class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String indexNumber;
    private String status;
    private StudyProgramme currentStudyProgramme;
    private int currentSemester;
    private Map<String, Integer> grades;

    private static List<String> indexNumbers = new ArrayList<>();

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = generateIndexNumber();
        this.status = "kandydat";
        this.currentSemester = 1;
        this.grades = new HashMap<>();
    }

    private String generateIndexNumber() {
        String newIndexNumber;
        do {
            newIndexNumber = "s" + (new Random().nextInt(1000) + 1);
        } while (indexNumbers.contains(newIndexNumber));
        indexNumbers.add(newIndexNumber);
        return newIndexNumber;
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.currentStudyProgramme = studyProgramme;
        this.status = "student"; // zmiana statusu na "student" po zapisaniu na studia
    }

    public void addGrade(int grade, String courseName) {
        grades.put(courseName, grade);
    }

    public void promoteToNextSemester() {
        if (currentSemester < currentStudyProgramme.getNumberOfSemesters() && currentSemester < currentStudyProgramme.getMaxITN()) {
            currentSemester++;
        } else {
            status = "absolwent";
        }
    }

    // Getters i setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getStatus() {
        return status;
    }

    public StudyProgramme getCurrentStudyProgramme() {
        return currentStudyProgramme;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}