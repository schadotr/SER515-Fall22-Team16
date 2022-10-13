public class LecturerDemo{
	public static void main(String[] args){
		LecturerControl lc;
		lc=new LecturerControl();
		FulltimeDecorator fulltimelecturer;
		AdjunctDecorator adjunctlecturer;
		fulltimelecturer=new FulltimeDecorator();
		adjunctlecturer=new AdjunctDecorator();
		lc.create_syllabus();
		fulltimelecturer.create_syllabus();
		adjunctlecturer.create_syllabus();

	}
}