public class LecturerDecorator implements Lecturer {

	private Lecturer lecturer;

	public void create_syllabus() {
		System.out.println("Create Syllabus within LecturerDecorator");
	}

	public LecturerDecorator() {

	}

}
