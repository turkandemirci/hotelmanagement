package hotelmanagement;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import javax.swing.JLabel;

import javax.swing.JTextField;

public class ReservationGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ReservationGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setTitle("RESERVATION");
	
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(32, 69, 140, 20);
		contentPane.add(lblSurname);
		
		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(32, 99, 140, 20);
		contentPane.add(lblSsn);
		
		JLabel lblNumberOfGuest = new JLabel("Number of Guest");
		lblNumberOfGuest.setBounds(32, 129, 140, 20);
		contentPane.add(lblNumberOfGuest);
		
		JLabel lblCheckinDate = new JLabel("Check-in Date");
		lblCheckinDate.setBounds(32, 189, 140, 20);
		contentPane.add(lblCheckinDate);
		
		JLabel lblCheckoutDate = new JLabel("Check-out Date");
		lblCheckoutDate.setBounds(350, 189, 140, 25);
		contentPane.add(lblCheckoutDate);
		
		JLabel lblReservationDetail = new JLabel("Reservation Detail");
		lblReservationDetail.setBounds(32, 159, 140, 20);
		contentPane.add(lblReservationDetail);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(32, 39, 140, 20);
		contentPane.add(lblName);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(32, 241, 200, 140);
		contentPane.add(calendar);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(350, 241, 200, 140);
		contentPane.add(calendar_1);
		
		textField = new JTextField();
		textField.setBounds(204, 39, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(204, 69, 200, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(204, 99, 200, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(204, 129, 200, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(204, 159, 200, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(32, 403, 140, 20);
		contentPane.add(lblAmount);
		
		textField_5 = new JTextField();
		textField_5.setBounds(168, 403, 200, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setForeground(Color.BLUE);
		btnSave.setBounds(448, 400, 117, 25);
		contentPane.add(btnSave);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setIcon(new ImageIcon("/home/turkandemirci/rsz_motel.jpg"));
		lblNewLabel.setBounds(0, -12, 600, 450);
		getContentPane().add(lblNewLabel);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 try {
					Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement?useSSL=false","root","Turkan*94");
					String value1=textField.getText();
			        String value2=textField_1.getText();
			        String value3=textField_2.getText();
			        String value4=textField_3.getText();
			        String value5=textField_4 .getText();
				    String value6=textField_5.getText();
				 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
				}
				
			
		});

		
	
	}
}