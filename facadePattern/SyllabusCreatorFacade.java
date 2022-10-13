public class SyllabusCreatorFacade {

	public static void main(String args[]) {
		LayoutSelectorForWebsite layoutsForWebsite = new LayoutSelectorForWebsite();
		String systemType = System.getProperty("os.name", "generic").toLowerCase();
		String layout;

		/*
		 * Website's layout will be decided below as per the operation system of user. 
		*/
		System.out.println("Layout for website is being decided");
		if(systemType.indexOf("mac") >= 0){
			layout = layoutsForWebsite.setUIForMacOS();
			System.out.print("Mac OS - ");
		}
		else if(systemType.indexOf("win") >= 0){
			layout = layoutsForWebsite.setUIForWindowsPC();
			System.out.print("Windows - ");

		}
		else{
			layout = layoutsForWebsite.setUIForLinux();
			System.out.print("Linux OS - ");
		}

		System.out.print(layout);

		/* 
		 * Once the syllabus is created, we will show the UI as per the device type and OS.
		*/
		
	}

}
