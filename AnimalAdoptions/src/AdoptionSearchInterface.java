import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AdoptionSearchInterface {

	JFrame frmAdoptionSearch;
	private JTextField CustomerID_text;
	private JTextField Date1_text;
	private JTextField Date2_text;
	private JTextField AnimalID_text;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public AdoptionSearchInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdoptionSearch = new JFrame();
		frmAdoptionSearch.setTitle("Adoption Search");
		frmAdoptionSearch.setBounds(700, 200, 500, 500);
		frmAdoptionSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton backButton = new JButton("Back");
		backButton.setBounds(50, 350, 100, 50);
		backButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AnimalInterface.launchUserInterface();
				frmAdoptionSearch.dispose();
			}
		});
		frmAdoptionSearch.getContentPane().setLayout(null);
		frmAdoptionSearch.getContentPane().add(backButton);


		//======================================================================================================== get adoptions by date
		JPanel gabd_panel = new JPanel();
		gabd_panel.setBounds(35, 160, 190, 50);
		frmAdoptionSearch.getContentPane().add(gabd_panel);

		JButton gabdButton = new JButton("Get Adoption By Date");
		gabd_panel.add(gabdButton);
		gabdButton.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spGetAdoptionsByDate(Date1_text.getText(), Date2_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}			}


		});

		Date1_text = new JTextField();
		Date1_text.setBounds(332, 160, 116, 22);
		frmAdoptionSearch.getContentPane().add(Date1_text);
		Date1_text.setColumns(10);

		JLabel lblgabd1 = new JLabel("Date1:");
		lblgabd1.setBounds(240, 160, 56, 16);
		frmAdoptionSearch.getContentPane().add(lblgabd1);


		Date2_text = new JTextField();
		Date2_text.setBounds(332, 197, 116, 22);
		frmAdoptionSearch.getContentPane().add(Date2_text);
		Date2_text.setColumns(10);

		JLabel lblgabd2 = new JLabel("Date2:");
		lblgabd2.setBounds(240, 200, 56, 16);
		frmAdoptionSearch.getContentPane().add(lblgabd2);




		//======================================================================================================== list adoptions by customer
		JPanel labc_panel = new JPanel();
		labc_panel.setBounds(32, 49, 193, 44);
		frmAdoptionSearch.getContentPane().add(labc_panel);

		JButton labcButton = new JButton("List Adoptions By Customer");
		labc_panel.add(labcButton);
		labcButton.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spListAdoptionsByCustomer(CustomerID_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}


		});

		CustomerID_text = new JTextField();
		CustomerID_text.setBounds(332, 60, 116, 22);
		frmAdoptionSearch.getContentPane().add(CustomerID_text);
		CustomerID_text.setColumns(10);

		JLabel lblCustomerid = new JLabel("CustomerID:");
		lblCustomerid.setBounds(240, 63, 77, 16);
		frmAdoptionSearch.getContentPane().add(lblCustomerid);


		//======================================================================================================== get adoptions by animal
		JPanel gaba_panel = new JPanel();
		gaba_panel.setBounds(35, 253, 190, 50);
		frmAdoptionSearch.getContentPane().add(gaba_panel);

		JButton gabaButton = new JButton("Get Adoptions By Animal");
		gaba_panel.add(gabaButton);
		gabaButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spGetAdoptionsByAnimalID(AnimalID_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});



		AnimalID_text = new JTextField();
		AnimalID_text.setBounds(332, 261, 116, 22);
		frmAdoptionSearch.getContentPane().add(AnimalID_text);
		AnimalID_text.setColumns(10);

		JLabel lblAnimalid = new JLabel("AnimalID:");
		lblAnimalid.setBounds(237, 264, 56, 16);
		frmAdoptionSearch.getContentPane().add(lblAnimalid);
		
	}
}
