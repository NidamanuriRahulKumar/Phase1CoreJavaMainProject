package SimpliLearn.Phase1;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		
	}

	public static void displayMenu() {
		String menu = "\n\n>>>>----Select any option number from below and press Enter----<<<<\n\n"
				+ "1) Retrieve all files inside \"JavaFiles\" folder\n"
				+ "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n>>>>---- Select an Operation ----<<<<\n\n"
				+ "1) Add a file to \"JavaFiles\" folder\n" 
				+ "2) Delete a file from \"JavaFiles\" folder\n"
				+ "3) Search file from \"JavaFiles\" folder\n" 
				+ "4) Show Previous Menu\n" 
				+ "5) Exit program\n";

		System.out.println(fileMenu);
	}

}
