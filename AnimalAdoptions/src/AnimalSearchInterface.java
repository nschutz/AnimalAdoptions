import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class AnimalSearchInterface {

	JFrame frmAnimalSearch;
	private JTextField center_text;
	private JTextField Species_text;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public AnimalSearchInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAnimalSearch = new JFrame();
		frmAnimalSearch.setTitle("Animal Search");
		frmAnimalSearch.setBounds(600, 100, 800, 750);
		frmAnimalSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAnimalSearch.getContentPane().setLayout(null);

		JButton backButton = new JButton("Back");
		backButton.setBounds(324, 600, 100, 50);
		backButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AnimalInterface.launchUserInterface();
				frmAnimalSearch.dispose();
			}
		});
		frmAnimalSearch.getContentPane().add(backButton);



		////////////////////////////////////////////////////////////////////////////////// All Animals
		JPanel allAnimalsPanel = new JPanel();
		allAnimalsPanel.setBounds(127, 157, 121, 34);
		frmAnimalSearch.getContentPane().add(allAnimalsPanel);

		JButton btnAllAnimals = new JButton("Get All Pets");
		btnAllAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spListUnadoptedPets();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		allAnimalsPanel.add(btnAllAnimals);

		JLabel lblAllAnimals = new JLabel("Show all animals up for adoption");
		lblAllAnimals.setBounds(89, 93, 195, 16);
		frmAnimalSearch.getContentPane().add(lblAllAnimals);




		//////////////////////////////////////////////////////////////////////////////////// Species
		JPanel species_panel = new JPanel();
		species_panel.setBounds(565, 157, 121, 34);
		frmAnimalSearch.getContentPane().add(species_panel);

		JButton btnAnimalsBySpecies = new JButton("Species Name");
		btnAnimalsBySpecies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spSearchAnimalsBySpeciesName(Species_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		species_panel.add(btnAnimalsBySpecies);

		Species_text = new JTextField();
		Species_text.setColumns(10);
		Species_text.setBounds(621, 122, 116, 22);
		frmAnimalSearch.getContentPane().add(Species_text);

		JLabel lblSpecies = new JLabel("Species");
		lblSpecies.setBounds(536, 125, 56, 16);
		frmAnimalSearch.getContentPane().add(lblSpecies);

		JLabel lblFilterBySpecies = new JLabel("Show all animals of a specific type");
		lblFilterBySpecies.setBounds(528, 93, 250, 16);
		frmAnimalSearch.getContentPane().add(lblFilterBySpecies);




		/////////////////////////////////////////////////////////////////////////////////// Animals by Center
		JPanel AnimalsByCenterPanel = new JPanel();
		AnimalsByCenterPanel.setBounds(112, 460, 159, 50);
		frmAnimalSearch.getContentPane().add(AnimalsByCenterPanel);

		JButton btnAnimalsByCenter = new JButton("Animals by CenterID");
		btnAnimalsByCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spSearchAnimalsByCenterID(center_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		AnimalsByCenterPanel.add(btnAnimalsByCenter);

		center_text = new JTextField();
		center_text.setColumns(10);
		center_text.setBounds(168, 422, 116, 22);
		frmAnimalSearch.getContentPane().add(center_text);

		JLabel lblAnimalsByCenter = new JLabel("Show all animals at an Adoption Center");
		lblAnimalsByCenter.setBounds(72, 393, 234, 16);
		frmAnimalSearch.getContentPane().add(lblAnimalsByCenter);

		JLabel lblCenterName = new JLabel("CenterID:");
		lblCenterName.setBounds(74, 428, 82, 16);
		frmAnimalSearch.getContentPane().add(lblCenterName);




		//////////////////////////////////////////////////////////////////////////////////// Main Title

		JLabel lblNewLabel = new JLabel("Search for animals up for adoption");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(242, 13, 286, 35);
		frmAnimalSearch.getContentPane().add(lblNewLabel);




	}
}
