package hotelmanagement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JList;

public class SearchRoomGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	public SearchRoomGUI() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList<?> list = new JList();
		list.setBounds(50, 25, 500, 400);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setIcon(new ImageIcon("/home/merve/workspace/Software/resources/rsz_motel.jpg"));
		lblNewLabel.setBounds(0, -12, 600, 450);
		getContentPane().add(lblNewLabel);
	}
}