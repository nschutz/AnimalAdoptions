import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class EmployeeSearchInterface {

	JFrame frmEmployeeSearch;
	private JTextField CenterID_text;
	private JTextField EmployeeID_text;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public EmployeeSearchInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeeSearch = new JFrame();
		frmEmployeeSearch.setTitle("Employee Search");
		frmEmployeeSearch.setBounds(500, 250, 1000, 500);
		frmEmployeeSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployeeSearch.getContentPane().setLayout(null);

		JButton backButton = new JButton("Back");
		backButton.setBounds(439, 370, 100, 50);
		backButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AnimalInterface.launchUserInterface();
				frmEmployeeSearch.dispose();
			}
		});
		frmEmployeeSearch.getContentPane().add(backButton);

		
		
		
		///////////////////////////////////////////////////////////////////////////////// Get employee salary based on id
		JPanel btnEmplyoeeSalary = new JPanel();
		btnEmplyoeeSalary.setBounds(214, 208, 165, 35);
		frmEmployeeSearch.getContentPane().add(btnEmplyoeeSalary);

		JButton btnEmployeeSalary = new JButton("Get Employee Salary");
		btnEmployeeSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					StoredProcedures.spGetEmployeeSalary(EmployeeID_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnEmplyoeeSalary.add(btnEmployeeSalary);
		
		EmployeeID_text = new JTextField();
		EmployeeID_text.setColumns(10);
		EmployeeID_text.setBounds(270, 156, 116, 22);
		frmEmployeeSearch.getContentPane().add(EmployeeID_text);
		
		JLabel lblEmployeeid = new JLabel("EmployeeName:");
		lblEmployeeid.setBounds(160, 159, 116, 16);
		frmEmployeeSearch.getContentPane().add(lblEmployeeid);
		
		JLabel lblEnterAnEmployee = new JLabel("Enter an employee Name to see their salary.");
		lblEnterAnEmployee.setBounds(173, 99, 250, 16);
		frmEmployeeSearch.getContentPane().add(lblEnterAnEmployee);

		
		
		
		///////////////////////////////////////////////////////////////////////////////// Employees by Center
		JPanel EmployeesByCenterPanel = new JPanel();
		EmployeesByCenterPanel.setBounds(629, 208, 200, 35);
		frmEmployeeSearch.getContentPane().add(EmployeesByCenterPanel);

		JButton btnGetEmployeesByCenter = new JButton("Get Employees By Center");
		btnGetEmployeesByCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					StoredProcedures.spGetEmployeesByCenter(CenterID_text.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		EmployeesByCenterPanel.add(btnGetEmployeesByCenter);

		CenterID_text = new JTextField();
		CenterID_text.setBounds(697, 156, 116, 22);
		frmEmployeeSearch.getContentPane().add(CenterID_text);
		CenterID_text.setColumns(10);

		JLabel lblCenterid = new JLabel("CenterID:");
		lblCenterid.setBounds(629, 159, 56, 16);
		frmEmployeeSearch.getContentPane().add(lblCenterid);


		JLabel lblListEmployeesByCenter = new JLabel("Show all employees at a certain center");
		lblListEmployeesByCenter.setBounds(609, 99, 250, 16);
		frmEmployeeSearch.getContentPane().add(lblListEmployeesByCenter);
		btnGetEmployeesByCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
