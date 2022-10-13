package singletonPattern;

public class AdvDataStructandAlgorithms {

	private static AdvDataStructandAlgorithms instance= new AdvDataStructandAlgorithms();

	private Timer timer;

	private AdvDataStructandAlgorithms advDataStructandAlgorithms;

	private void advDataStructandAlgorithms(){};

	public static AdvDataStructandAlgorithms getAdvDataStructandAlgorithms() {
		return instance;
	}

	public void update_ADSA_assignments() {
		System.out.println("ADSA Assigments Updated");
	}

	public void update_ADSA_gradepolicy() {
		System.out.println("ADSA gradepolicy Updated");
	}

	public void update_ADSA_instructorInformation() {
		System.out.println("ADSA instructorInformation Updated");
	}

}
