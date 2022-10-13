package BuilderPattern.builders;
import BuilderPattern.components.*;

import java.lang.String;
import java.util.List;
public interface CourseBuilder {

	public void setMandatoryFields(MandatoryFields mandatoryFields);

	public void setCollegeType(CollegeType collegeType);

	private void setCourseID(String courseID){

	}

	private void setCourseName(String courseName){

	}

	private void setCourseDuration(String courseDuration){

	}

	private void setDepartment(String courseDepartment){

	}

	public void setCourseDescription(String courseDescription);

	public void setInstructor(Instructor instructor);

	public void setClassWebsite(Website website);

	public void setOfficeHours(String officeHours);

	public void setSlackChannel(SlackChannel slackChannel);

	public void addTeachingAssistants(TeachingAssistant ta);

	public void setTeachingAssistant();

	public void addGraders(GraderAssistant ga);

	public void setGradingAssistant();

	public void setExamDates(String examDate);

	public void setGradeWeightage(Grade gradeWeight);

	private void setAssignmentsWeightage(int assignment){

	}

	private void setQuizWeightage(int quiz){

	}

	private void setMidTermWeightage(int midTerm){

	}

	private void setPresentationWeightage(int presentation){

	}

	private void setFinalExamWeightage(int finalExam){

	}

	public abstract void setAbsencePolicies(AbsencePolicy policy);

	public abstract void setBooksAndReferences(BooksAndReferences material);

	public abstract void setCourseSchedule(List<Schedule> schedule);

	public abstract void setGeneralRules(Rules rules);

	public abstract void setAcademyIntegrity(Integrity academicIntegrity);

}
