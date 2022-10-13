package adapterPattern;

import decoratorPattern.LecturerDemo;

public class AdapterDP {

	private Canvas canvas;

	public static void main(String args[]) {
		System.out.println("************** Adapter Pattern *************");
		System.out.println();
		System.out.println();
		Canvas targetInterface = new AutomaticSyllabusGenerator();
		((AutomaticSyllabusGenerator) targetInterface).editSyllabus();
		targetInterface.exportSyllabus();

		LecturerDemo ld = new LecturerDemo();
		ld.main(new String[]{""});
	}


}
