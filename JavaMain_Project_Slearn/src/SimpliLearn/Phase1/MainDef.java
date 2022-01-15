package SimpliLearn.Phase1;

public class MainDef{

	public static void main(String[] args) {
		
		FileOperations.createJavaFilesFolderIfNotPresent("JavaFiles");
		
		MenuOptions.printWelcomeScreen("javaProject", "Rahul Kumar N");
		
		Controls.handleWelcomeScreenInput();
	}

	
}