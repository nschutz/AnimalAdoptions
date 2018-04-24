import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class EditDataInterface {

	JFrame frmEditDataInterface;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public EditDataInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditDataInterface = new JFrame();
		frmEditDataInterface.setTitle("Edit Data Interfce");
		frmEditDataInterface.setBounds(500, 10, 1000, 1000);
		frmEditDataInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditDataInterface.getContentPane().setLayout(null);



		

		///////////////////////////////////////////////////////////////////////////////////// Animal text panes

		JTextField AnimalAge_text = new JTextField();
		AnimalAge_text.setBounds(179, 158, 73, 22);
		frmEditDataInterface.getContentPane().add(AnimalAge_text);

		JTextField AnimalSex_text = new JTextField();
		AnimalSex_text.setBounds(364, 158, 73, 22);
		frmEditDataInterface.getContentPane().add(AnimalSex_text);

		JTextField AnimalID_textAnimal = new JTextField();
		AnimalID_textAnimal.setBounds(179, 103, 73, 22);
		frmEditDataInterface.getContentPane().add(AnimalID_textAnimal);

		JTextField CenterID_textAnimal = new JTextField();
		CenterID_textAnimal.setBounds(364, 103, 73, 22);
		frmEditDataInterface.getContentPane().add(CenterID_textAnimal);

		JTextField SpeciesID_textAnimal = new JTextField();
		SpeciesID_textAnimal.setBounds(552, 103, 73, 22);
		frmEditDataInterface.getContentPane().add(SpeciesID_textAnimal);

		JTextField AnimalName_text = new JTextField();
		AnimalName_text.setBounds(790, 97, 73, 22);
		frmEditDataInterface.getContentPane().add(AnimalName_text);

		JTextField DateArrived_text = new JTextField();
		DateArrived_text.setBounds(790, 152, 73, 22);
		frmEditDataInterface.getContentPane().add(DateArrived_text);

		JTextField AnimalDescription_text = new JTextField();
		AnimalDescription_text.setBounds(552, 158, 73, 22);
		frmEditDataInterface.getContentPane().add(AnimalDescription_text);




		//////////////////////////////////////////////////////////////////////////////////// Customer Text Panes
		JTextField CustomerID_text_C = new JTextField();
		CustomerID_text_C.setBounds(253, 802, 73, 22);
		frmEditDataInterface.getContentPane().add(CustomerID_text_C);


		JTextField CustomerName_text = new JTextField();
		CustomerName_text.setBounds(516, 802, 73, 22);
		frmEditDataInterface.getContentPane().add(CustomerName_text);

		JTextField CustomerAddress_text = new JTextField();
		CustomerAddress_text.setBounds(756, 802, 73, 22);
		frmEditDataInterface.getContentPane().add(CustomerAddress_text);

		JTextField CustomerEmail_text = new JTextField();
		CustomerEmail_text.setBounds(253, 838, 73, 22);
		frmEditDataInterface.getContentPane().add(CustomerEmail_text);




		//////////////////////////////////////////////////////////////////////////////////// Adoption Text Panes

		JTextField CustomerID_text_A = new JTextField();
		CustomerID_text_A.setBounds(516, 436, 73, 22);
		frmEditDataInterface.getContentPane().add(CustomerID_text_A);

		JTextField AdoptionDate_text = new JTextField();
		AdoptionDate_text.setBounds(516, 471, 73, 22);
		frmEditDataInterface.getContentPane().add(AdoptionDate_text);

		JTextField AnimalID_textAdoptions = new JTextField();
		AnimalID_textAdoptions.setBounds(756, 436, 73, 22);
		frmEditDataInterface.getContentPane().add(AnimalID_textAdoptions);

		JTextField AdoptionID_text = new JTextField();
		AdoptionID_text.setBounds(263, 434, 73, 22);
		frmEditDataInterface.getContentPane().add(AdoptionID_text);

		JTextField AdoptionCost_text = new JTextField();
		AdoptionCost_text.setBounds(263, 477, 73, 22);
		frmEditDataInterface.getContentPane().add(AdoptionCost_text);





		//////////////////////////////////////////////////////////////////////////////////// Center Text Panes

		JTextField CenterID_text = new JTextField();
		CenterID_text.setBounds(263, 617, 73, 22);
		frmEditDataInterface.getContentPane().add(CenterID_text);

		JTextField CenterName_text = new JTextField();
		CenterName_text.setBounds(516, 611, 73, 22);
		frmEditDataInterface.getContentPane().add(CenterName_text);

		JTextField CenterAddress_text = new JTextField();
		CenterAddress_text.setBounds(756, 617, 73, 22);
		frmEditDataInterface.getContentPane().add(CenterAddress_text);





		//////////////////////////////////////////////////////////////////////////////////// Employee Text Panes

		JTextField EmployeeID_text_E = new JTextField();
		EmployeeID_text_E.setBounds(263, 271, 73, 22);
		frmEditDataInterface.getContentPane().add(EmployeeID_text_E);

		JTextField EmployeeSalary_text = new JTextField();
		EmployeeSalary_text.setBounds(263, 314, 73, 22);
		frmEditDataInterface.getContentPane().add(EmployeeSalary_text);

		JTextField CenterID_text_E = new JTextField();
		CenterID_text_E.setBounds(516, 315, 73, 22);
		frmEditDataInterface.getContentPane().add(CenterID_text_E);

		JTextField EmployeeName_text = new JTextField();
		EmployeeName_text.setBounds(516, 271, 73, 22);
		frmEditDataInterface.getContentPane().add(EmployeeName_text);

		JTextField EmployeePhone_text = new JTextField();
		EmployeePhone_text.setBounds(756, 271, 73, 22);
		frmEditDataInterface.getContentPane().add(EmployeePhone_text);

	
		
		
		////////////////////////////////////////////////////////////////////////////// Add Animal
		JPanel AddAnimal_panel = new JPanel();
		AddAnimal_panel.setBounds(190, 184, 118, 40);
		frmEditDataInterface.getContentPane().add(AddAnimal_panel);
		
		JButton btnAddAnimal = new JButton("Add Animal");
		btnAddAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spAddAnimals(CenterID_textAnimal.getText(), SpeciesID_textAnimal.getText(), AnimalName_text.getText(), AnimalAge_text.getText(), AnimalSex_text.getText(), AnimalDescription_text.getText(), DateArrived_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		AddAnimal_panel.add(btnAddAnimal);




		////////////////////////////////////////////////////////////////////////////// Update Animal
		JPanel UpdateAnimal_panel = new JPanel();
		UpdateAnimal_panel.setBounds(434, 184, 118, 40);
		frmEditDataInterface.getContentPane().add(UpdateAnimal_panel);

		JButton btnUpdateAnimal = new JButton("Update Animal");
		UpdateAnimal_panel.add(btnUpdateAnimal);
		btnUpdateAnimal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spUpdateAnimals(AnimalID_textAnimal.getText(), CenterID_textAnimal.getText(), SpeciesID_textAnimal.getText(), AnimalName_text.getText(), AnimalAge_text.getText(), AnimalSex_text.getText(), AnimalDescription_text.getText(), DateArrived_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});



		/////////////////////////////////////////////////////////////////////////////// Add Employee
		JPanel AddEmployee_Panel = new JPanel();
		AddEmployee_Panel.setBounds(190, 349, 118, 35);
		frmEditDataInterface.getContentPane().add(AddEmployee_Panel);

		JTextField Administrator_text = new JTextField();
		Administrator_text.setBounds(756, 319, 73, 22);
		frmEditDataInterface.getContentPane().add(Administrator_text);
		
		JButton btnAddButton = new JButton("Add Employee");
		AddEmployee_Panel.add(btnAddButton);
		btnAddButton.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spAddEmployee(CenterID_text_E.getText(), EmployeeName_text.getText(), EmployeePhone_text.getText(), EmployeeSalary_text.getText(), Administrator_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});


		////////////////////////////////////////////////////////////////////////////// Add Adoption
		JPanel AddAdoption_panel = new JPanel();
		AddAdoption_panel.setBounds(190, 506, 118, 40);
		frmEditDataInterface.getContentPane().add(AddAdoption_panel);

		JButton btnAddAdoption = new JButton("Add Adoption");
		btnAddAdoption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spAddAdoptionCenter(CenterName_text.getText(), CenterAddress_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		AddAdoption_panel.add(btnAddAdoption);



		/////////////////////////////////////////////////////////////////////////////// Add Center
		JPanel AddCenter_panel = new JPanel();
		AddCenter_panel.setBounds(190, 680, 118, 35);
		frmEditDataInterface.getContentPane().add(AddCenter_panel);

		JButton btnAddCenter = new JButton("Add Center");
		btnAddCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spAddAdoptionCenter(CenterName_text.getText(), CenterAddress_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		AddCenter_panel.add(btnAddCenter);


		//////////////////////////////////////////////////////////////////////////////// Add Customer
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(190, 873, 118, 40);
		frmEditDataInterface.getContentPane().add(panel_5);

		JButton btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spAddCustomer(CustomerName_text.getText(), CustomerAddress_text.getText(), CustomerEmail_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_5.add(btnAddCustomer);



		///////////////////////////////////////////////////////////////////////////////// Update Center
		JPanel UpdateCenter_panel = new JPanel();
		UpdateCenter_panel.setBounds(434, 680, 118, 35);
		frmEditDataInterface.getContentPane().add(UpdateCenter_panel);

		JButton btnUpdateCenter = new JButton("Update Center");
		UpdateCenter_panel.add(btnUpdateCenter);
		btnUpdateCenter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spUpdateAdoptionCenter(CenterID_text.getText(), CenterName_text.getText(), CenterAddress_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});


		///////////////////////////////////////////////////////////////////////////////// Delete Employee
		JPanel DeleteEmployee_Panel = new JPanel();
		DeleteEmployee_Panel.setBounds(650, 349, 141, 35);
		frmEditDataInterface.getContentPane().add(DeleteEmployee_Panel);

		JButton btnDeleteEmployee = new JButton("Delete Employee");
		DeleteEmployee_Panel.add(btnDeleteEmployee);
		btnDeleteEmployee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spDeleteEmployee(EmployeeID_text_E.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});


		////////////////////////////////////////////////////////////////////////////////// Delete Adoption
		JPanel DeleteAdoption_panel = new JPanel();
		DeleteAdoption_panel.setBounds(650, 506, 128, 40);
		frmEditDataInterface.getContentPane().add(DeleteAdoption_panel);

		JButton btnDeleteAdoption = new JButton("Delete Adoption");
		DeleteAdoption_panel.add(btnDeleteAdoption);
		btnDeleteAdoption.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spDeleteAdoptions(AdoptionID_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});


		/////////////////////////////////////////////////////////////////////////////////// Delete Center
		JPanel DeleteCenter_panel = new JPanel();
		DeleteCenter_panel.setBounds(660, 680, 118, 35);
		frmEditDataInterface.getContentPane().add(DeleteCenter_panel);

		JButton btnDeleteCenter = new JButton("Delete Center");
		DeleteCenter_panel.add(btnDeleteCenter);
		btnDeleteCenter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spDeleteAdoptionCenter(CenterID_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});


		/////////////////////////////////////////////////////////////////////////////////// Delete Customer
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(650, 873, 128, 40);
		frmEditDataInterface.getContentPane().add(panel_10);

		JButton btnDeleteCustomer = new JButton("Delete Customer");
		btnDeleteCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spDeleteCustomer(CustomerID_text_C.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_10.add(btnDeleteCustomer);



		//////////////////////////////////////////////////////////////////////////////////// Update Customer
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(424, 873, 141, 40);
		frmEditDataInterface.getContentPane().add(panel_11);

		JButton btnUpdateCustomer = new JButton("Update Customer");
		panel_11.add(btnUpdateCustomer);
		btnUpdateCustomer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spUpdateCustomer(CustomerID_text_C.getText(), CustomerName_text.getText(), CustomerAddress_text.getText(), CustomerEmail_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});


		////////////////////////////////////////////////////////////////////////////////// Update Employee
		JPanel UpdateEmployee_Panel = new JPanel();
		UpdateEmployee_Panel.setBounds(434, 344, 141, 40);
		frmEditDataInterface.getContentPane().add(UpdateEmployee_Panel);

		JButton btnUpdateEmployee = new JButton("Update Employee");
		UpdateEmployee_Panel.add(btnUpdateEmployee);
		btnUpdateEmployee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spUpdateEmployee(EmployeeID_text_E.getText(), CenterID_text_E.getText(), EmployeeName_text.getText(), EmployeePhone_text.getText(), EmployeeSalary_text.getText(), Administrator_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});


		////////////////////////////////////////////////////////////////////////////////// Delete Animal
		JPanel DeleteAnimal_panel = new JPanel();
		DeleteAnimal_panel.setBounds(660, 184, 118, 40);
		frmEditDataInterface.getContentPane().add(DeleteAnimal_panel);

		JButton btnDeleteAnimal = new JButton("Delete Animal");
		btnDeleteAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spDeleteAnimal(AnimalID_textAnimal.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		DeleteAnimal_panel.add(btnDeleteAnimal);

		


		/////////////////////////////////////////////////////////////////////////////////// Update Adoption
		JPanel UpdateAdoption_panel = new JPanel();
		UpdateAdoption_panel.setBounds(434, 506, 141, 40);
		frmEditDataInterface.getContentPane().add(UpdateAdoption_panel);

		JButton btnUpdateAdoption = new JButton("Update Adoption");
		UpdateAdoption_panel.add(btnUpdateAdoption);
		btnUpdateAdoption.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StoredProcedures.spUpdateAdoptions(AdoptionID_text.getText(), AnimalID_textAdoptions.getText(), CustomerID_text_A.getText(), AdoptionCost_text.getText(), AdoptionDate_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});



		////////////////////////////////////////////////////////////////////////////////////////// All JLabels

		JLabel lblNewLabel = new JLabel("Add/Update/Delete values from the tables");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(321, 40, 340, 50);
		frmEditDataInterface.getContentPane().add(lblNewLabel);

		JLabel lblCustomerId = new JLabel("Customer ID: ");
		lblCustomerId.setBounds(143, 802, 80, 16);
		frmEditDataInterface.getContentPane().add(lblCustomerId);

		JLabel lblCustomerName = new JLabel("Customer Name: ");
		lblCustomerName.setBounds(394, 802, 101, 16);
		frmEditDataInterface.getContentPane().add(lblCustomerName);

		JLabel lblCustomerAddress = new JLabel("Customer Address: ");
		lblCustomerAddress.setBounds(609, 802, 118, 16);
		frmEditDataInterface.getContentPane().add(lblCustomerAddress);

		JLabel lblCustomerEmail = new JLabel("Customer Email: ");
		lblCustomerEmail.setBounds(122, 844, 122, 16);
		frmEditDataInterface.getContentPane().add(lblCustomerEmail);

		JLabel lblCenterId = new JLabel("Center ID:");
		lblCenterId.setBounds(143, 617, 101, 16);
		frmEditDataInterface.getContentPane().add(lblCenterId);

		JLabel lblCenterName = new JLabel("Center Name: ");
		lblCenterName.setBounds(394, 617, 101, 16);
		frmEditDataInterface.getContentPane().add(lblCenterName);

		JLabel lblCenterAddress = new JLabel("Center Address:");
		lblCenterAddress.setBounds(626, 617, 101, 16);
		frmEditDataInterface.getContentPane().add(lblCenterAddress);

		JLabel lblAdoptionId = new JLabel("Adoption ID: ");
		lblAdoptionId.setBounds(122, 440, 101, 16);
		frmEditDataInterface.getContentPane().add(lblAdoptionId);

		JLabel lblCustomerId_1 = new JLabel("Customer ID: ");
		lblCustomerId_1.setBounds(394, 440, 101, 16);
		frmEditDataInterface.getContentPane().add(lblCustomerId_1);

		JLabel lblAnimalId = new JLabel("Animal ID: ");
		lblAnimalId.setBounds(626, 440, 101, 16);
		frmEditDataInterface.getContentPane().add(lblAnimalId);

		JLabel lblAdoptionCost = new JLabel("Adoption Cost: ");
		lblAdoptionCost.setBounds(122, 477, 101, 16);
		frmEditDataInterface.getContentPane().add(lblAdoptionCost);

		JLabel lblAdoptionDate = new JLabel("Adoption Date:");
		lblAdoptionDate.setBounds(394, 477, 101, 16);
		frmEditDataInterface.getContentPane().add(lblAdoptionDate);

		JLabel lblEmployeeId = new JLabel("Employee ID: ");
		lblEmployeeId.setBounds(122, 271, 101, 16);
		frmEditDataInterface.getContentPane().add(lblEmployeeId);

		JLabel lblAnimalId_1 = new JLabel("Animal ID:");
		lblAnimalId_1.setBounds(79, 103, 101, 16);
		frmEditDataInterface.getContentPane().add(lblAnimalId_1);

		JLabel lblCenterId_2 = new JLabel("Center ID:");
		lblCenterId_2.setBounds(263, 103, 101, 16);
		frmEditDataInterface.getContentPane().add(lblCenterId_2);

		JLabel lblSpeciesId = new JLabel("Species ID:");
		lblSpeciesId.setBounds(439, 103, 101, 16);
		frmEditDataInterface.getContentPane().add(lblSpeciesId);

		JLabel lblAnimalName = new JLabel("Animal Name:");
		lblAnimalName.setBounds(677, 103, 101, 16);
		frmEditDataInterface.getContentPane().add(lblAnimalName);

		JLabel lblAnimalAge = new JLabel("Animal Age ");
		lblAnimalAge.setBounds(79, 158, 101, 16);
		frmEditDataInterface.getContentPane().add(lblAnimalAge);

		JLabel lblAnimalSex = new JLabel("Animal Sex: ");
		lblAnimalSex.setBounds(263, 158, 101, 16);
		frmEditDataInterface.getContentPane().add(lblAnimalSex);

		JLabel lblDescription = new JLabel("Description: ");
		lblDescription.setBounds(439, 158, 101, 16);
		frmEditDataInterface.getContentPane().add(lblDescription);

		JLabel lblDateArrived = new JLabel("Date Arrived:");
		lblDateArrived.setBounds(677, 155, 101, 16);
		frmEditDataInterface.getContentPane().add(lblDateArrived);

		JLabel lblEmployeeName = new JLabel("Employee Name: ");
		lblEmployeeName.setBounds(394, 271, 101, 16);
		frmEditDataInterface.getContentPane().add(lblEmployeeName);

		JLabel lblEmployeePhone = new JLabel("Employee Phone:");
		lblEmployeePhone.setBounds(626, 271, 101, 16);
		frmEditDataInterface.getContentPane().add(lblEmployeePhone);

		JLabel lblEmployeeSalary = new JLabel("Employee Salary:");
		lblEmployeeSalary.setBounds(122, 319, 101, 16);
		frmEditDataInterface.getContentPane().add(lblEmployeeSalary);

		JLabel lblCenterId_1 = new JLabel("Center ID:");
		lblCenterId_1.setBounds(394, 315, 101, 16);
		frmEditDataInterface.getContentPane().add(lblCenterId_1);

		JLabel lblAdministrator = new JLabel("Administrator: ");
		lblAdministrator.setBounds(626, 320, 101, 16);
		frmEditDataInterface.getContentPane().add(lblAdministrator);

		



		JButton button = new JButton("Back");
		button.setBounds(870, 890, 100, 50);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AnimalInterface.launchUserInterface();
				frmEditDataInterface.dispose();
			}
		});
		frmEditDataInterface.getContentPane().add(button);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 237, 1022, 2);
		frmEditDataInterface.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(-28, 408, 1022, 2);
		frmEditDataInterface.getContentPane().add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(-28, 580, 1022, 2);
		frmEditDataInterface.getContentPane().add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(-12, 755, 1022, 2);
		frmEditDataInterface.getContentPane().add(separator_3);
	}
}
