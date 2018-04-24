import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * AnimalInterface class
 * includes main
 */
public class AnimalInterface {


	public static boolean seen = false;

	/**
	 * @throws IOException
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) throws IOException {

		WarningWindow window = new WarningWindow();
		if (seen) {
			window.frame.dispose();
			UserInterface ui = new UserInterface();
			ui.frmAnimalAdoptionApp.setVisible(true);
		}
		else window.frame.setVisible(true);



		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		StoredProcedures.go();
	}


	/**
	 * @wbp.parser.entryPoint
	 */
	public static void launchUserInterface() {
		UserInterface window = new UserInterface();
		window.frmAnimalAdoptionApp.setVisible(true);
	}


	/**
	 * @wbp.parser.entryPoint
	 */
	public static void launchEmployeeInterface() {
		EmployeeSearchInterface window = new EmployeeSearchInterface();
		window.frmEmployeeSearch.setVisible(true);
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void launchAnimalInterface() {
		AnimalSearchInterface window = new AnimalSearchInterface();
		window.frmAnimalSearch.setVisible(true);
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void launchAdoptionInterface() {
		AdoptionSearchInterface window = new AdoptionSearchInterface();
		window.frmAdoptionSearch.setVisible(true);
	}


	/**
	 * @wbp.parser.entryPoint
	 */
	public static void launchEditingInterface() {
		EditDataInterface window = new EditDataInterface();
		window.frmEditDataInterface.setVisible(true);
	}
}
