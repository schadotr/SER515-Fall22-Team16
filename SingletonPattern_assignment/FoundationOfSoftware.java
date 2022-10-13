public class FoundationOfSoftware {

	private static FoundationOfSoftware instance = new FoundationOfSoftware();

	private Timer timer;

	private FoundationOfSoftware foundationOfSoftware;

	private void foundationOfSoftware(){};

	public static FoundationOfSoftware getFoundationOfSoftware() {
		return instance;
	}

	public void update_FOS_assignments() {
		System.out.println("FOS Assigments Updated");
	}

	public void update_FOS_gradepolicy() {
		System.out.println("FOS gradepolicy Updated");
	}

	public void update_FOS_instructorInformation() {
		System.out.println("FOS instructorInformation Updated");
	}

}
