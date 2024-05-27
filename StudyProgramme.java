public class StudyProgramme {
    private String name;
    private String description;
    private int courseDuration;
    private int allowedITNs;

    public StudyProgramme(String name, String description, int courseDuration, int allowedITNs) {
        this.name = name;
        this.description = description;
        this.courseDuration = this.courseDuration;
        this.allowedITNs = allowedITNs;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public int getAllowedITNs() {
        return allowedITNs;
    }

    public void setAllowedITNs(int allowedITNs) {
        this.allowedITNs = allowedITNs;
    }

}

