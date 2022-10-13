public class AdjunctDecorator extends LecturerDecorator {

	private Course[] courses;

	public AdjunctDecorator() {
		courses={new Course(515,"Foundations of Software Engineering"),new Course(501,"Advanced Data Structures and Algorithms")};
	}

	public Syllabus get_template(Course course) {
		System.out.println("Syllabus Template Extracted");
		return null;
	}

	public void add_weightage(Course course) {
		System.out.println("Marks weightage added");
	}

	public void add_weekly_schedule(Course course) {
		System.out.println("Weekly Schedule Added");
	}

	public void add_personal_details() {
		System.out.println("Personal details added");
	}

	public void add_grade_appeal_policy(Course course) {
		System.out.println("Grade Appeal Policy Added");
	}

	public void add_attendance_policy(Course course) {
		System.out.println("Attendance Policy Added");
	}

	public void create_syllabus() {
		return super.create_syllabus()+get_template(courses[0])+add_weightage(courses[0])+add_weekly_schedule(courses[0])+add_personal_details()+add_grade_appeal_policy(courses[0])+add_attendance_policy(courses[0])+add_topics(courses[0]);
	}

	public void add_topics(Course course) {
		System.out.println("Topics Added");
	}

}
