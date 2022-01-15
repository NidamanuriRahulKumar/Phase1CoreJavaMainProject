package SimpliLearn.Phase1;

import java.util.List;
import java.util.Scanner;

public class Controls {
	public static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					FileOperations.displayAllFiles("JavaFiles");
					break;
				case 2:
					Controls.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Select a valid option");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}
	
	public static void handleFileMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions.displayFileMenuOptions();
				FileOperations.createJavaFilesFolderIfNotPresent("JavaFiles");
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// File Add
					System.out.println("Enter the name of the file to add\"JavaFiles\" folder");
					String fileToAdd = sc.next();
					
					FileOperations.createFile(fileToAdd, sc);
					
					break;
				case 2:
					// File/Folder delete
					System.out.println("Enter the name of the file to delete \"JavaFiles\" folder");
					String fileToDelete = sc.next();
					
					FileOperations.createJavaFilesFolderIfNotPresent("JavaFiles");
					List<String> filesToDelete = FileOperations.displayFileLocations(fileToDelete, "JavaFiles");
					
					String deletionPrompt = "\nSelect file to delete"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
				
					int idx = sc.nextInt();
					
					if (idx != 0) {
						FileOperations.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {
						
						for (String path : filesToDelete) {
							FileOperations.deleteFileRecursively(path);
						}
					}
					
					break;
				case 3:
					System.out.println("Enter file name to be searched from \"JavaFiles\" folder");
					String fileName = sc.next();
					
					FileOperations.createJavaFilesFolderIfNotPresent("JavaFiles");
					FileOperations.displayFileLocations(fileName, "JavaFiles");

					
					break;
				case 4:
					return;
				case 5:
					System.out.println(" Logging Out..successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("select a valid option ");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
		} while (running == true);
	}
}