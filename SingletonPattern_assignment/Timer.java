public class Timer {

	private FoundationOfSoftware foundationOfSoftware;

	private SemanticWebTechnologies semanticWebTechnologies;

	private AdvDataStructandAlgorithms advDataStructandAlgorithms;

	public static void main (String[] args) {
		FoundationOfSoftware FS=FoundationOfSoftware.getFoundationOfSoftware();
		FS.update_FOS_assignments();
		FS.update_FOS_gradepolicy();
		FS.update_FOS_instructorInformation();
		SemanticWebTechnologies SW=SemanticWebTechnologies.getSemanticWebTechnologies();
		SW.update_SWT_assignments();
		SW.update_SWT_gradepolicy();
		SW.update_SWT_instructorInformation();
		AdvDataStructandAlgorithms AD=AdvDataStructandAlgorithms.getAdvDataStructandAlgorithms();
		AD.update_ADSA_assignments();
		AD.update_ADSA_gradepolicy();
		AD.update_ADSA_instructorInformation();
	}

}
