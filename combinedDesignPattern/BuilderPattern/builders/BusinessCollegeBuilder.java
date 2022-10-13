package BuilderPattern.builders;
import BuilderPattern.components.*;
import BuilderPattern.schools.*;


import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class BusinessCollegeBuilder implements CourseBuilder {

	private CollegeType collegeType;
	private MandatoryFields mandatoryFields;
	private String courseID;
	private String courseName;
	private String courseDuration;
	private String courseDepartment;
	private String courseDescription;
	private Instructor instructor;
	private Website website;
	private String officeHours;
	private SlackChannel slackChannel;
	private List<TeachingAssistant> ta;
	private List<GraderAssistant> ga;
	private String examDate;
	private Grade gradeWeightage;
	private AbsencePolicy absencePolicy;
	private BooksAndReferences booksAndReferences;
	private List<Schedule> schedule;
	private Rules rules;
	private Integrity academicIntegrity;

	public void setCollegeType(CollegeType collegeType){
		this.collegeType = collegeType;
	}

	public void setMandatoryFields(MandatoryFields mandatoryFields){
		this.mandatoryFields = mandatoryFields;
		this.setCourseID(mandatoryFields.courseID);
		this.setCourseName(mandatoryFields.courseName);
		this.setCourseDuration(mandatoryFields.courseDuration);
		this.setDepartment(mandatoryFields.courseDepartment);
		this.setCourseDescription(mandatoryFields.courseDescription);
	}

	private void setCourseID(String courseID){
		this.courseID = courseID;
	}

	private void setCourseName(String courseName){
		this.courseName = courseName;
	}

	private void setCourseDuration(String courseDuration){
		this.courseDuration = courseDuration;
	}

	private void setDepartment(String courseDepartment){
		this.courseDepartment = courseDepartment;
	}

	public void setCourseDescription(String courseDescription){
		this.courseDescription = courseDescription;
	}

	public void setInstructor(Instructor instructor){
		this.instructor = instructor;
	}

	public void setClassWebsite(Website website){
		this.website = website;
	}

	public void setOfficeHours(String officeHours){
		this.officeHours = officeHours;
	}

	public void setSlackChannel(SlackChannel slackChannel){
		this.slackChannel = slackChannel;
	}

	public void addTeachingAssistants(TeachingAssistant ta){
		if(this.ta != null)
			this.ta.add(ta);
	}

	public void setTeachingAssistant() {
		if(this.ta == null)
			this.ta = new ArrayList<>();
	}

	public void addGraders(GraderAssistant ga){
		if(this.ga != null)
			this.ga.add(ga);
	}

	public void setGradingAssistant() {
		if(this.ga == null)
			this.ga = new ArrayList<>();
	}

	public void setExamDates(String examDate){
		this.examDate = examDate;
	}

	public void setGradeWeightage(Grade gradeWeight){
		this.gradeWeightage = gradeWeight;
	}

	private void setAssignmentsWeightage(int assignment){
		this.gradeWeightage.setAssignment(assignment);

	}

	private void setQuizWeightage(int quiz){
		this.gradeWeightage.setQuiz(quiz);
	}

	private void setMidTermWeightage(int midTerm){
		this.gradeWeightage.setMidTerm(midTerm);
	}

	private void setPresentationWeightage(int presentation){
		this.gradeWeightage.setPresentation(presentation);
	}

	private void setFinalExamWeightage(int finalExam){
		this.gradeWeightage.setFinalExam(finalExam);
	}

	public void setAbsencePolicies(AbsencePolicy policy){
		this.absencePolicy = policy;
	}

	public void setBooksAndReferences(BooksAndReferences booksAndReferences){
		this.booksAndReferences = booksAndReferences;
	}

	public void setCourseSchedule(List<Schedule> schedule){
		this.schedule = schedule;
	}

	public void setGeneralRules(Rules rules){
		this.rules = rules;
	}

	public void setAcademyIntegrity(Integrity academicIntegrity) {
		this.academicIntegrity = academicIntegrity;
	}

	public BusinessSchool getCourse(){
		return new BusinessSchool(collegeType, mandatoryFields, instructor, website, officeHours, slackChannel, ta, ga, examDate, gradeWeightage, absencePolicy, booksAndReferences, schedule, rules, academicIntegrity);
	}
}
