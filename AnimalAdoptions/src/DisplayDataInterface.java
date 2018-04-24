import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class DisplayDataInterface {
	
	JFrame frmDisplayData;
	JTextArea display;
	JPanel panel = new JPanel();
	
	DisplayDataInterface(){
		initialize();
	}
	
	
	
	

	private void initialize() {
		 JPanel middlePanel = new JPanel ();
		    middlePanel.setBorder( new TitledBorder ( new EtchedBorder (), "Display Area" ) );

		    // create the middle panel components

		    display = new JTextArea ( 16, 58 );
		    display.setEditable ( false ); // set textArea non-editable
		    JScrollPane scroll = new JScrollPane ( display );
		    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

		    //Add Textarea in to middle panel
		    middlePanel.add ( scroll );

		    // My code
		    JFrame frame = new JFrame ();
		    frame.add ( middlePanel );
		    frame.pack ();
		    frame.setLocationRelativeTo ( null );
		    frame.setVisible ( true );		
	}
}
