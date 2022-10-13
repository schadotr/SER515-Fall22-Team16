package facadePattern;

public class LayoutSelectorForWebsite {

	private SystemType macOS;

	private SystemType windowsPC;

	private SystemType linux;

	// private syllabusCreatorFacade syllabusCreatorFacade;

	public LayoutSelectorForWebsite() {
		macOS = new MacOS();
		windowsPC = new WindowsPC();
		linux = new Linux();
	}

	public String setUIForWindowsPC() {
		return windowsPC.setLayout();
	}

	public String setUIForMacOS() {
		return macOS.setLayout();
	}

	public String setUIForLinux() {
		return linux.setLayout();
	}

}
