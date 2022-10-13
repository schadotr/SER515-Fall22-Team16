package decoratorPattern;

public class LecturerControl implements Lecturer {

	public void create_syllabus() {
		System.out.println("Create method within LecturerControl");
	}

	public LecturerControl() {
		System.out.println("Lecturer Control Object created");
	}

}
