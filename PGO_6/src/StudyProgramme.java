class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int maxITN;

    public StudyProgramme(String name, String description, int numberOfSemesters, int maxITN) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.maxITN = maxITN;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public int getMaxITN() {
        return maxITN;
    }
}