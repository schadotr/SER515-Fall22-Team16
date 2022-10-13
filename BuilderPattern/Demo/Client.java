package Demo;

import builders.BusinessCollegeBuilder;
import builders.EngineeringCollegeBuilder;
import director.Director;
import schools.BusinessSchool;
import schools.SCAI;

public class Client {

	public static void main(String args[]){
		System.out.println("*************** Builder Pattern : ****************");
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
	}
}
