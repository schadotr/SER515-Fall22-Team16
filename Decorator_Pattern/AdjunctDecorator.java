public class AdjunctDecorator extends LecturerDecorator {
	private final Syllabus syllabus;
	Course[] courses;
	public AdjunctDecorator() {
		syllabus=new Syllabus("Welcome to the Course");
		courses = new Course[]{new Course(515, "Foundations of Software Engineering"), new Course(501, "Advanced Data Structures and Algorithms")};
	}

	public void get_template(Course course) {
		System.out.println(course.title);
		System.out.println("Syllabus Template Extracted");
		System.out.println("Initial Syllabus:");
		System.out.println(syllabus.content);
	}

	public void add_weightage(Course course) {
		System.out.println(course.title);
		System.out.println("Marks weightage added");

	}

	public void add_weekly_schedule(Course course) {
		System.out.println(course.title);
		System.out.println("Weekly Schedule Added");
	}

	public void add_personal_details(Course course) {
		System.out.println(course.title);
		System.out.println("Personal details added");
	}

	public void add_grade_appeal_policy(Course course) {
		System.out.println(course.title);
		System.out.println("Grade Appeal Policy Added");
	}

	public void add_attendance_policy(Course course) {
		System.out.println(course.title);
		System.out.println("Attendance Policy Added");
	}

	public void create_syllabus() {
		super.create_syllabus();
		get_template(courses[0]);add_weightage(courses[0]);add_weekly_schedule(courses[0]);add_personal_details(courses[0]);add_grade_appeal_policy(courses[0]);add_attendance_policy(courses[0]);add_topics(courses[0]);
	}

	public void add_topics(Course course) {

		System.out.println(course.title);
		System.out.println("Topics Added");
	}

}
