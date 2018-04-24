
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInterface {

	JFrame frmAnimalAdoptionApp;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAnimalAdoptionApp = new JFrame();
		frmAnimalAdoptionApp.setResizable(false);
		frmAnimalAdoptionApp.setTitle("Animal Adoption App");
		frmAnimalAdoptionApp.setBounds(750, 250, 500, 500);
		frmAnimalAdoptionApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAnimalAdoptionApp.getContentPane().setLayout(null);



		// Button that opens the Adoption search window
		JButton adoptionSearchButton = new JButton("Search Adoptions");
		adoptionSearchButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AnimalInterface.launchAdoptionInterface();
				frmAnimalAdoptionApp.dispose();
			}
		});
		adoptionSearchButton.setBounds(150, 276, 200, 35);
		frmAnimalAdoptionApp.getContentPane().add(adoptionSearchButton);


		// Button that opens the Employee search window
		JButton employeeSearchButton = new JButton("Search Employees");
		employeeSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AnimalInterface.launchEmployeeInterface();
				frmAnimalAdoptionApp.dispose();

			}
		});
		employeeSearchButton.setBounds(150, 187, 200, 35);
		frmAnimalAdoptionApp.getContentPane().add(employeeSearchButton);


		// Button that opens the Animal search window
		JButton animalSearchButton = new JButton("Search Animals");
		animalSearchButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AnimalInterface.launchAnimalInterface();
				frmAnimalAdoptionApp.dispose();
			}
		});
		animalSearchButton.setBounds(150, 102, 200, 35);
		frmAnimalAdoptionApp.getContentPane().add(animalSearchButton);


		// Displays "Select your search field" at the top of the window
		JLabel lblSelectYourSearch = new JLabel("Select your search field");
		lblSelectYourSearch.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSelectYourSearch.setBounds(165, 24, 174, 50);
		frmAnimalAdoptionApp.getContentPane().add(lblSelectYourSearch);
		
		JButton btnEditTables = new JButton("Edit Tables");
		btnEditTables.setBounds(150, 364, 200, 35);
		btnEditTables.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AnimalInterface.launchEditingInterface();
				frmAnimalAdoptionApp.dispose();
			}
		});
		frmAnimalAdoptionApp.getContentPane().add(btnEditTables);
	}
}
