package decoratorPattern;

public class LecturerDecorator implements Lecturer {

	public void create_syllabus() {

		System.out.println("Create Syllabus within LecturerDecorator");
	}

	public LecturerDecorator() {
		System.out.println("Lecturer Decorator Object");
	}

}
