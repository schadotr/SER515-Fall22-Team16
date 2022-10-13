package BuilderPattern.Demo;

import BuilderPattern.builders.BusinessCollegeBuilder;
import BuilderPattern.builders.EngineeringCollegeBuilder;
import BuilderPattern.director.Director;
import BuilderPattern.schools.BusinessSchool;
import BuilderPattern.schools.SCAI;
import singletonPattern.Timer;

public class Client {

	public static void main(String args[]){
		System.out.println("*************** Builder Pattern : ****************");
		System.out.println();
		System.out.println();
		Director director = new Director();
		EngineeringCollegeBuilder builder = new EngineeringCollegeBuilder();
		BusinessCollegeBuilder builder1 = new BusinessCollegeBuilder();
		director.constructEngineeringSyllabus(builder);
		director.constructBusinessSyllabus(builder1);

		SCAI scaiCourse = builder.getCourse();
		scaiCourse.printDetails();

		BusinessSchool bbuilder = builder1.getCourse();
		bbuilder.printCourse();
		Timer timer = new Timer();
		timer.main(new String[]{""});
	}
}
