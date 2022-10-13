ppublic class FulltimeDecorator extends LecturerDecorator {

	private Syllabus syllabus;

	private Course[] courses;

	public FulltimeDecorator(){
		syllabus=new Syllabus("");
		courses={new Course(515,"Foundations of Software Engineering"),new Course(501,"Advanced Data Structures and Algorithms")};
	}

	public Syllabus get_old_Syllabus(Course course) {
		System.out.println("Old syllabus extracted");
		return null;
	}

	public void update_weightage(Course course) {
		System.out.println("Weightage updated");
	}

	public void add_extra_instructions(Course course) {
		System.out.println("Additional instructions added");
	}

	public void update_attendance_policy(Course course) {
		System.out.println("Attendance Policy updated");
	}

	public void update_weekly_schedule(Course course) {
		System.out.println("Weekly schedue updated");
	}

	public void update_grade_appeal_policy(Course course) {
		System.out.println("Grade Appeal Policy Updated");
	}

	public void update_personal_info() {
		System.out.println("Personal Info changed");
	}

	public void create_syllabus() {
		return super.create_syllabus()+get_old_Syllabus(courses[0])+update_weightage(courses[0])+add_extra_instructions(courses[0])+update_attendance_policy(courses[0])+update_weekly_schedule(courses[0])+update_grade_appeal_policy(courses[0])+update_personal_info();
	}

}
