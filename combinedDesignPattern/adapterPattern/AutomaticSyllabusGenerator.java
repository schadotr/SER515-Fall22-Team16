package adapterPattern;

public class AutomaticSyllabusGenerator implements Canvas {

	private SyllabusDocument syllabusDocument;

	public void viewSyllabus() {
		System.out.println(" Syllabus being viewed ");
	}

	public void saveSyllabus() {
		System.out.println(" Syllabus saved ");
	}

	public void editSyllabus() {
		System.out.println(" Syllabus being edited ");
	}

	public void exportSyllabus() {
		System.out.println(" Syllabus exported ");
	}

}
