import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class WarningWindow {

	public JFrame frame;
	private String seen;
	private boolean bseen;


	File fi = new File("Settings.txt");


	/**
	 * Create the application.
	 * @throws IOException
	 */
	public WarningWindow() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(700, 400, 616, 204);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		BufferedReader f = new BufferedReader(new FileReader(fi));

		seen = f.readLine();

		f.close();
		if (seen.equals("true")) AnimalInterface.seen = true;
		else AnimalInterface.seen = false;

		JTextArea txtrToEnsureYou = new JTextArea();
		txtrToEnsureYou.setBackground(UIManager.getColor("InternalFrame.minimizeIconBackground"));
		txtrToEnsureYou.setFont(new Font("Calibri", Font.PLAIN, 13));
		txtrToEnsureYou.setText("To ensure you don't encounter any errors, please be sure you have read \r\nthe entire file named \"app instructions\" ");
		txtrToEnsureYou.setBounds(98, 33, 402, 58);
		frame.getContentPane().add(txtrToEnsureYou);

		JCheckBox chckbxDoNotShow = new JCheckBox("Do not show this again");
		chckbxDoNotShow.setBounds(111, 107, 159, 25);
		frame.getContentPane().add(chckbxDoNotShow);

		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxDoNotShow.isSelected()) {
					try {
						PrintWriter fw = new PrintWriter(fi);
						fw.print("true");
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				UserInterface ui = new UserInterface();
				ui.frmAnimalAdoptionApp.setVisible(true);
				frame.dispose();
			}
		});
		btnContinue.setBounds(359, 107, 97, 25);
		frame.getContentPane().add(btnContinue);
	}
}
