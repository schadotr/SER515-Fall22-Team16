package director;

import builders.CourseBuilder;
import components.*;
import Demo.Client;

import java.util.ArrayList;
import java.util.List;

public class Director {

	private Client client;

	public void constructEngineeringSyllabus(CourseBuilder builder) {
		builder.setCollegeType(CollegeType.SCAI);
		builder.setMandatoryFields(new MandatoryFields("SER515", "Foundations of Software Engineering", "Aug 2022 - Dec 2022", "School of Augmented", "Software Engineering overview emphasizes component and service-based architectures, reliability, \n" +
				"safety, dependability, and software reuse. Introduction to software engineering research methods and \n" +
				"critical inquiry. "));
		builder.setInstructor(new Instructor("Michael J. Findler", "SCAI124", "Software Engineering"));
		builder.setClassWebsite(new Website("https://asu.instructure.com/courses/121664", "SER515 Website"));
		builder.setOfficeHours("Peralta Hall 230L, MTWTh 12-1 pm ");
		builder.setSlackChannel(new SlackChannel("asu-2227-ser515-73-db.slack.com", "SER515-Slack"));
		builder.setTeachingAssistant();
		builder.setGradingAssistant();
		TeachingAssistant t1 = new TeachingAssistant();
		t1.setAssistantType(AssistantType.TEACHING_ASSISTANT);
		t1.setAssistantName("James Charles");
		t1.setAssistantID("101");
		t1.setAssistantCourse("SER515");
		TeachingAssistant t2 = new TeachingAssistant();
		t2.setAssistantType(AssistantType.TEACHING_ASSISTANT);
		t2.setAssistantName("Jay Patel");
		t2.setAssistantID("102");
		t2.setAssistantCourse("SER515");
		builder.addTeachingAssistants(t2);
		GraderAssistant g1 = new GraderAssistant();
		g1.setAssistantType(AssistantType.GRADER);
		g1.setAssistantName("Xio Chan");
		g1.setAssistantID("105");
		g1.setAssistantCourse("SER515");
		builder.setExamDates("TBA");
		Grade subjectGrade = new Grade();
		subjectGrade.setAssignment(40);
		subjectGrade.setQuiz(25);
		subjectGrade.setFinalExam(35);
		builder.setGradeWeightage(subjectGrade);
		builder.setAbsencePolicies(new AbsencePolicy("Accommodations  will  be  made  for  religious  observances,  provided  that  students  notify  the  \n" +
				"instructor at the beginning of the semester concerning those dates. Students who expect to miss \n" +
				"class  due  to  officially  university-sanctioned  activities  should  inform  the  instructor  early  in  the  \n" +
				"semester. Alternative arrangements will generally be made for any examinations and other graded \n" +
				"in-class  work  affected  by  such  absences.  The  preceding  policies  are  based  on  ACD  304–04, \n" +
				"\"Accommodation  for  Religious  Practices\"  and  ACD  304–02,  \"Missed  Classes  Due  to  University-\n" +
				"Sanctioned  Activities.\""));
		BooksAndReferences material = new BooksAndReferences();
		material.addBook("Ian Sommerville, Software Engineering 10th edition, Addison-Wesley 2012. ");
		material.addReferences("Shaw,  M.  \"What  makes  good  research  in  software  engineering?\"  International  Journal  of  \n" +
				"Software Tools for Technology Transfer, 2002, vol. 4, no. 1, pp. 1-7. ");
		builder.setBooksAndReferences(material);
		Schedule s1 = new Schedule("Design Patterns", "Week 1");
		Schedule s2 = new Schedule("Testing", "Week 2");
		Schedule s3 = new Schedule("Final Exam", "Week 3");
		List<Schedule> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		builder.setCourseSchedule(list);
		List<String> rule = new ArrayList<>();
		rule.add("practicing any form of academic  deceit; ");
		rule.add("referring  to  materials  or  sources  or  employing  devices  (e.g.,  audio  recorders,  crib  sheets,  \n" +
				"calculators, solution manuals, or commercial research services) not specifically authorized by \n" +
				"the instructor for use during tests, quizzes, homework, and class  activities; ");
		rule.add("acting as a substitute for another person in any academic evaluation or using a substitute in \n" +
				"any academic evaluation; ");
		builder.setGeneralRules(new Rules(rule));
		List<String> intr = new ArrayList<>();
		intr.add("on the aid of others to the extent that the work is not representative of the student's abilities, \n" +
				"knowing or having good reason to believe that this aid is not authorized by the instructor; ");
		intr.add("writing code together with someone else or with another pair/group (unless expressly allowed \n" +
				"by the instructor)");
		builder.setAcademyIntegrity(new Integrity(intr));
	}

	public void constructBusinessSyllabus(CourseBuilder builder) {
		builder.setCollegeType(CollegeType.BUSINESS_SCHOOL);
		builder.setMandatoryFields(new MandatoryFields("MIS556", "Management of time and money", "Aug 2022 - Dec 2022", "W.P.Carey business School", "Management of time and money is an extra course for having a deeper thoughts about the life and its worth. \n"));
		builder.setInstructor(new Instructor("Anthony Evans", "WPC324", "Management Information System"));
		builder.setClassWebsite(new Website("https://asu.instructure.com/courses/231664", "MIS556 Website"));
		builder.setOfficeHours("Picacho Hall 230L, MTWTh 12-1 pm ");
		builder.setSlackChannel(new SlackChannel("asu-2227-ser515-73-db.slack.com", "MIS556-Slack"));
		builder.setTeachingAssistant();
		builder.setGradingAssistant();
		TeachingAssistant t1 = new TeachingAssistant();
		t1.setAssistantType(AssistantType.TEACHING_ASSISTANT);
		t1.setAssistantName("Jazmin Castaneda");
		t1.setAssistantID("201");
		t1.setAssistantCourse("MIS556");
		TeachingAssistant t2 = new TeachingAssistant();
		t2.setAssistantType(AssistantType.TEACHING_ASSISTANT);
		t2.setAssistantName("Max Tennison");
		t2.setAssistantID("104");
		t2.setAssistantCourse("MIS556");
		builder.addTeachingAssistants(t2);
		GraderAssistant g1 = new GraderAssistant();
		g1.setAssistantType(AssistantType.GRADER);
		g1.setAssistantName("Sasuke Uchiha");
		g1.setAssistantID("305");
		g1.setAssistantCourse("MIS556");
		builder.setExamDates("TBA");
		Grade subjectGrade = new Grade();
		subjectGrade.setAssignment(30);
		subjectGrade.setQuiz(25);
		subjectGrade.setFinalExam(25);
		subjectGrade.setPresentation(20);
		builder.setGradeWeightage(subjectGrade);
		builder.setAbsencePolicies(new AbsencePolicy("Accommodations  will  be  made  for  religious  observances,  provided  that  students  notify  the  \n" +
				"instructor at the beginning of the semester concerning those dates. Students who expect to miss \n" +
				"class  due  to  officially  university-sanctioned  activities  should  inform  the  instructor  early  in  the  \n" +
				"semester. Alternative arrangements will generally be made for any examinations and other graded \n" +
				"in-class  work  affected  by  such  absences.  The  preceding  policies  are  based  on  ACD  304–04, \n" +
				"\"Accommodation  for  Religious  Practices\"  and  ACD  304–02,  \"Missed  Classes  Due  to  University-\n" +
				"Sanctioned  Activities.\""));
		BooksAndReferences material = new BooksAndReferences();
		material.addBook("Master Jiraya, The tale of naruto uzumaki");
		material.addReferences("Kakashi H.  \"Those who abandon the mission are scum, but those who leave their friends are worse than the scum \n");
		builder.setBooksAndReferences(material);
		Schedule s1 = new Schedule("Chunin Exam", "Week 1");
		Schedule s2 = new Schedule("Shippuden Test", "Week 2");
		Schedule s3 = new Schedule("Great Shinobi War", "Week 3");
		List<Schedule> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		builder.setCourseSchedule(list);
		List<String> rule = new ArrayList<>();
		rule.add("practicing any form of academic  deceit; ");
		rule.add("referring  to  materials  or  sources  or  employing  devices  (e.g.,  audio  recorders,  crib  sheets,  \n" +
				"calculators, solution manuals, or commercial research services) not specifically authorized by \n" +
				"the instructor for use during tests, quizzes, homework, and class  activities; ");
		rule.add("acting as a substitute for another person in any academic evaluation or using a substitute in \n" +
				"any academic evaluation; ");
		builder.setGeneralRules(new Rules(rule));
		List<String> intr = new ArrayList<>();
		intr.add("on the aid of others to the extent that the work is not representative of the student's abilities, \n" +
				"knowing or having good reason to believe that this aid is not authorized by the instructor; ");
		intr.add("writing code together with someone else or with another pair/group (unless expressly allowed \n" +
				"by the instructor)");
		builder.setAcademyIntegrity(new Integrity(intr));
	}

}
