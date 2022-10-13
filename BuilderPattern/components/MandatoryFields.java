package components;


public class MandatoryFields {
    public String courseID;
    public String courseName;
    public String courseDuration;
    public String courseDepartment;
    public String courseDescription;

    public MandatoryFields(String courseID, String courseName, String courseDuration, String courseDepartment, String courseDescription){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseDepartment = courseDepartment;
        this.courseDescription = courseDescription;
    }
}
