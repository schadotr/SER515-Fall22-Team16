package singletonPattern;

public class SemanticWebTechnologies {

	private static SemanticWebTechnologies instance= new SemanticWebTechnologies();

	private Timer timer;

	private SemanticWebTechnologies semanticWebTechnologies;

	private void semanticWebTechnologies(){};

	public static SemanticWebTechnologies getSemanticWebTechnologies() {
		return instance;
	}

	public void update_SWT_assignments() {
		System.out.println("SWT Assigments Updated");
	}

	public void update_SWT_gradepolicy() {
		System.out.println("SWT gradepolicy Updated");
	}

	public void update_SWT_instructorInformation() {
		System.out.println("SWT instructorInformation Updated");
	}

}
