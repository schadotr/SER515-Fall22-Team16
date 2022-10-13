package schools;

import builders.EngineeringCollegeBuilder;
import components.*;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class BusinessSchool {

	private CollegeType collegeType;
	private MandatoryFields mandatoryFields;
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

	public BusinessSchool(CollegeType collegeType, MandatoryFields mandatoryFields, Instructor instructor, Website website, String officeHours, SlackChannel slackChannel, List<TeachingAssistant> ta, List<GraderAssistant> ga, String examDate, Grade gradeWeightage, AbsencePolicy absencePolicy, BooksAndReferences booksAndReferences, List<Schedule> schedule, Rules rules, Integrity academicIntegrity){
		this.collegeType = collegeType;
		this.mandatoryFields = mandatoryFields;
		this.instructor = instructor;
		this.website = website;
		this.officeHours = officeHours;
		this.slackChannel = slackChannel;
		this.ta = ta;
		this.ga = ga;
		this.examDate = examDate;
		this.gradeWeightage = gradeWeightage;
		this.booksAndReferences = booksAndReferences;
		this.absencePolicy = absencePolicy;
		this.booksAndReferences = booksAndReferences;
		this.schedule = schedule;
		this.rules = rules;
		this.academicIntegrity = academicIntegrity;
	}

	public CollegeType getCollege() {
		return this.collegeType;
	}

	public String getCourseID() {
		return this.mandatoryFields.courseID;
	}

	public String getCourseName() {
		return this.mandatoryFields.courseName;
	}

	public String getCourseDuration() {
		return this.mandatoryFields.courseDuration;
	}

	public String getCourseDepartment() {
		return this.mandatoryFields.courseDepartment;
	}

	public String getCourseDescription() {
		return this.mandatoryFields.courseDescription;
	}

	public String getCourseInstructor() {
		return this.instructor.instructorID + " " + this.instructor.instructorName;
	}

	public String getWebsite() {
		return this.website.title + " " + this.website.url;
	}

	public String getOfficeHours() {
		return this.officeHours;
	}

	public String getSlackChannel() {
		return this.slackChannel.slackChannelName;
	}

	public List<String> getTeachingAssistantList() {
		List<String> resultString = new ArrayList<>();
		for(TeachingAssistant result : this.ta){
			resultString.add(result.assistantID + " " + result.assistantName);
		}
		return resultString;
	}

	public List<String> getGradingAssistantList() {
		List<String> resultString = new ArrayList<>();
		for(GraderAssistant result : this.ga){
			resultString.add(result.assistantID + " " + result.assistantName);
		}
		return resultString;
	}

	public String getExamDates() {
		return this.examDate;
	}

	public HashMap<String, Integer> getGradeWeightage() {
		HashMap<String, Integer> map = new HashMap<>();
		if(this.gradeWeightage.assignment != null){
			map.put("Assignments", this.gradeWeightage.assignment);
		}
		if(this.gradeWeightage.quiz != null){
			map.put("Quizzes", this.gradeWeightage.quiz);
		}
		if(this.gradeWeightage.midTerm != null){
			map.put("Mid-Term", this.gradeWeightage.midTerm);
		}
		if(this.gradeWeightage.presentation != null){
			map.put("Presentations", this.gradeWeightage.presentation);
		}
		if(this.gradeWeightage.presentation != null){
			map.put("Final Exam", this.gradeWeightage.presentation);
		}
		return map;
	}

	public String getAbsencePolicy() {
		return this.absencePolicy.absencePolicy;
	}

	public HashMap<String, List<String>> getBooksAndReferences() {
		HashMap<String, List<String >> map = new HashMap<>();
		if(this.booksAndReferences.books != null && this.booksAndReferences.books.size() != 0){
			map.put("Books", this.booksAndReferences.books);
		}
		if(this.booksAndReferences.references != null && this.booksAndReferences.references.size() != 0){
			map.put("References", this.booksAndReferences.references);
		}
		if(this.booksAndReferences.webLink != null && this.booksAndReferences.webLink.size() != 0){
			map.put("Web Links", this.booksAndReferences.webLink);
		}
		return map;
	}

	public List<String> getCourseSchedule() {
		List<String> list = new ArrayList<>();
		for(Schedule schedule1 : this.schedule){
			list.add(schedule1.week + " - " + schedule1.topic);
		}
		return list;
	}

	public List<String> getGeneralRules() {
		return this.rules.rule;
	}

	public List<String> getAcademicIntegrity() {
		return this.academicIntegrity.integrity;
	}

	public void printCourse(){
		System.out.println("The College is : " + getCollege());
		System.out.println("The ID of the course is : " + getCourseID());
		System.out.println("The Course Duration of the course is : " + getCourseDuration());
		System.out.println("The Course Department of the course is : " + getCourseDepartment());
		System.out.println("The Course Description of the course is : " + getCourseDescription());
		System.out.println("The Course Instructor of the course is : " + getCourseInstructor());
		System.out.println("The Course Website of the course is : " + getWebsite());
		System.out.println("The office hours of the course is : " + getOfficeHours());
		System.out.println("The Course Slack Channel of the course is : " + getSlackChannel());
		List<String> assistantList = getTeachingAssistantList();
		System.out.println("Following are the teaching assistants of the course : ");
		for(String assistant : assistantList){
			System.out.println(assistant);
		}
		List<String> gradingAssistantList = getGradingAssistantList();
		System.out.println("Following are the grading assistants of the course : ");
		for(String assistant : gradingAssistantList){
			System.out.println(assistant);
		}
		System.out.println("The Course Name of the subject is : " + getExamDates());
		HashMap<String, Integer> map = getGradeWeightage();
		System.out.println("Following are the weightage of each modules : ");
		for(Map.Entry<String, Integer> e : map.entrySet()){
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		HashMap<String, List<String>> bar = getBooksAndReferences();
		System.out.println("Following are the books and references of each modules : ");
		for(Map.Entry<String, List<String>> e : bar.entrySet()){
			System.out.println(e.getKey() + ":");
			for(String val : e.getValue()){
				System.out.println(val);
			}
		}

		System.out.println("The Absence policy is as follows : ");
		System.out.println(getAbsencePolicy());
		List<String> schedule = getCourseSchedule();
		System.out.println("The course schedule is as follows : ");
		for(String s : schedule){
			System.out.println(s);
		}
		List<String> rules = getGeneralRules();
		System.out.println("The course rules is as follows : ");
		for(String s : rules){
			System.out.println(s);
		}
		List<String> integrity = getAcademicIntegrity();
		System.out.println("The course integrity is as follows : ");
		for(String s : integrity){
			System.out.println(s);
		}
	}
}
